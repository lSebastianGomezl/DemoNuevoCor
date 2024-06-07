package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class GuardarEmpresasGestionEmpresas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> datos = new ArrayList<>();
        int registro = 2;
        int nombreEmpresa = 2; //posición de la columna NOMBRE EMPRESA
        int accionActivo = 9; //posición de la columna ACCION
        int numeroPaginador = 1;
        String diferenciadorActivoInactivo = "color-4";
        while (ContenedorDeObjetosGestionDistribuidor.NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador)).resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador))));
            registro=2;
            while(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA.of(String.valueOf(registro),String.valueOf(nombreEmpresa)).resolveFor(actor).isVisible()){
                String color = String.valueOf(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_ACTIVA.of(String.valueOf(registro),String.valueOf(accionActivo)).resolveFor(actor).getAttribute("class"));
                if(color.contains(diferenciadorActivoInactivo)){
                    System.out.println(String.valueOf(Text.of(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA.of(String.valueOf(registro),String.valueOf(nombreEmpresa))).answeredBy(actor)));
                    datos.add(String.valueOf(Text.of(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA.of(String.valueOf(registro),String.valueOf(nombreEmpresa))).answeredBy(actor)));
                }
                registro++;
            }
            numeroPaginador++;
        }
        actor.remember("empresasGuardadas",datos);
    }
    public static GuardarEmpresasGestionEmpresas guardar(){
        return Tasks.instrumented(GuardarEmpresasGestionEmpresas.class);
    }
}

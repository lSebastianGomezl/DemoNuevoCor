package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class GuardarEmpresasGestionEmpresarial implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> datos = new ArrayList<>();
        int registro;
        int nombreEmpresa = 3; //posición de la columna NOMBRE DE LA EMPRESA
        int accionActivo = 6; //posición de la columna ACCIONES
        int numeroPaginador = 1;
        String diferenciadorActivoInactivo = "color-20";
        while (ContenedorDeObjetosGestionarComercializador.NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador)).resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador))));
            registro = 2;
            while (ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombreEmpresa)).resolveFor(actor).isVisible()) {
                String color = String.valueOf(ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(accionActivo)).resolveFor(actor).getAttribute("class"));
                if (color.contains(diferenciadorActivoInactivo)) {
                    System.out.println(String.valueOf(Text.of(ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombreEmpresa))).answeredBy(actor)));
                    datos.add(String.valueOf(Text.of(ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombreEmpresa))).answeredBy(actor)));
                }
                registro++;
            }
            numeroPaginador++;
        }
        actor.remember("campoEmpresasGuardado", datos);
    }

    public static GuardarEmpresasGestionEmpresarial guardar() {
        return Tasks.instrumented(GuardarEmpresasGestionEmpresarial.class);
    }
}

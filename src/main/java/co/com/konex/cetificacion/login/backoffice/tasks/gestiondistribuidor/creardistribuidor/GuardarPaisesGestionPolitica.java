package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.*;

public class GuardarPaisesGestionPolitica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> datos = new ArrayList<>();
        int registro;
        int nombrePais = 3; //posición de la columna NOMBRE PAIS
        int accionActivo = 4; //posición de la columna ACCIONES
        int numeroPaginador = 1;
        String diferenciadorActivoInactivo = "color-verde";
        while (NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador)).resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(NUMERO_PAGINADOR.of(String.valueOf(numeroPaginador))));
            registro = 2;
            while (RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombrePais)).resolveFor(actor).isVisible()) {
                String color = String.valueOf(RESULTADO_CONSULTA_ACTIVA.of(String.valueOf(registro), String.valueOf(accionActivo)).resolveFor(actor).getAttribute("class"));
                if (color.contains(diferenciadorActivoInactivo)) {
                    System.out.println(String.valueOf(Text.of(RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombrePais))).answeredBy(actor)));
                    datos.add(String.valueOf(Text.of(RESULTADO_CONSULTA.of(String.valueOf(registro), String.valueOf(nombrePais))).answeredBy(actor)));
                }
                registro++;
            }
            numeroPaginador++;
        }
        actor.remember("campoPaisesGuardado", datos);
    }

    public static GuardarPaisesGestionPolitica guardar() {
        return Tasks.instrumented(GuardarPaisesGestionPolitica.class);
    }
}

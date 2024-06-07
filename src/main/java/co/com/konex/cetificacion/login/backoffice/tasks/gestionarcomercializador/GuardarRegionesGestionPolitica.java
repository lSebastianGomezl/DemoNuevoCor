package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class GuardarRegionesGestionPolitica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> datos = new ArrayList<>();
        int registro = 1;
        while (ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA_REGION.of(String.valueOf(registro)).resolveFor(actor).isVisible()) {
            System.out.println(String.valueOf(Text.of(ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA_REGION.of(String.valueOf(registro))).answeredBy(actor)));
            datos.add(String.valueOf(Text.of(ContenedorDeObjetosGestionarComercializador.RESULTADO_CONSULTA_REGION.of(String.valueOf(registro))).answeredBy(actor)));
            registro++;
        }
        actor.remember("campoRegionesGuardadas", datos);
    }

    public static GuardarRegionesGestionPolitica guardar() {
        return Tasks.instrumented(GuardarRegionesGestionPolitica.class);
    }
}

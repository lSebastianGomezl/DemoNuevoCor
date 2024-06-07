package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresoRutaGestionPolitica implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionarComercializador.MODULO_GESTION_COMERCIAL),
                Click.on(ContenedorDeObjetosGestionarComercializador.SUB_MODULO_GESTION_POLITICA)
        );
    }
    public static IngresoRutaGestionPolitica gestionPolitica() {
        return Tasks.instrumented(IngresoRutaGestionPolitica.class);
    }
}

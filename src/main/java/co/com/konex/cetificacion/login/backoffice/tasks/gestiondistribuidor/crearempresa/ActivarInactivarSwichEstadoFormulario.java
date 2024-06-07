package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ActivarInactivarSwichEstadoFormulario implements Task {
    public static ActivarInactivarSwichEstadoFormulario activarInactivarRegistro() {
        return Tasks.instrumented(ActivarInactivarSwichEstadoFormulario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ContenedorDeObjetosGestionDistribuidor.SWITCH_ESTADO),
                Click.on(ContenedorDeObjetosGestionDistribuidor.SWITCH_ESTADO));
    }
}

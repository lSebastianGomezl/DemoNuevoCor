package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SeleccionarBtnSiVentConf implements Task {
    public static SeleccionarBtnSiVentConf siEnVentanaDeConfirmacion() {
        return Tasks.instrumented(SeleccionarBtnSiVentConf.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_SI_VENT_CONFIR));
    }
}

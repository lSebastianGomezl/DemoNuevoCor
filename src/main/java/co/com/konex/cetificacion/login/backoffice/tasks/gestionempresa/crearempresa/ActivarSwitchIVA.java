package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ActivarSwitchIVA implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ContenedorDeObjetosGestionEmpresa.SWITCH_APLICA_COMO_DISTRIBUIDOR),
                Click.on(ContenedorDeObjetosGestionEmpresa.SWITCH_IVA));
    }
    public static ActivarSwitchIVA activacionSwich() {
        return Tasks.instrumented(ActivarSwitchIVA.class);
    }
}

package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ActivarSwichAplicaComoComercializador implements Task {

    public static ActivarSwichAplicaComoComercializador activacionSwich() {
        return Tasks.instrumented(ActivarSwichAplicaComoComercializador.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ContenedorDeObjetosGestionEmpresa.SWITCH_APLICA_COMO_COMERCIALIZADOR),
                Click.on(ContenedorDeObjetosGestionEmpresa.SWITCH_APLICA_COMO_COMERCIALIZADOR));
    }
}

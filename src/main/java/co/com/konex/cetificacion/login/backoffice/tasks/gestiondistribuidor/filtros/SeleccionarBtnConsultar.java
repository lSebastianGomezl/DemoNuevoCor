package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBtnConsultar implements Task {
    public static SeleccionarBtnConsultar btnConsultar() {

        return Tasks.instrumented(SeleccionarBtnConsultar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_FILTRAR)
        );
    }

}

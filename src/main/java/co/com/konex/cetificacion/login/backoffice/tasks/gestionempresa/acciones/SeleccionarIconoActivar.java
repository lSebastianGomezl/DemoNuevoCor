package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarIconoActivar implements Task {
    public static SeleccionarIconoActivar activarEmpresa() {

        return Tasks.instrumented(SeleccionarIconoActivar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.OPC_ACT_EMPRESA)
        );
    }

}

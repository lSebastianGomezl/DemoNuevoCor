package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcInactivar implements Task {
    public static SeleccionarOpcInactivar inactivarEmpresa() {
        return Tasks.instrumented(SeleccionarOpcInactivar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.OPC_INACTIVAR_EMPRESA)
        );
    }

}

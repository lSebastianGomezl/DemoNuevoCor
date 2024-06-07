package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcEditar implements Task {
    public static SeleccionarOpcEditar editarDatosEmpresa() {
        return Tasks.instrumented(SeleccionarOpcEditar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.OPC_EDITAR_EMPRESA_ACCION)
        );
    }

}

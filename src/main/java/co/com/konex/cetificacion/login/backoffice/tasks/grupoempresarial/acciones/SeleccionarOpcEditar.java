package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcEditar implements Task {
    public static SeleccionarOpcEditar editarDatosGrupoEmpresarial() {
        return Tasks.instrumented(SeleccionarOpcEditar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.OPC_EDITAR_GRUPO_EMPRESARIAL)
        );
    }

}

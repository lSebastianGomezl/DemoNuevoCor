package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial.ActivarSwitchEstado;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InactivarSwitchEstado implements Task {
    public static InactivarSwitchEstado inactivarRegistroDeGrupoEmpresarial() {
        return Tasks.instrumented(InactivarSwitchEstado.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.INACTIVAR_SWITCH_ESTADO),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_EDITAR_GRUPO_EMPRESARIAL));

    }
}

package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarCrearGrupoEmpresarial implements Task {
    public static SeleccionarCrearGrupoEmpresarial crearGrupoEmpresarial() {
        return Tasks.instrumented(SeleccionarCrearGrupoEmpresarial.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.OP_CREAR_GRUPO_EMPRESAL)
                );
    }
}

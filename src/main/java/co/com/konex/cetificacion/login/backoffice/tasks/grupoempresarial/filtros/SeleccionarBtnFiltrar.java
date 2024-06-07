package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBtnFiltrar implements Task {
    public static SeleccionarBtnFiltrar btnFiltrar() {
        return Tasks.instrumented(SeleccionarBtnFiltrar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_FILTRAR)
        );
    }

}

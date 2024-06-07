package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonVerFiltros implements Task {
    public static SeleccionarBotonVerFiltros panelDeFiltros() {
        return Tasks.instrumented(SeleccionarBotonVerFiltros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_VER_FILTROS));
    }
}

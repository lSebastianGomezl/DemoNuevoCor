package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.pantallainicio;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonVerFiltros implements Task {
    public static SeleccionarBotonVerFiltros desplegarPanelDeFiltros() {
        return Tasks.instrumented(SeleccionarBotonVerFiltros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.BTN_VER_FILTROS));
    }

}

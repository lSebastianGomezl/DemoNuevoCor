package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarNoDistribuidorFiltro implements Task {
    public static SeleccionarNoDistribuidorFiltro opcionNoDistribuidor() {

        return Tasks.instrumented(SeleccionarNoDistribuidorFiltro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_DISTRIBUIDOR),
                Click.on(ContenedorDeObjetosGestionEmpresa.OPC_NO_DISTRIBUIDOR_FILTRO)
        );
    }

}

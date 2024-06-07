package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarSiComercializadorFiltro implements Task {
    public static SeleccionarSiComercializadorFiltro opcionSiComercializador() {

        return Tasks.instrumented(SeleccionarSiComercializadorFiltro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                Click.on(ContenedorDeObjetosGestionEmpresa.OPC_SI_CPMERCIALIZADOR_FILTRO)
        );
    }

}

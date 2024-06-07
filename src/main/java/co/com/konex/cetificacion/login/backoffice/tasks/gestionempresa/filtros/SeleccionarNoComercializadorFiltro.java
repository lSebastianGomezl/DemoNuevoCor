package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarNoComercializadorFiltro implements Task {
    public static SeleccionarNoComercializadorFiltro opcionNoComercializador() {

        return Tasks.instrumented(SeleccionarNoComercializadorFiltro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                Click.on(ContenedorDeObjetosGestionEmpresa.OPC_NO_CPMERCIALIZADOR_FILTRO)
        );
    }

}

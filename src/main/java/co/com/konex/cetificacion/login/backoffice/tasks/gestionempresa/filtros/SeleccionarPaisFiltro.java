package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarPaisFiltro implements Task {

    private TablaDeDatosFiltros tablaDeDatosFiltros;
    public SeleccionarPaisFiltro(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }

    public static SeleccionarPaisFiltro seleccionPaisDeLista(TablaDeDatosFiltros tablaDeDatosFiltros) {
        return Tasks.instrumented(SeleccionarPaisFiltro.class, tablaDeDatosFiltros );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS),
                Click.on(ConstruirXpathGestionEmpresas.PAIS(tablaDeDatosFiltros.getPais())));
    }
}

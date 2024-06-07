package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFiltroComercializador implements Task {

    private TablaDeDatosFiltros tablaDeDatosFiltros;
    public SeleccionarFiltroComercializador(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }

    public static SeleccionarFiltroComercializador seleccionOpcionComercializadorDeLista(TablaDeDatosFiltros tablaDeDatosFiltros) {
        return Tasks.instrumented(SeleccionarFiltroComercializador.class, tablaDeDatosFiltros );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                Click.on(ConstruirXpathGestionEmpresas.COMERCIALIZADOR(tablaDeDatosFiltros.getComercializador())));
    }
}

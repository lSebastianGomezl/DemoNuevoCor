package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNit implements Task {
    private TablaDeDatosFiltros tablaDeDatosFiltros;
    public IngresarNit(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }
    public static IngresarNit ingresarNitEnCampoFiltro(TablaDeDatosFiltros tablaDeDatosFiltros) {
        return Tasks.instrumented(IngresarNit.class, tablaDeDatosFiltros );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaDeDatosFiltros.getNit()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NIT_FILTRO));
    }


}

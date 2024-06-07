package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombre implements Task {
    private TablaDeDatosFiltros tablaDeDatosFiltros;
    public IngresarNombre(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }
    public static IngresarNombre ingresarNombreEnCampoFiltro(TablaDeDatosFiltros tablaDeDatosFiltros) {
        return Tasks.instrumented(IngresarNombre.class, tablaDeDatosFiltros );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaDeDatosFiltros.getNombreOCodigo()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NOMBRE_FILTRO));
    }

}

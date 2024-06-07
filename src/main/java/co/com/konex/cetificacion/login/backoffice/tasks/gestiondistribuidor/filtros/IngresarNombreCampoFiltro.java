package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TablaDeDatosFiltro;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombreCampoFiltro implements Task {
    private TablaDeDatosFiltro tablaDeDatosFiltro;
    public IngresarNombreCampoFiltro(TablaDeDatosFiltro tablaDeDatosFiltro){
        this.tablaDeDatosFiltro = tablaDeDatosFiltro;
    }
    public static IngresarNombreCampoFiltro nombreFiltro(TablaDeDatosFiltro tablaDeDatosFiltro) {
        return Tasks.instrumented(IngresarNombreCampoFiltro.class, tablaDeDatosFiltro );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaDeDatosFiltro.getNombre()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FILTRO));
    }

}

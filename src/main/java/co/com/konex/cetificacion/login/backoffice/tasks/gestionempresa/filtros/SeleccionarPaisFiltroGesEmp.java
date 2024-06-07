package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarPaisFiltroGesEmp implements Task {

    private TablaDeDatosFiltros tablaDeDatosFiltros;
    public SeleccionarPaisFiltroGesEmp(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }

    public static SeleccionarPaisFiltroGesEmp seleccionPaisDeLista(TablaDeDatosFiltros tablaDeDatosFiltros) {
        return Tasks.instrumented(SeleccionarPaisFiltroGesEmp.class, tablaDeDatosFiltros );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS_FILTRO, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS_FILTRO),
                Click.on(ConstruirXpathGestionEmpresas.PAIS(tablaDeDatosFiltros.getPais())));
    }
}

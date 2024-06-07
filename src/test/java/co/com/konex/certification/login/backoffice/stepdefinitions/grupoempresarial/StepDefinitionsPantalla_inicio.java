package co.com.konex.certification.login.backoffice.stepdefinitions.grupoempresarial;

import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial.ValidarColumnasFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial.ValidarDesplieguePanelDeFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial.ValidarOcultarPanelDeFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial.ValidarPantallaModulo;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.pantallainicial.IngresarModuloGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.pantallainicial.SeleccionarBotonVerFiltros;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.junit.Before;

import java.util.List;
import java.util.Map;

public class StepDefinitionsPantalla_inicio {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("tipoDocumento"), entry.get("usuario"), entry.get("contrasenna"));
    }

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("ingresa a la ruta Administración_Multinivel_GrupoEmpresarial")
    public void ingresaALaRutaAdministración_Multinivel_GrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloGrupoEmpresarial.grupoEmpresarial());
    }
    @Entonces("el sistema muestra la pantalla inicial de grupo empresarial")
    public void elSistemaMuestraLaPantallaInicialDeGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaModulo.textoModulo(), Matchers.equalTo("Gestión Grupo Empresarial")));

    }

    @Y("da clic en el boton Ver filtros para ocultar el panel de filtros")
    public void daClicEnElBotonVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.panelDeFiltros());

    }
    @Entonces("el sistema oculta el panel de filtro grupo empresarial")
    public void elSistemaOcultaElPanelDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarOcultarPanelDeFiltro.panelDeFiltroOculto(), Matchers.equalTo("Crear grupo empresarial")));

    }


    @Y("el usuario vuelve a dar clic en el boton Ver filtros grupo empresarial")
    public void elUsuarioVuelveADarClicEnElBotonVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.panelDeFiltros());

    }
    @Entonces("el sistema despliega el panel de filtros grupo empresarial")
    public void elSistemaDespliegaElPanelDeFiltros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDesplieguePanelDeFiltro.panelDeFiltroDesplegado(), Matchers.equalTo("Filtrar")));

    }


    @Entonces("el sistema muestra una tabla con las columnas")
    public void elSistemaMuestraUnaTablaConLasColumnas(DataTable tabla) {
        List<Map<String, String>> datos = tabla.asMaps(String.class, String.class);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarColumnasFiltro.columnasFiltro(datos), Matchers.is(true)));
    }
}

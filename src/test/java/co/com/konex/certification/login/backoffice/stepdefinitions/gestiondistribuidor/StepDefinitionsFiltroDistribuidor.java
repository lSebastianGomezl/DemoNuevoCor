package co.com.konex.certification.login.backoffice.stepdefinitions.gestiondistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TablaDeDatosFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.IngresarNitCampoFiltro;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros.IngresarNombreCampoFiltro;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros.SeleccionarBtnConsultar;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros.SeleccionarBtnLimpiar;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StepDefinitionsFiltroDistribuidor {
    @DataTableType
    public TablaDeDatosFiltro tablaDeDatosFiltro(Map<String, String> entry) {
        return new TablaDeDatosFiltro(entry.get("nombre"), entry.get("NIT"));
    }


    @Y("da clic en el boton Consultar")
    public void daClicEnElBotonConsultar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnConsultar.btnConsultar());
    }


    @Entonces("el sistema muestra todos los distribuidores creados enlistados en una tabla con su respectiva informacion")
    public void elSistemaMuestraTodosLosDistribuidoresCreadosEnlistadosEnUnaTablaConSuRespectivaInformacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarListadoDeDistribuidores.listaDeDistribuidoresAlFiltrar()));
    }

    @Y("el ususario ingresa datos no existentes en los campos de filtro")
    public void elUsusarioIngresaDatosNoExistentesEnLosCamposDeFiltro(List<TablaDeDatosFiltro> tablaDeDatosFiltro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFiltro.nitFiltro(tablaDeDatosFiltro.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFiltro.nombreFiltro(tablaDeDatosFiltro.get(0)));

    }

    @Entonces("el sistema mostrara el respectivo mensaje")
    public void elSistemaMostraraElRespectivoMensaje() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjSinResultEncontrados.msjFiltroSinresultados(), Matchers.equalTo("No se encontraron DISTRIBUIDORES CONFIGURADOS")));
    }

    @Y("El usuario diligencia el campo de filtro con un NIT existente")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistente(List<TablaDeDatosFiltro> tablaDeDatosFiltro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFiltro.nitFiltro(tablaDeDatosFiltro.get(0)));
    }

    @Entonces("el sistema valida el NIT ingresado y muestra el distribuidor con ese NIT asociado")
    public void elSistemaValidaElNITIngresadoYMuestraElDistribuidorConEseNITAsociado(List<String> NIT) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultFiltroPorNit.filtroPorNit(), Matchers.equalTo(NIT.get(1))));

    }

    @Y("El usuario diligencia el campo de filtro con un Nombre de distribuidor existente")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNombreDeDistribuidorExistente(List<TablaDeDatosFiltro> tablaDeDatosFiltro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFiltro.nombreFiltro(tablaDeDatosFiltro.get(0)));

    }

    @Entonces("el sistema valida el nombre ingresado y muestra los registros de distribuidores con ese nombre asociado")
    public void elSistemaValidaElNombreIngresadoYMuestraLosRegistrosDeDistribuidoresConEseNombreAsociado(List<String> nombre) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultFiltroPorNombre.filtroPorNombre(), Matchers.equalTo(nombre.get(1))));

    }

    @Y("el ususario diliegncia los campos de filtro")
    public void elUsusarioDiliegnciaLosCamposDeFiltro(List<TablaDeDatosFiltro> tablaDeDatosFiltro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFiltro.nitFiltro(tablaDeDatosFiltro.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFiltro.nombreFiltro(tablaDeDatosFiltro.get(0)));

    }

    @Entonces("el sistema valida los datos ingresados y muestra el distribuidor con esos datos asociados")
    public void elSistemaValidaLosDatosIngresadosYMuestraElDistribuidorConEsosDatosAsociados(TablaDeDatosFiltro tablaDeDatosFiltro) {
        Question<Boolean> validacionComponentesQuestion = ValidarResultFiltroPorNomYNit.verResultDeRegistro(tablaDeDatosFiltro);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacionComponentesQuestion));
    }

    @Y("El usuario selecciona el boton limpiar")
    public void elUsuarioSeleccionaElBotonLimpiar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnLimpiar.btnLimpiar());
    }

    @Entonces("el sistema limpia todos los campos diligenciados")
    public void elSistemaLimpiaTodosLosCamposDiligenciados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLimpiarCampos.limpiarCamposDeFiltro(), Matchers.equalTo("")));

    }

    @Entonces("^el sistema muestra en filtros gestion distribuidor el campo (.*) con (.*)$")
    public void elSistemaMuestraEnFiltrosGestionDistribuidorElCampoNITConNIT(String datoCampo, String campo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultadoFiltroGestionDistribuidor.resultadosConsulta_(datoCampo, campo)));
    }
}

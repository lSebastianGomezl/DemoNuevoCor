package co.com.konex.certification.login.backoffice.stepdefinitions.grupoempresarial;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros.*;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros.IngresarNit;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros.IngresarNombre;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros.SeleccionarBtnFiltrar;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros.SeleccionarBtnLimpiar;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class StepDefinitionsFiltros {
    @Y("le da clic en el boton filtar")
    public void daClicEnElBotonFiltar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnFiltrar.btnFiltrar());
    }

    @Entonces("el sistema mostrara todas los grupos empresariales creados enlistados en una tabla con su respectiva informacion")
    public void elSistemaMostraraTodasLosGruposEmpresarialesCreadosEnlistadosEnUnaTablaConSuRespectivaInformacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarListadoGrupoEmpresarial.listaDeGruposEmpresarialesAlFiltrar()));

    }

    @Y("el usuario ingresa datos en los campos de filtro")
    public void elUsuarioIngresaDatosEnLosCamposDeFiltro(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaGrupoEmpresarial.get(0)));

    }

    @Entonces("el sistema mostrara el respectivo mensaje grupo empresarial")
    public void elSistemaMostraraElRespectivoMensaje() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensajeFiltro.msjFiltroSinresultados(), Matchers.equalTo("No se encontraron GRUPOS EMPRESARIALES CONFIGURADOS")));
    }

    @Y("El usuario diligencia el campo de filtro con un NIT existente grupo empresarial")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistente(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
    }

    @Entonces("el sistema valida el NIT ingresado y muestra el grupo empresarial con ese NIT asociado")
    public void elSistemaValidaElNITIngresadoYMuestraElGrupoEmpresarialConEseNITAsociado(List<String> Nit) {
        String nit = OnStage.theActorInTheSpotlight().recall("nitGenerado");
        System.out.println(nit);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltroConNit.resultadosFiltroConNit(), Matchers.equalTo(nit)));
    }

    @Y("El usuario diligencia el campo de filtro con el Nombre de grupo empresarial existente")
    public void elUsuarioDiligenciaElCampoDeFiltroConElNombreDeGrupoEmpresarialExistente(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
    }

    @Entonces("el sistema valida el nombre ingresado y muestra los grupos empresariales con ese nombre asociado")
    public void elSistemaValidaElNombreIngresadoYMuestraLosGruposEmpresarialesConEseNombreAsociado() {
        String razonSocial = OnStage.theActorInTheSpotlight().recall("razonSocial");
        System.out.println(razonSocial);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltroConNombre.resultadosFiltroConNombre(), Matchers.equalTo(razonSocial)));
    }


    @Y("el usuario diligencia los campos de filtro")
    public void elUsuarioDiligenciaLosCamposDeFiltro(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
    }

    @Y("El usuario selecciona el boton limpiar grupo empresarial")
    public void elUsuarioSeleccionaElBotonLimpiar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnLimpiar.limpiarCampos());

    }

    @Entonces("el sistema valida los datos ingresados y muestra el grupo empresarial con esos datos asociados")
    public void elSistemaValidaLosDatosIngresadosYMuestraElGrupoEmpresarialConEsosDatosAsociados(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        Question<Boolean> validacionComponentesQuestion = ValidarResultadosFiltroPorNomYNit.verResultDeFiltro(tablaGrupoEmpresarial);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacionComponentesQuestion));
    }

    @Entonces("el sistema limpia todos los campos diligenciados grupo empresarial")
    public void elSistemaLimpiaTodosLosCamposDiligenciados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLimpiarCampoNit.limpiarCamposNitDeFiltro(), Matchers.equalTo("")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLimpiarCampoNombre.limpiarCampoNombreFiltro(), Matchers.equalTo("")));


    }

    @Y("el usuario da clic en el boton filtar grupo empresarial")
    public void elUsuarioDaClicEnElBotonFiltarGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_FILTRAR));
    }

    @Dado("Caso manual")
    public void casoManual() {

    }
}






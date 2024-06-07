package co.com.konex.certification.login.backoffice.stepdefinitions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblFiltrosGC;
import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblInicioGC;
import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FiltrosStepDefinitions {

    @DataTableType
    public TblFiltrosGC tablaFiltrosGestionComercializador(Map<String, String> dataTable) {
        return new TblFiltrosGC(
                dataTable.get("tdAsociadoA"),
                dataTable.get("tdNIT"),
                dataTable.get("tdCodigo"),
                dataTable.get("tdPais"),
                dataTable.get("tdDepartamento"),
                dataTable.get("tdCiudad"),
                dataTable.get("tdDireccion"),
                dataTable.get("tdDominio"),
                dataTable.get("tdEstado"),
                dataTable.get("tdAcciones"));
    }

    @Before
    public void iniciarEscenario() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Y("el usuario da click en el boton Filtrar")
    public void daClicEnFiltrar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBotonFiltrar.btnFiltrar());

    }

    //@CP5764
    @Entonces("el sistema muestra una tabla con las comercializadoras")
    public void elSistemaMuestraUnaTablaConLasComercializadoras(TblFiltrosGC tablaFiltrosGestonComercializador) {
        Question<Boolean> validacionComponentesFiltros = ValidarElementosTablaFiltros.tablaFiltro(tablaFiltrosGestonComercializador);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacionComponentesFiltros));
    }

    //@CP5766
    @Y("diligencia el filtro NIT")
    public void diligenciaElFiltroNIT(List<TblInicioGC> tablaInicioGestionarComercializador) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFiltroNIT.filtroNIT(tablaInicioGestionarComercializador.get(0)));
    }

    @Entonces("^el sistema trae el el registro que coincida (.*)$")
    public void elSistemaTraeElElRegistroQueCoincida(String nit) {
        if(nit.equals("guardado")){
            String nitGuardado = OnStage.theActorInTheSpotlight().recall("nitGeneradoCrearEmpresa");
            OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nitGuardado)));
        }else{
            OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nit)));
        }
    }
    @Entonces("^el sistema trae el el registro distribuidor que coincida (.*)$")
    public void elSistemaTraeElRegistroComercializadorQueCoincida(String nit) {
        if(nit.equals("guardado")){
            String nitGuardado = OnStage.theActorInTheSpotlight().recall("nitGeneradoCrearEmpresa");
            OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nitGuardado)));
        }else{
            OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nit)));
        }

    }

    //CP5768
    @Y("diligencia el filtro nombre comercializador")
    public void diligenciaElFiltroNombreComercializador(List<TblInicioGC> tablaInicioGestionarComercializador) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFiltroNombre.filtroNombre(tablaInicioGestionarComercializador.get(0)));

    }

    @Entonces("^el sistema muestra el el registro que coincida con el nombre (.*)$")
    public void elSistemaMuestraElElRegistroQueCoincidaConElNombre(String nombre) {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarNombreBuscado.filtroConNombre()), Matchers.equalTo(nombre)));
        System.out.println("El nombre de la comercializadora buscada es: " + nombre);

    }

    //CP5769
    @Entonces("^el sistema trae los registros que coincidan con lo buscado en (.*) y (.*)$")
    public void elSistemaTraeElRegistroQueCoincidaConLoBuscado(String nit, String nombre) {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nit)));
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarNombreBuscado.filtroConNombre()), Matchers.equalTo(nombre)));
        System.out.println("El NIT buscado es: " + nit);
        System.out.println("El nombre de la comercializadora buscada es: " + nombre);
    }

    //CP5767
    @Entonces("el sistema muestra mensaje erroneo")
    public void elSistemaMuestraMensajeErroneo(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorFiltros.mensajeErrorFiltros(), Matchers.equalTo(msjError.get(1))));
        String mensaje = ContenedorDeObjetosGestionarComercializador.MSJ_ERROR_FILTRO.resolveFor(OnStage.theActorInTheSpotlight()).getText();
        System.out.println("El mensaje de error es: " + mensaje);
    }

    //CP5765
    @Entonces("el usuario da clic en el botón Limpiar")
    public void elUsarioDaClicEnElBotonLimpiar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBotonLimpiarFiltros.botonLimpiarFiltros());
    }

    //@CP5773ACTIVARBTNSI
    @Y("da clic en activar")
    public void daClicEnActivar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearIconoActivar.iconoActivar());
    }

    @Y("da clic en Si activar")
    public void daClicEnSiActivar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnSiActivar.iconoActivar());

    }

    @Y("el sistema muestra mensaje exitoso al activar comercializador")
    public void elSistemaMuestraMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarMensajeExitosoActivar.activar()), Matchers.equalTo("Se ha activado exitosamente el registro con el código 48 - Comercializador Aguachica")));

    }

    //@CP5773ACTIVARBTNNO
    @Y("da clic en No activar")
    public void daClicEnNoActivar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnNoActivar.iconoActivar());

    }

    @Y("el sistema muestra la ventana de confirmacion de activar")
    public void elSistemaMuestraVentanaDeConfirmacionActivar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVentanaActivarComercializador.activarInactivarComercializador()));
        String mensaje = ContenedorDeObjetosGestionarComercializador.VENTANA_CONFIRMACION.resolveFor(OnStage.theActorInTheSpotlight()).getText();
        System.out.println("Se muestra la ventana de confirmación con el mensaje: " + mensaje);

    }

    //CP5774BTNSI
    @Y("el usuario da clic en cambiar estado")
    public void elUsuarioDaClicEnCambiarEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearIconoInactivar.iconoInactivar());
    }

    @Y("el usuario da clic en Si cambiar estado")
    public void elUsuarioDaClicEnSiCambiarEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnSiInactivar.iconoInactivar());

    }

    @Entonces("el sistema muestra mensaje exitoso al inactivar comercializador")
    public void elSistemaMuestraMensajeExitosoAlInactivarComercializador() {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarMensajeExitosoInactivar.inactivar()), Matchers.equalTo("Se ha inactivado exitosamente el registro con el código 48 - Comercializador Aguachica")));

    }

    //CP5774BTNNO
    @Y("el usuario da clic en No cambiar estado")
    public void daClicEnNoCambiarEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnNoInactivar.iconoInactivar());
    }

    //CP5775EDITARBTNSI
    @Y("el usuario da clic en editar")
    public void elUsuarioDaClicEnEditar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearIconoEditar.iconoEditar());
    }

    @Y("da clic en Si editar")
    public void daClicEnSiEditar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnSiEditar.iconoEditar());
    }

    @Entonces("el sistema muestra mensaje de confirmación")
    public void elSistemaMuestraMensajeDeConfirmación() {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarMensajeExitosoEditar.editarComercilizador()), Matchers.equalTo("Se ha editado exitosamente el registro con el código 48 - Comercializador Aguachica.")));
    }

    //CP5775EDITARBTNNO
    @Y("da clic en No editar")
    public void daClicEnNoEditar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnNoEditar.iconoEditar());

    }

    @Entonces("el sistema cierra la confirmación")
    public void elSistemaCierraLaConfirmación() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVentanaEditarComercializador.editarComercializador()));

    }

    //CP5778
    @Y("el usuario da clic en Salir")
    public void elUsuarioDaClicEnSalir() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBtnSalirEditar.salirEditar());

    }


    @Y("da clic en editar comercializador")
    public void daClicEnEditarComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearEditarComercializador.editarComercializador());

    }


    @Y("el usuario da clic en Si en la ventana de confirmación")
    public void elUsuarioDaClicEnSiEnLaVentanaDeConfirmación() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickSiVntConfirmacion.salirEditar());

    }

    @Entonces("^el sistema se redirige a la pantalla de filtros y muestra el nit (.*)$")
    public void elSistemaSeRedirigeALaPantallaDeFiltros(String nit) {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarNITBuscado.filtroConNIT()), Matchers.equalTo(nit)));
        System.out.println("El NIT buscado es: " + nit);

    }

    @Y("el usuario modifca datos del registro")
    public void elUsuarioModifcaDatosDelRegistro(List<TblCrearComerci> tblCrearComerci) {
        OnStage.theActorInTheSpotlight().attemptsTo(ModificarFormularioComercializador.gestionComercializador(tblCrearComerci.get(0)));
    }

    @Entonces("el sistema no permite editar el campo NIT")
    public void elSistemaNoPermiteEditarElCampoNIT() {
        String campoNit = ContenedorDeObjetosGestionarComercializador.INPUT_NIT.resolveFor(OnStage.theActorInTheSpotlight()).getValue();
        System.out.println("El contenido del campo es: " + campoNit);
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarEditarElemento.delElemento(ContenedorDeObjetosGestionarComercializador.INPUT_NIT)));

    }
}

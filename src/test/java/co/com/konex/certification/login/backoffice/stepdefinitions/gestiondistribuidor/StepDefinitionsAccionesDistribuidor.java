package co.com.konex.certification.login.backoffice.stepdefinitions.gestiondistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TablaDeDatosFiltro;
import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones.*;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial.ValidarElementosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial.ValidarPantallaInicial;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.acciones.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.IngresarNitCampoFiltro;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros.IngresarNombreCampoFiltro;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.filtros.SeleccionarBtnFiltrar;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosCrearLoteriaOSorteos;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.ALERTA_CREACION_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StepDefinitionsAccionesDistribuidor {

    @Y("pasa el cursor sobre el icono editar distribuidor")
    public void pasaElCursorSobreElIconoEditarDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(CursorIconoEditarDistribuidor.editarDistribuidor());
    }

    @Entonces("el sistema valida el tooltip mostrado")
    public void elSistemaValidaElTooltipMostrado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTextoTootip.textoTooltipIconoEditar(), Matchers.equalTo("Editar Comercializador")));


    }

    @Y("El usuario diligencie los campos de fitro que desee y seleccione el boton filtrar")
    public void elUsuarioDiligencieLosCamposDeFitroQueDeseeYSeleccioneElBotonFiltrar(List<TablaDeDatosFiltro> tablaDeDatosFiltro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFiltro.nitFiltro(tablaDeDatosFiltro.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFiltro.nombreFiltro(tablaDeDatosFiltro.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnFiltrar.btnFiltrar());
    }

    @Y("selecciona el icono de desactivar en el apartado de acciones ge dis")
    public void seleccionaElIconoDeDesactivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(InactivarRegistroDeDistribuidor.InactivarDistribuidor());
    }

    @Entonces("^el sistema muestra el mensaje de creacion exitosa (.*)$")
    public void elSistemaMuestraElMensajeDeCreacionExitosa(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ALERTA_CREACION_EXITOSA, isVisible()).forNoMoreThan(20).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ALERTA_CREACION_EXITOSA), Matchers.equalTo(mensaje)));
    }
    @Y("selecciona el icono de activar en el apartado de acciones ge dis")
    public void seleccionaElIconoDeActivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarRegistroDeDistribuidor.activarDistribuidor());
    }
    @Entonces("el sistema valida la activacion y muestra un mensaje exitoso ge dis")
    public void elSistemaValidaLaActivacionYMuestraUnMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlActivarDistribuidor.msjDeConfirmacionDeActivacionDistri(), Matchers.equalTo("Se ha cambiado el estado del registro (454564369-6 - PRUEBA 1) exitosamente")));
    }
    @Y("selecciona el icono de editar en el apartado de acciones ge dis")
    public void seleccionaElIconoDeEditarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarIconoEditar.accionEditarDistribuidor());
    }

    @Y("realiza las modificaciones en los campos que desee")
    public void realizaLasModificacionesEnLosCamposQueDesee(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAEmpresaYComercializador.empresaYComercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }

    @Y("el usuario da clic en el boton editar guardar")
    public void daClicEnElBotonEditar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonEditarDistribuidor.editarDistribuidor());
    }
    @Entonces("el sistema valida la edicion y muestra un mensaje de exito ge dis")
    public void elSistemaValidaLaEdicionYMuestraUnMensajeDeExito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlEditarDistribuidor.msjDeConfirmacionAlEditarDistri(), Matchers.equalTo("Se ha editado el distribuidor 454564369-6 - PRUEBA 1")));
    }

    @Y("el usuario da clic en el boton Salir gd")
    public void daClicEnElBotonSalir() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonSalir.SalirDePantallaEditarDistribuidor());
    }

    @Entonces("el sistema regresa a la pantala de filtro")
    public void elSistemaRegresaALaPantalaDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaInicial.textoModulo(), Matchers.equalTo("Crear Distribuidor")));

    }

    @Y("valida los que existan los elementos de gestion distribuidor")
    public void validaLosQueExistanLosElementosDeGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementosGestionDistribuidor.filtros()));
    }

    @Dado("el usuario da click en no de la ventana de confirmacion")
    public void elUsuarioDaClickEnNoDeLaVentanaDeConfirmacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosCrearLoteriaOSorteos.BTN_CONFIRMAR_NO));
    }

    @Entonces("el usuario da click en si de la ventana de confirmacion")
    public void elUsuarioDaClickEnSiDeLaVentanaDeConfirmacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosCrearLoteriaOSorteos.BTN_CONFIRMAR_SI));
    }

    @Entonces("valida el nit este deshabilitado gestion distribuidor")
    public void validaElNitEsteDeshabilitadoGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(ContenedorDeObjetosGestionarComercializador.CAMPO_NIT_EDITAR)));
    }
}

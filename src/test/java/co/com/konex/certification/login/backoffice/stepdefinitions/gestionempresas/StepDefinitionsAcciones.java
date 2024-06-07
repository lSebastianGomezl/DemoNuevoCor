package co.com.konex.certification.login.backoffice.stepdefinitions.gestionempresas;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.acciones.*;
import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.pantallainicio.ValidarPantallaModulo;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.acciones.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.IngresarNit;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.pantallainicio.SeleccionarBotonVerFiltros;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class StepDefinitionsAcciones {
    @Y("da clic en Ver filtros")
    public void daClicEnVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.desplegarPanelDeFiltros());
    }
    @Y("selecciona el icono de inactivar en el apartado de acciones")
    public void seleccionaElIconoDeInactivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcInactivar.inactivarEmpresa());
    }
    @Entonces("el sistema valida la inactivacion y muestra un mensaje exitoso ge")
    public void elSistemaValidaLaInactivacionYMuestraUnMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlInactivarEmpresa.msjDeEmpresaInactiva(), Matchers.equalTo("Se ha inactivado exitosamente el registro con el código 46 - ACERTEMOS")));
    }
    @Y("selecciona el icono de activar en el apartado de acciones ge")
    public void seleccionaElIconoDeActivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarIconoActivar.activarEmpresa());
    }
    @Entonces("el sistema valida la activacion y muestra un mensaje exitoso ge")
    public void elSistemaValidaLaActivacionYMuestraUnMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlActivarEmpresa.msjDeEmpresaActivada(), Matchers.equalTo("Se ha activado exitosamente el registro con el código 46 - ACERTEMOS")));
    }

    @Y("selecciona el icono de editar en el apartado de acciones ge")
    public void seleccionaElIconoDeEditarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcEditar.editarDatosEmpresa());
    }
    @Y("realiza las modificaciones que desea y presiona el boton editar empresa")
    public void realizaLasModificacionesQueDeseaYPresionaElBotonEditarEmpresa(List<TablaDeDatosCrearEmpresa> TablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(ModificarDatosEmpresa.modificarDatosEmpre(TablaDeDatosCrearEmpresa.get(0)));
    }
    @Entonces("el sistema valida la edicion y muestra un mensaje de exito ge")
    public void elSistemaValidaLaEdicionYMuestraUnMensajeDeExito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlEditarEmpresa.msjDeEdicionExitosa(), Matchers.equalTo("Se ha editado exitosamente el registro con el código 46 - GO-4")));
    }
    @Y("El usuario diligencia el campo de filtro con un NIT existente de un registro con comercializador asociado")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistenteDeUnRegistroConComercializadorAsociado(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
    }
    @Entonces("el sistema muestra un mensaje de alerta indicando que no se puede inactivar ge")
    public void elSistemaMuestraUnMensajeDeAlertaIndicandoQueNoSePuedeInactivar(List<String>msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlInactivarRegistroEmpresa.inactivarRegistroConComercializadorAsociado(), Matchers.equalTo(msjError.get(1))));
    }

    @Y("El usuario diligencia el campo de filtro con un NIT existente de un registro con distribuidor asociado")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistenteDeUnRegistroConDistribuidorAsociado(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
    }
    @Entonces("el sistema muestra un mensaje de error indicando que no se puede Inactivar")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueNoSePuedeInactivar(List<String>msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlInactivarRegistroEmpresaAsociadoADistr.inactivarRegistroConDistribuidorAsociado(), Matchers.equalTo(msjError.get(1))));
    }
    @Y("da clic en el boton salir ge")
    public void daClicEnElBotonSalir() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnSalir.salirDePantDeEdicion());
    }
    @Entonces("el sistema regresa a la pantala de filtro ge")
    public void elSistemaRegresaALaPantalaDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaModulo.textoModulo(), Matchers.equalTo("Gestión Empresa")));

    }

    @Y("el usuario inactiva el switch Estado y da clic en editar Empresa")
    public void elUsuarioInactivaElSwitchEstadoYDaClicEnEditarEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(InactivarSwitchEstado.inactivarRegistroDeGrupoEmpresarialYBotoonEditar());

    }
}

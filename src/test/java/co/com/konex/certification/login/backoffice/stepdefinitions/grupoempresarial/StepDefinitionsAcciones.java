package co.com.konex.certification.login.backoffice.stepdefinitions.grupoempresarial;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones.*;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial.ValidarVisibilidadElemento;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosAccionesGE;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros.IngresarNit;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.List;

public class StepDefinitionsAcciones {
    @Y("selecciona el icono de desactivar en el apartado de acciones")
    public void seleccionaElIconoDeDesactivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcInactivar.inactivarGrupoEmpresarial());
    }

    @Entonces("el sistema valida la inactivacion y muestra un mensaje exitoso")
    public void elSistemaValidaLaInactivacionYMuestraUnMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlInactivarGrupoEmpresarial.msjDeGrupoEmpresarialInactivo(), Matchers.contains("Se ha inactivado exitosamente el registro")));
    }

    @Y("selecciona el icono de activar en el apartado de acciones")
    public void seleccionaElIconoDeActivarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarIconoActivar.activarGrupoEmpresarial());
    }

    @Entonces("el sistema valida la activacion y muestra un mensaje exitoso")
    public void elSistemaValidaLaActivacionYMuestraUnMensajeExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlActivarGrupoEmpresarial.msjDeGrupoEmpresarialActivado(), Matchers.contains("Se ha activado exitosamente el registro")));
    }

    @Y("selecciona el icono de editar en el apartado de acciones")
    public void seleccionaElIconoDeEditarEnElApartadoDeAcciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcEditar.editarDatosGrupoEmpresarial());
    }

    @Y("realiza las modificaciones en los campos que desee y presiona el boton editar Grupo empresarial")
    public void realizaLasModificacionesEnLosCamposQueDeseeYPresionaElBotonEditarGrupoEmpresarial(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(ModificarGrupoEmpresarial.modificarDatosGrupoEmpresarial(tablaGrupoEmpresarial.get(0)));
    }

    @Entonces("el sistema valida la edicion y muestra un mensaje de exito")
    public void elSistemaValidaLaEdicionYMuestraUnMensajeDeExito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjAlEditarGrupoEmpresarial.msjDeEdicionExitosa(), Matchers.contains("Se ha editado exitosamente el registro")));

    }

    @Y("da clic en el boton salir")
    public void daClicEnElBotonSalir() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnSalir.salirDePantDeEdicion());

    }

    //@Entonces("el sistema regresa a la pantala de filtro")
    //public void elSistemaRegresaALaPantalaDeFiltro() {
    //    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaModulo.textoModulo(), Matchers.equalTo("Gestión Grupo Empresarial")));
    //}
    @Y("selecciona el icono de ver detalle")
    public void seleccionaElIconoDeVerDetalle() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarIconoVerDetalle.iconoVerDetalle());

    }

    @Entonces("el sistema muestra un modal con las empresas asociadas al grupo empresarial")
    public void elSistemaMuestraUnModalConLasEmpresasAsociadasAlGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarIngresoAModalVerDet.modalVerDetalle(), Matchers.equalTo("Detalle Grupo Empresarial")));

    }

    @Y("ingresa un NIT existente en el campo de filtro del modal y da clic en el boton filtrar")
    public void ingresaUnNITExistenteEnElCampoDeFiltroDelModalYDaClicEnElBotonFiltrar(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitFiltroModal.ingresarNitEnCampoFiltroModalDetalle(tablaGrupoEmpresarial.get(0)));
    }

    @Entonces("el sistema muestra la empresa con el NIT ingresado asociado")
    public void elSistemaMuestraLaEmpresaConElNITIngresadoAsociado() {
        String nitGenerado = OnStage.theActorInTheSpotlight().recall("nitGenerado");
        System.out.println("nit comparar" + nitGenerado);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultFiltroNitModalDetalle.resultadosFiltro(), Matchers.equalTo(nitGenerado)));

    }
    @Y("El usuario selecciona el boton limpiar del Modal")
    public void elUsuarioSeleccionaElBotonLimpiarDelModal() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonLimpiarFiltroModal.botonLimpiar());


    }

    @Entonces("el sistema limpia los campos de filtro")
    public void elSistemaLimpiaLosCamposDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLimpiarCampoNitModalDetalle.limpiarCampoDeFiltro(), Matchers.equalTo("")));

    }
    @Y("El usuario diligencia el campo de filtro con un NIT existente y que tenga asociado una empresa")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistenteYQueTengaAsociadoUnaEmpresa(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaGrupoEmpresarial.get(0)));
    }

    @Y("el usuario inactiva el switch Estado y da clic en editar grupo empresarial")
    public void elUsuarioInactivaElSwitchEstadoYDaClicEnEditarGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(InactivarSwitchEstado.inactivarRegistroDeGrupoEmpresarial());
    }

    @Entonces("el sistema muestra un mensaje de alerta indicando que no se puede inactivar")
    public void elSistemaMuestraUnMensajeDeAlertaIndicandoQueNoSePuedeInactivar(String msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlInactivarRegistro.inactivarRegistroConEmpresaAsociada(msjError), Matchers.equalTo(msjError)));
    }

    @Y("^le da clic en el boton limpiar nodal$")
    public void daClicEnLimpiar() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosAccionesGE.BTN_LIMPIAR_MODAL));
    }

    @Entonces("^verifica que el nit ingresado este listado (.*)$")
    public void verificaQueElNitIngresadoEsteListado(String nit) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosAccionesGE.TD_NIT_BUSCADO.of(nit))));
    }

    @Entonces("valida que se hayan limpiado los campos")
    public void validaQueSeHayanLimpiadoLosCampos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposLimpios.delElemento(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO_MODAL),Matchers.equalTo("")));
    }

    @Entonces("verifica que el nit no se pueda editar")
    public void verificaQueElNitNoSePuedaEditar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT),Matchers.is(true)));
    }

    @Entonces("valida que siga en el filtro de crear grupo empresarial")
    public void validaQueSigaEnElFiltroDeCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO),Matchers.is(true)));
    }

    @Y("el usuario da clic en el boton salir ge")
    public void elUsuarioDaClicEnElBotonSalirGe() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_SALIR));
    }

    @Dado("Este caso de prueba no aplica")
    public void esteCasoDePruebaNoAplica() {

    }

    @Entonces("^el sistema muestra la pantalla principal de (.*)$")
    public void elSistemaMuestraLaPantallaInicialDeSorteosYLoterias(String modulo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGrupoEmpresarial.H3_TITULO_MOUDULO), Matchers.equalTo(modulo)));
    }
}

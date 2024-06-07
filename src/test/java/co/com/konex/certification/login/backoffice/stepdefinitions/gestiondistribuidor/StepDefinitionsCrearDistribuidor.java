package co.com.konex.certification.login.backoffice.stepdefinitions.gestiondistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones.ValidarElementoDeshabilitado;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor.*;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial.ValidarElementoClickable;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial.ValidarVisibilidadElemento;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.ActivarInactivarSwichEstadoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.AsociarAEmpresaYComercializador;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarCorreoElectronicoCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarDireccionCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarDominioCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarNitCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarNombreCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarPaisDptoCiudadCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.IngresarTelefonoCampoFormulario;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.SeleccionarBtnCrearDistribuidor;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.SeleccionarBtnSiVentConf;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.SeleccionarCrearDistribuidor;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class StepDefinitionsCrearDistribuidor {
    @DataTableType
    public TblGestionDistribuidor tablaDeDatosGestionDistribuidor(Map<String, String> entry) {
        return new TblGestionDistribuidor(
                entry.get("asociarAEmpresa"),
                entry.get("asociarAComercializador"),
                entry.get("NIT"),
                entry.get("razonSocialONombre"),
                entry.get("pais"),
                entry.get("region"),
                entry.get("departamento"),
                entry.get("municipio"),
                entry.get("direccion"),
                entry.get("correoElectronico"),
                entry.get("telefono"),
                entry.get("dominio"));
    }

    @Y("de clic en la opcion Crear Distribuidor+")
    public void deClicEnLaOpciónCrearDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCrearDistribuidor.crearDistribuidor());
    }
    @Entonces("el sistema muestra el formulario de crear distribuidor")
    public void elSistemaMuestraElFormularioDeCrearDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarIngresoAlFormulario.formularioCrearDistribuidor(), Matchers.equalTo("Crear Distribuidor")));

    }

    //@Y("da clic en el boton Salir en el formulario")
    //public void daClicEnElBotonSalirEnElFormulario() {
    //    OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonSalirDelFormulario.SalirDePantallaCrearDistribuidor());
//
    //}
    @Y("el usuario ingresa datos solo en algunos campos")
    public void elUsuarioIngresaDatosSoloEnAlgunosCampos(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAEmpresaYComercializador.empresaYComercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFormulario.nitFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }
    @Y("le da click al boton Crear distribuidor")
    public void leDaClickAlBotonCrearDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnCrearDistribuidor.btnCrearDistribuidor());
    }
    @Entonces("el sistema muestra el respectivo mensaje de alerta")
    public void elSistemaMuestraElRespectivoMensajeDeAlerta(List<String>msjAlerta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjDeAlerta.alCrearDistribuidorConCamposVacios(), Matchers.equalTo(msjAlerta.get(1))));

    }
    @Entonces("el sistema resalta los campos obligatorios vacios en rojo")
    public void elSistemaResaltaLosCamposObligatoriosVaciosEnRojo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposrResaltados.bordeRojo()));
    }

    @Y("el usuario ingrese datos en los campos del formulario de una manera")
    public void elUsuarioIngreseDatosEnLosCamposDelFormularioDeUnaManeraIncorrecta(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAEmpresaYComercializador.empresaYComercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFormulario.nitFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }

    @Entonces("el sistema muestra el respectivo mensaje de error")
    public void elSistemaMuestraElRespectivoMensajeDeError(List<String>msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorCorreo.datosCorreosIngresadosMal(), Matchers.equalTo(msjError.get(1))));
    }

    @Y("el usuario diligencia el formulario con los datos requeridos")
    public void elUsuarioDiligenciaElFormularioConLosDatosRequeridos(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAEmpresaYComercializador.empresaYComercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFormulario.nitFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }
    @Y("da clic en el Switch Estado")
    public void daClicEnElSwitchEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarInactivarSwichEstadoFormulario.activarInactivarRegistro());
    }
    @Y("el usuario da clic en Si")
    public void daClicEnSi() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnSiVentConf.siEnVentanaDeConfirmacion());
    }

    @Entonces("el sistema muestra el respectivo mensaje de exito")
    public void elSistemaMuestraElRespectivoMensajeDeExito(List<String>msjExito) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjExito.creacionExitosaDeRegistro(), Matchers.equalTo(msjExito.get(1))));
    }


    @Y("el usuario diligencia el formulario con los datos obligatorios y lo asocia solo a un comercializador")
    public void elUsuarioDiligenciaElFormularioConLosDatosObligatoriosYLoAsociaAUnComercializador(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAComercializador.comercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFormulario.nitFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }

    @Y("el usuario diligencia el formulario con los datos obligatorios y le asocia empresa y comercializador")
    public void elUsuarioDiligenciaElFormularioConLosDatosObligatoriosYLeAsociaEmpresaYComercializador(List<TblGestionDistribuidor> tblGestionDistribuidor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAEmpresa.empresaFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(AsociarAComercializador.comercializadorFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNitCampoFormulario.nitFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombreCampoFormulario.nombreFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPaisDptoCiudadCampoFormulario.paisDptoCiudadFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDireccionCampoFormulario.direccionFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCorreoElectronicoCampoFormulario.correoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTelefonoCampoFormulario.telefonoFormulario(tblGestionDistribuidor.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDominioCampoFormulario.dominioFormulario(tblGestionDistribuidor.get(0)));
    }
    @Entonces("el sistema muestra un mensaje de error indicando que el NIT ya existe en el sistema")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueElNITYaExisteEnElSistema(List<String>msjError) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlIngresarNitExistente.alIntentarCrearUnRegistroConUnNitExistente(), Matchers.equalTo(msjError.get(1))));
    }

    @Entonces("el sistema muestra un mensaje de error indicando que debe escoger empresa o comercializador")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueDebeEscogerEmpresaOComercializador(List<String>msjError) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlAsociarEmpresaYComercializador.alIntentarCrearUnRegistroConEmpreYComer(), Matchers.equalTo(msjError.get(1))));
    }

    @Entonces("el sistema muestra un mensaje de error indicando que el Nombre o razon social ya existe en el sistema")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueElNombreORazonSocialYaExisteEnElSistema(List<String>msjError) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlIngresarNombreExistente.alIntentarCrearUnRegistroConUnNombreExistente(), Matchers.equalTo(msjError.get(1))));
    }

    @Dado("el usuario da clic en gestión empresas")
    public void elUsuarioDaClicEnGestiónEmpresas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.OP_GESTION_EMPRESA));
    }

    @Entonces("el sistema enlista solo los registro activos de Empresas")
    public void elSistemaEnlistaSoloLosRegistroActivosDeEmpresas() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEmpresasListadas.validar()));
    }

    @Y("el usuario da clic en el boton crear distribuidor")
    public void elUsuarioDaClicEnElBotonCrearDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_CREAR_DISTRIBUIDOR));
    }

    @Y("el usuario da clic en asociar empresa")
    public void elUsuarioDaClicEnAsociarEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_EMPRESAS));
    }

    @Dado("el usuario da clic en gestión comercializadores")
    public void elUsuarioDaClicEnGestiónComercializadores() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SUBMENU_GESTION_COMERCIALIZADOR));
    }

    @Y("el usuario da clic en el boton Consultar gestion comercializadores")
    public void elUsuarioDaClicEnElBotonConsultarGestionComercializadores() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_FILTRAR));
    }

    @Y("se guardan todas los comercializadores activas de gestion comercializador")
    public void seGuardanTodasLosComercializadoresActivasDeGestionComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarComercializadoresActivos.guardarComercializadoresActivos());
    }

    @Y("el usuario da clic en asociar comercializador")
    public void elUsuarioDaClicEnAsociarComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_COMERCIALIZADORES));
    }

    @Entonces("el sistema enlista solo los registro activos de Comercializador")
    public void elSistemaEnlistaSoloLosRegistroActivosDeComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarComercializadoresListados.validar()));
    }

    @Y("valida que exista el boton ACEPTAR")
    public void validaQueExistaElBotonACEPTAR() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGestionDistribuidor.BTN_ACEPTAR_VENATA_CONFIRMACION)));
    }

    @Y("valida que exista el boton CANCELAR")
    public void validaQueExistaElBotonCANCELAR() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGestionDistribuidor.BTN_CANCELAR_VENATA_CONFIRMACION)));
    }

    @Y("el usuario da clic en el boton Salir en el formulario gestion comercializador")
    public void elUsuarioDaClicEnElBotonSalirEnElFormularioGestionComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_SALIR_CREAR_GESTION_DISTRIBUIDOR));
    }

    @Y("^el usuario valida el titulo del modulo (.*)$")
    public void elUsuarioValidaElTituloDelModulo(String titulo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionDistribuidor.TITULO_INVENTARIO_GENERAL), Matchers.equalTo(titulo)));
    }

    @Entonces("el boton guardar de gestion distribuidor debe estar deshabilitado")
    public void elBotonGuardarDeGestionDistribuidorDebeEstarDeshabilitado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(ContenedorDeObjetosGestionDistribuidor.BTN_GUARDAR)));
    }

    @Cuando("^el usuario da clic en (.*) del modulo cualquiera$")
    public void elUsuarioDaClicEnSorteosDelModuloCualquiera(String clic) {
    }

    @Dado("el usuario da clic en gestion comercial")
    public void elUsuarioDaClicEnGestionComercial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.SUB_MENU_GESTION_COMERCIAL));
    }

    @Y("el usuario da clic en gestion politica")
    public void elUsuarioDaClicEnGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.SUB_MENU_GESTION_POLITICA));
    }

    @Y("el usuario da clic en consultar gestion politica")
    public void elUsuarioDaClicEnConsultarGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_CONSULTAR_GESTION_POLITICA));
    }

    @Cuando("el usuario guarda los paises activos")
    public void elUsuarioGuardaLosPaisesActivos() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarPaisesGestionPolitica.guardar());
    }

    @Y("el usuario da clic en el select de pais gestion distribuidor")
    public void elUsuarioDaClicEnElSelectDePaisGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_PAISES));
    }

    @Entonces("valida que los paises listados sean los guardados de gestion politica")
    public void validaQueLosPaisesListadosSeanLosGuardadosDeGestionPolitica() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPaisesGestionPolitica.paises()));
    }

    @Entonces("^el campo (.*) está deshabilitado$")
    public void elCampoCampoEstáDeshabilitado(String campo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEmpresaComercializadorSincronico.sincronico(campo)));
    }

    @Y("el usuario ingresa a la ruta Multinivel Gestion Distribuidor")
    public void elUsuarioIngresaALaRutaMultinivelGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.OP_GESTION_DISTRIBUIDOR));
    }

    @Entonces("el usuario da clic en Select de Región de gestion distribuidor")
    public void elUsuarioDaClicEnSelectDeRegiónDeGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_REGION));
    }
}

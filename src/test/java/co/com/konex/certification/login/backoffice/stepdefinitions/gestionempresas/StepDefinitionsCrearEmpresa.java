package co.com.konex.certification.login.backoffice.stepdefinitions.gestionempresas;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.AsignarUsuarioModel;
import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.CrearEmpresaModel;
import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.ValidarElementoDeshabilitado;
import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.ALERTA_CREACION_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StepDefinitionsCrearEmpresa {

    @DataTableType
    public CrearEmpresaModel crearEmpresaModel(Map<String, String> entry) {
        return new CrearEmpresaModel(
                entry.get("grupoEmpresarial"),
                entry.get("NIT"),
                entry.get("razonSocialONombre"),
                entry.get("pais"),
                entry.get("departamento"),
                entry.get("municipio"),
                entry.get("direccion"),
                entry.get("correoElectronico"),
                entry.get("telefono"),
                entry.get("dominio"),
                entry.get("moneda"),
                entry.get("tipoDePago ")
        );
    }

    @DataTableType
    public TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresaEntry(Map<String, String> entry) {
        return new TablaDeDatosCrearEmpresa(entry.get("grupoEmpresarial"), entry.get("NIT"), entry.get("razonSocialONombre"), entry.get("pais"), entry.get("departamento"), entry.get("ciudad"),
                entry.get("direccion"), entry.get("correoElectronico"), entry.get("telefono"), entry.get("dominio"), entry.get("moneda"), entry.get("tipoDePago"), entry.get("usuario"), entry.get("rol"));

    }

    @DataTableType
    public AsignarUsuarioModel AsignarUsuarioEntry(Map<String, String> entry) {
        return new AsignarUsuarioModel(entry.get("fecha"), entry.get("tipoDocumento"), entry.get("documento"));
    }

    @Y("de clic en la opcion Crear Empresa+")
    public void deClicEnLaOpcionCrearEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCrearEmpresa.crearEmpresa());
    }

    @Entonces("el usuario da clic en Select Departamento Gestion Empresas")
    public void elUsuarioDaClicEnSelectDeRegion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_DEPART));
    }

    @Entonces("el usuario da clic en Select Grupo Empresarial")
    public void elUsuarioDaClicEnSelectGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE));
    }

    @Entonces("el sistema muestra el formulario con el titulo crear empresa")
    public void elSistemaMuestraElFormularioConElTituloCrearEmpresa() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaFormulario.textoNombreFormulario(), Matchers.equalTo("Crear Empresa")));
    }

    @Y("da clic en el boton Salir en el formulario ge")
    public void daClicEnElBotonSalirEnElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonSalirDelFormulario.salirDePantallaCrearEmpresa());

    }

    @Y("el usuario deja en blanco los campos obligatorios y da clic en Crear Empresa")
    public void elUsuarioDejaEnBlancoLosCamposObligatoriosYDaClicEnCrearEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickBtnCrearEmpresa.crearEmpresa());
    }

    @Y("el usuario ingresa los datos para crear empresa")
    public void elUsuarioIngresaLosDatosCrearEmpresa(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioInfoGeneral.informacionGeneralCrearEmpre(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Y("el usuario ingresa los datos para asignar en crear empresa")
    public void elUsuarioIngresaLosDatosAsignarCrearEmpresa(List<AsignarUsuarioModel> asignarUsuarioModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioAsignar.asignarUsuario(asignarUsuarioModel.get(0)));
    }


    @Y("el usuario valida el botón guardar deshabilitado")
    public void elUsuarioValidaElBotonGuardarDeshabilitado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(ContenedorDeObjetosGestionEmpresa.BTN_CREAR_EMPRESA)));
    }

    @Y("el usuario valida el botón guardar deshabilitado paso")
    public void elUsuarioValidaElBotonGuardarDeshabilitadoPaso() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(ContenedorDeObjetosGestionEmpresa.BTN_CREAR_EMPRESA)));
    }


    @Entonces("el sistema muestra un mensaje de alerta ge")
    public void elSistemaMuestraUnMensajeDeAlerta(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjDeAlertaCampoVacios.alCrearEmpresaConCamposVacios(), Matchers.equalTo(msjError.get(1))));

    }

    @Y("el usuario ingrese datos en los campos del formulario de una manera incorrecta ge")
    public void elUsuarioIngreseDatosEnLosCamposDelFormularioDeUnaManeraIncorrecta(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioInfoGeneral.informacionGeneralCrearEmpre(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Entonces("el sistema muestra el respectivo mensaje de error ge")
    public void elSistemaMuestraElRespectivoMensajeDeError(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorEnCampos.alIngresarDatosIncorrectos(), Matchers.equalTo(msjError.get(1))));
    }

    @Y("activa el switch Responsable de IVA")
    public void activaElSwitchResponsableIva() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchIVA.activacionSwich());
    }

    @Y("activa el switch Obligado a facturar")
    public void activaElSwitchObligadoFactura() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchObligadoFacturar.activacionSwich());
    }

    @Y("activa el switch Regimen Simple")
    public void activaElSwitchRegimenSimple() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchRegimenSimple.activacionSwich());
    }

    @Y("activa el switch Entidad del estado")
    public void activaElSwitchEntidadDelEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchEntidadEstado.activacionSwich());
    }

    @Y("activa el switch Aplica como distribuidor")
    public void activaElSwitchAplicaComoDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwichAplicaComoDistribuidor.activacionSwich());
    }

    @Y("activa el switch Aplica como comercializador")
    public void activaElSwitchAplicaComoComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwichAplicaComoComercializador.activacionSwich());
    }

    @Y("activa switch Estado")
    public void activaSwitchEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwichEstado.activacionSwich());
    }

    @Y("activa switch Estado de asignar")
    public void activaSwitchEstadoAsignar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchAsignar.activarSwitchAsignar());
    }

    @Y("da click en la lista desplegable de Usuarios")
    public void daClickEnLaListaDesplegableDeUsuarios() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickListaDesplegableUsuarios.listaDesplegableUsuarios());
    }

    @Y("selecciona el usuario")
    public void seleccionaElUsuario(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarUsuario.seleccionUsuarioDeLista(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Entonces("el sistema permite la seleccion del usuario")
    public void elSistemaPermiteLaSeleccionDelUsuario(List<String> usuarios) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarSeleccionDelUsuario.usuarioSeleccionadoDeLaLista(), Matchers.equalTo(usuarios.get(1))));
    }

    @Y("da click en la lista desplegable de Roles")
    public void daClickEnLaListaDesplegableDeRoles() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickListaDesplegableRoles.listaDeRoles());
    }

    @Y("selecciona el rol")
    public void seleccionaElRol(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarRol.seleccionRolDeLista(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Y("el usuario diligencia el formulario con los datos requeridos ge")
    public void elUsuarioDiligenciaElFormularioConLosDatosRequeridos(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormularioCrearEmpre.completarCamposRequeridos(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Y("le da click al boton Crear empresa")
    public void leDaClickAlBotonCrearEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickBtnCrearEmpresa.crearEmpresa());
    }

    @Entonces("el usuario valida las caracteristicas de los campos gestion empresa")
    public void elUsuarioValidaLasCaracteristicasDeLosCampos() {
        List<Question<Boolean>> validaciones = ValidacionesCamposGe.obtenerValidaciones();
        for (Question<Boolean> validacion : validaciones) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacion));
        }
    }

    @Y("el usuario da click en Si")
    public void elUsuarioDaClickEnSi() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickEnOpcSi.siEnVentanaDeConfirmacion());
    }

    @Entonces("el sistema muestra el respectivo mensaje de exito ge")
    public void elSistemaMuestraElRespectivoMensajeDeExito(List<String> msjExito) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjExito.alCrearEmpresa(), Matchers.equalTo(msjExito.get(1))));
    }


    @Y("el usuario ingresa un NIT existente y diligencia los demas campos obligatorios del formulario ge")
    public void elUsuarioIngresaUnNITExistenteYDiligenciaLosDemasDatosObligatoriosDelFormulario(List<TablaDeDatosCrearEmpresa> tablaDeDatosCrearEmpresa) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormularioCrearEmpre.completarCamposRequeridos(tablaDeDatosCrearEmpresa.get(0)));
    }

    @Entonces("el sistema muestra un mensaje de error indicando que el NIT ya existe en el sistema ge")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueElNITYaExisteEnElSistema(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlIngresarNitExistente.alIntentarCrearUnRegistroConUnNitExistente(), Matchers.equalTo(msjError.get(1))));
    }

    @Entonces("^el usuario valida el mensaje con (.*)$")
    public void elSistemaMuestraElToastMensajeDeCreacionExitosa(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionEmpresa.TOAST_EXITOSO, isVisible()).forNoMoreThan(20).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionEmpresa.TOAST_EXITOSO), Matchers.containsString(mensaje)));
    }

    @Entonces("^el sistema debe mostrar el mensaje respectivo (.*)$")
    public void elSistemaMuestraElMensajeDeCreacionExitosa(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ALERTA_CREACION_EXITOSA, isVisible()).forNoMoreThan(20).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ALERTA_CREACION_EXITOSA), Matchers.equalTo(mensaje)));
    }

    @Entonces("ingresa a la ruta multinivel - Gestion Empresarial")
    public void cuandoIngresaALaRutaGestionEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionEmpresarial.gestionEmpresarial());
    }
    @Entonces("el usuario ingresa a la ruta Multinivel Gestion Empresa")
    public void cuandoIngresaALaRutaGestionEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionEmpresa.gestionEmpresa());
    }
    @Entonces("el usuario ingresa a la ruta Multinivel Gestion Distribuidores")
    public void cuandoIngresaALaRutaGestionDistribuidores() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionDistribuidor.gestionEmpresa());
    }

    @Y("el sistema muestra las empresas activas en Gestion Empresas")
    public void elSistemaMuestraLasEmpresasActivasGe() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEmpresasGestionEmpresas.empresas()));
    }

    @Entonces("el usuario da clic en select pais gestion empresas")
    public void elUsuarioDaClicEnSelectDePaisGe() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS));
    }

    @Y("^el usuario valida los campos desplegados gestion empresas de (.*)$")
    public void elUsuarioValidaLosCamposDesplegadosGe(String pais) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposDesplegadosGe.delElemento(pais)));
    }

    @Y("el usario da clic en salir del menu editar")
    public void elUsuarioDaClicEnSalirEditar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonSalirDelFormulario.salirDePantallaCrearEmpresa());

    }
    //
    @Entonces("el sistema almacena las empresas buscadas")
    public void elSistemaAlmacenaLasEmpresasBuscadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarEmpresasGestionEmpresarial.guardar());
    }
}




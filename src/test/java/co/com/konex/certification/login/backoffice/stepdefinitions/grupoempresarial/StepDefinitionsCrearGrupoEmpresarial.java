package co.com.konex.certification.login.backoffice.stepdefinitions.grupoempresarial;


import co.com.konex.cetificacion.login.backoffice.interactions.ClickOnFiltrarGestionPolitica;
import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial.*;
import co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosCrearLoteriaOSorteos;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Pero;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class StepDefinitionsCrearGrupoEmpresarial {

    @DataTableType
    public TablaGrupoEmpresarial tablaDeDatosGrupoEmpresarialEntry(Map<String, String> entry) {
        return new TablaGrupoEmpresarial(entry.get("NIT"), entry.get("razonSocialONombre"), entry.get("pais"), entry.get("departamento"), entry.get("ciudad"),
                entry.get("direccion"), entry.get("correoElectronico"), entry.get("telefono"), entry.get("dominio"));
    }

    @Y("de clic en la opcion Crear Grupo Empresarial+")
    public void deClicEnLaOpciónCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCrearGrupoEmpresarial.crearGrupoEmpresarial());
    }

    @Entonces("el sistema muestra el formulario de crear grupo empresarial")
    public void elSistemaMuestraElFormularioDeCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTituloFormulario.alIngresarAlFormularioCrearGrupoEmpresarial(), Matchers.equalTo("Crear Grupo Empresarial")));


    }

    @Y("el usuario da clic en el boton Salir en el formulario")
    public void daClicEnElBotonSalirEnElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonSalirDelFormulario.SalirDePantallaCrearGrupoEmpresarial());

    }

    @Entonces("el sistema resalta todos los campos obligatorios en rojo")
    public void elSistemaResaltaTodosLosCamposObligatoriosEnRojo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposVacios.bordeCampo()));
    }

    @Y("el usuario deja en blanco los campos obligatorios y da clic en crear Grupo Empresarial")
    public void elUsuarioDejaEnBlancoLosCamposObligatoriosYDaClicEnCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickBtnCrearGrupoEmpresarial.crearGrupoEmpresarial());
    }

    @Y("el usuario deja en blanco algunos de los campos")
    public void elUsuarioDejaEnBlancoAlgunosDeLosCampos(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarCampos.llenarCamposConDatosRequeridos(tablaGrupoEmpresarial.get(0)));

    }

    @Y("el usuario ingrese datos incorrectos en los campos del formulario")
    public void elUsuarioIngreseDatosIncorrectosEnLosCamposDelFormulario(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarCampos.llenarCamposConDatosRequeridos(tablaGrupoEmpresarial.get(0)));
    }

    @Entonces("el sistema muestra el respectivo mensaje de error grupo empresarial")
    public void elSistemaMuestraElRespectivoMensajeDeError(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorEnCampos.alIngresarDatosIncorrectos(), Matchers.equalTo(msjError.get(1))));
    }

    @Y("el usuario diligencia el formulario de grupo empresarial")
    public void elUsuarioDiligenciaElFormularioConLosDatosRequeridos(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarCampos.llenarCamposConDatosRequeridos(tablaGrupoEmpresarial.get(0)));
    }

    @Y("le da click al boton Crear grupo empresarial")
    public void leDaClickAlBotonCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickBtnCrearGrupoEmpresarial.crearGrupoEmpresarial());

    }

    @Y("activa el switch Estado")
    public void activaElSwitchEstado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarSwitchEstado.activarRegistroDeGrupoEmpresarial());

    }

    @Y("^da click en (.*)$")
    public void daClickEnSi(String opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickEnOpcSi.siEnVentanaDeConfirmacion(opcion));
    }
    //@Entonces("el sistema muestra el respectivo mensaje de exito grupo empresarial")
    //public void elSistemaMuestraElRespectivoMensajeDeExito(List<String>msjExito) {
    //    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjExito.alCrearGrupoEmpresarial(), Matchers.equalTo(msjExito.get(1))));
//
    //}

    @Entonces("el sistema muestra un mensaje de alerta")
    public void elSistemaMuestraUnMensajeDeAlerta(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjDeAlerta.alCrearGrupoEmpresarialConCamposVacios(), Matchers.equalTo(msjError.get(1))));

    }


    @Entonces("^el sistema muestra un mensaje de error indicando que el NIT ya existe (.*)$")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueElNITYaExisteEnElSistema(String msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorAlIngresarNitExistente.alIntentarCrearUnRegistroConUnNitExistente(msjError), Matchers.equalTo(msjError)));
    }

    @Entonces("^el sistema muestra un mensaje de error indicando en la parte de abajo (.*)$")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoError(String msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosCrearLoteriaOSorteos.MENSAJE_ERROR_ABAJO), Matchers.equalTo(msjError)));
    }

    @Y("el usuario ingresa un NIT existente y diligencia el formulario con los datos requeridos")
    public void elUsuarioIngresaUnNITExistenteYDiligenciaElFormularioConLosDatosRequeridos(List<TablaGrupoEmpresarial> tablaGrupoEmpresarial) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarCampos.llenarCamposConDatosRequeridos(tablaGrupoEmpresarial.get(0)));
    }

    @Y("guarda los valores")
    public void guardaLosValores() {

        String razonSocial = OnStage.theActorInTheSpotlight().recall("razonSocial");
        String nit = OnStage.theActorInTheSpotlight().recall("nitGenerado");
        System.out.println("nitGenerado: " + nit);
        SharedContext.setVariable("nitGenerado", nit);
        System.out.println("nitGenerado: " + razonSocial);
        SharedContext.setVariable("razonSocial", razonSocial);
    }

    @Entonces("^valida la cantidad de caracteres grupo empresarial con (.*)$")
    public void validaLaCantidadDeCaracteresGrupoEmpresarial(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjErrorEnCampos.alIngresarDatosIncorrectos(), Matchers.equalTo(mensaje)));
    }

    @Y("^da clic en (.*)$")
    public void daClicEnSi(String opc) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickEnOpcSi.siEnVentanaDeConfirmacion(opc));
    }

    @Dado("el usuario ingresa a gestion politica")
    public void elUsuarioIngresaAGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarAGestionPolitica.ingresar());
    }

    @Y("da clic en filtrar gestion politica")
    public void daClicEnFiltrarGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnFiltrarGestionPolitica.clickOn());
    }

    @Y("guarda los paises de gestion politica")
    public void guardaLosPaisesDeGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarPaisesMenuDesplegable.guardarPaises());
    }

    @Entonces("compara los paises en el menu desplegable")
    public void comparaLosPaisesEnElMenuDesplegable() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPaisesMenuDesplegable.validar(), Matchers.is(true)));
    }

    @Pero("regresa grupo empresarial")
    public void regresaGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarAGrupoEmpresarial.ingresar());
    }

    @Entonces("Valida que los botenes si y no estén presentes")
    public void validaQueLosBotenesSiYNoEsténPresentes() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarBotonesSiNoCrearGrupoEmpresarial.validar(), Matchers.is(true)));
    }

    @Entonces("valida que siga en el formulario de crear grupo empresarial")
    public void validaQueSigaEnElFormularioDeCrearGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT), Matchers.is(true)));
    }

    @Entonces("^el usuario valida en la ventana de confirmación (.*)$")
    public void cConfirmaciónElMensaje(String mensajeConfirmacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_VENTANA_DE_CONFIRMACION), Matchers.equalTo(mensajeConfirmacion)));


    }

    @Entonces("^el usuario valida que exista la ventana de confirmacion con (.*) con el (.*)$")
    public void validaQueExistaLaVentanaDeConfirmacionCOnNombre(String mensaje, String nombre) {
        if (nombre.equals("N/A")) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGrupoEmpresarial.VENTANA_CONFIRMACION), Matchers.containsString(mensaje)));
        } else {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGrupoEmpresarial.VENTANA_CONFIRMACION), Matchers.equalTo(mensaje + " " +  OnStage.theActorInTheSpotlight().recall(nombre) + "?")));

        }
    }

    @Y("el usuario da click en salir")
    public void elUsuarioDaClickEnSalir() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_SALIR));
    }

    @Entonces("el sistema inhabilita el boton guardar")
    public void elSistemaInhabilitaElBotonGuardar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGrupoEmpresarial.BTN_GUARDAR)));
    }

    @Y("el usuario da clic en el select de pais grupo empresarial")
    public void elUsuarioDaClicEnElSelectDePaisGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.LIST_DESPLEGABLE_PAIS));
    }

    @Y("el usuario ingresa a la ruta Multinivel Grupo empresarial")
    public void elUsuarioIngresaALaRutaMultinivelGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.OP_GRUPO_EMPRESARIAL));
    }

    @Entonces("el usuario da clic en Select de Región Grupo empresarial")
    public void elUsuarioDaClicEnSelectDeRegiónGrupoEmpresarial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.SELECT_REGION));
    }
}



package co.com.konex.certification.login.backoffice.stepdefinitions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TablaCrearComercializadorColombia;
import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa.GuardarEmpresasGestionEmpresarial;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.SeleccionarBtnFiltrar;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor.GuardarEmpresasGestionEmpresas;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CrearComercializadorStepDefinitions {

    @DataTableType
    public TblCrearComerci tablaCrearComercializador(Map<String, String> dataTable) {
        return new TblCrearComerci(
                dataTable.get("asociaraempresa"),
                dataTable.get("NIT"),
                dataTable.get("razonsocialoEmpresa"),
                dataTable.get("pais"),
                dataTable.get("departamento"),
                dataTable.get("ciudad"),
                dataTable.get("direccion"),
                dataTable.get("correoelectronico"),
                dataTable.get("telefono"),
                dataTable.get("dominio"),
                dataTable.get("estado"),
                dataTable.get("btnsalir"),
                dataTable.get("btncrearcomercializador"));
    }

    @DataTableType
    public TablaCrearComercializadorColombia tablaCrearComercializadorCo(Map<String, String> entry) {
        return new TablaCrearComercializadorColombia(
                entry.get("asociaraempresa"),
                entry.get("NIT"),
                entry.get("razonsocialoEmpresa"),
                entry.get("pais"),
                entry.get("region"),
                entry.get("departamento"),
                entry.get("ciudad"),
                entry.get("direccion"),
                entry.get("correoelectronico"),
                entry.get("telefono"),
                entry.get("dominio"));
    }

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Y("el usuario da clic en el botón Crear Comercializador+")
    public void elUsuarioDaClicEnElBotónCrearComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickearBotonCrearComercilizador.crearComercializador());

    }

    //@CP5763
    @Entonces("el sistema muestra el formulario de Gestión Comercializador")
    public void elSistemaMuestraElFormularioDeGestiónComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementosCrearComercializador.comercializador()));

    }

    //CP5762BTNSI
    @Y("diligencie los campos del formulario")
    public void diligencieLosCamposDelFormulario(List<TablaCrearComercializadorColombia> tablaCrearComercializadorCo) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioCrearComercializador.comercializador(tablaCrearComercializadorCo.get(0)));

    }

    @Y("cambia el estado")
    public void cambiaElEstadoA() {
        OnStage.theActorInTheSpotlight().attemptsTo(CambiarEstadoComercializadora.activarComercializadora());

    }

    @Y("da clic en el botón CREAR COMERCIALIZADOR")
    public void daClicEnElBotónCREARCOMERCIALIZADOR() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickerBotonGuardarComercializadora.crearComercializadora());

    }

    @Y("el usuario da clic en el boton Aceptar")
    public void elUsuarioDaClicEnElBotonSi() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_SI_CREAR_COMERCIALIZADOR));

    }

    @Y("el usuario da clic en el boton Cancelar")
    public void elUsuarioDaClicEnElBotonNo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_NO_CREAR_COMERCIALIZADOR));

    }

    @Entonces("el sistema muestra mensaje de exito")
    public void elSistemaMuestraMensajeDeExito() {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarMSJExitosoCrear.crearComercializador()), Matchers.equalTo("Se ha creado exitosamente el registro con el código 48 - Comercializador Aguachica.")));

    }

    //CP5762BTNNO
    @Y("el usuario da clic en No")
    public void daClicEnNo() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickerBotonNoGuardarComercializadora.noCrearComercializadora());

    }

    @Entonces("el sistema cierra la ventana de confirmación")
    public void elSistemaCierraLaVentanaDeConfirmación() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVentanaCierraCrear.crearVentanaCerrar()));
    }


    @Y("el usuario ingresa un NIT existente y diligencia los demas campos obligatorios del formulario")
    public void elUsuarioIngresaUnNITExistenteYDiligenciaLosDemasCamposObligatoriosDelFormulario(List<TblCrearComerci> tblCrearComerci) {
        OnStage.theActorInTheSpotlight().attemptsTo(LLenarFormularioComercializador.gestionComercializador(tblCrearComerci.get(0)));
    }

    @Entonces("el sistema muestra un error indicando que el NIT ya existe en el sistema")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueElNITYaExisteEnElSistema() {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarMSJErrorAlIngresarNITExistente.alIntentarCrearComercializadorConNITExistente()), Matchers.equalTo("Este NIT ya se encuentra creado para otro Comercializador")));

    }

    @Y("se guardan todas las empresas activas de gestion empresa")
    public void seGuardanTodasLasEmpresasActivasDeGestionEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarEmpresasGestionEmpresas.guardar());
    }

    @Dado("el usuario da clic en gestion distribuidor")
    public void elUsuarioDaClicEnGestionComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.OP_GESTION_DISTRIBUIDOR));
    }

    @Cuando("ingresa a la ruta Multinivel Gestión Empresas")
    public void cuandoIngresaALaRutaMultinivelGestionEmpresas() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionEmpresas.gestionDistribuidor());
    }
    @Entonces("ingresa a la ruta Gestion Comercial - Gestion Politica")
    public void cuandoIngresaALaRutaGestionComercialGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionPolitica.gestionPolitica());
    }

    @Y("el usuario ingresa a la ruta Multinivel Gestion Comercializador")
    public void elUsuarioIngresaALaRutaMultinivelGestionComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRutaGestionComercializador.gestionComercializador());
    }

    @Dado("el usuario da clic en el boton Consultar Gestión Empresas")
    public void elUsuarioDaClicEnElBotonConsultarGestionEmpresas() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnFiltrar.btnFiltrar());
    }
    @Dado("el usuario da clic en el boton Consultar Gestion Politica")
    public void elUsuarioDaClicEnElBotonConsultarGestionPolitica() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_FILTRAR_GESTION_POLITICA));
    }
    @Y("el usuario da clic en el boton Consultar Jerarquias")
    public void elUsuarioDaClicEnElBotonConsultarJerarquias() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_FILTRAR_JERARQUIA));
    }

    @Entonces("el sistema guarda las regiones buscadas")
    public void elSistemaGuardaLasRegionesBuscadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarRegionesGestionPolitica.guardar());
    }

    @Entonces("el sistema guarda los paises buscados")
    public void elSistemaGuardaLosPaisesBuscados() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarPaisesGestionPolitica.guardar());
    }

    @Entonces("el usuario da clic en Select de Asociar Empresa")
    public void elUsuarioDaClicEnSelectDeAsociarEmpresa() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_ASOCIAR_EMPRESA));
    }

    @Entonces("el usuario da clic en Select de País")
    public void elUsuarioDaClicEnSelectDePais() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_PAIS));
    }
    @Entonces("el usuario da clic en Select de Región")
    public void elUsuarioDaClicEnSelectDeRegion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_REGION));
    }

    @Y("el sistema muestra las empresas activas en Gestion Comercializador")
    public void elSistemaMuestraLasEmpresasActivasEnGestionComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEmpresasGestionEmpresas.empresas()));
    }
    @Y("el sistema muestra los paises activos en Gestion Comercializador")
    public void elSistemaMuestraLosPaisesActivosEnGestionComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPaisesGestionPolitica.paises()));
    }
    @Y("el sistema muestra las regiones activas en Gestion Comercializador")
    public void elSistemaMuestraLasRegionesActivasEnGestionComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRegionesGestionPolitica.regiones()));
    }

    @Entonces("el sistema guarda las empresas buscadas")
    public void elSistemaGuardaLasEmpresasBuscadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarEmpresasGestionEmpresarial.guardar());
    }
}

package co.com.konex.certification.login.backoffice.stepdefinitions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblInicioGC;
import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador.IngresarModuloGestComercializador;
import co.com.konex.cetificacion.login.backoffice.tasks.login.AbrirPag;
import co.com.konex.cetificacion.login.backoffice.tasks.login.IngresarBack;
import co.com.konex.cetificacion.login.backoffice.tasks.login.Seleccionarem;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class PantallaInicioStepDefinitions {

    @DataTableType
    public TblInicioGC tablaInicioGestionComercializador(Map<String, String> dataTable){
        return new TblInicioGC(
                dataTable.get("inputNit"),
                dataTable.get("inputNombreComercializador"),
                dataTable.get("btnCrearComercializador"),
                dataTable.get("btnLimpiar"),
                dataTable.get("btnFiltrar"),
                dataTable.get("msjFiltrar"));
    }

    @Before
    public void iniciarEscenario() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra logueado en el sistema")
    public void queElUsuarioSeEncuentraLogueadoEnElSistema(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.laPagina());
                OnStage.theActorInTheSpotlight().attemptsTo(IngresarBack.credenciales(tablaUsuarios.get(0)));
                OnStage.theActorInTheSpotlight().attemptsTo(Seleccionarem.empresa(tablaUsuarios.get(0)));
    }

    @Cuando("ingresa a la ruta Administración_Multinivel_Gestion Comercializador")
    public void ingresaALaRutaAdministración_Multinivel_GestionComercializador() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloGestComercializador.gestionarComercializador());

    }

    @Entonces("El sistema debe mostrar el contenido del submódulo. Se visualizará el título Gestión Comercializador")
    public void elSistemaDebeMostrarElContenidoDelSubmoduloSeVisualizaraElTituloGestionComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensajepantallaInicio.inicio(), Matchers.equalTo("Gestión Comercializador")));

    }

    @Entonces("El sistema muestra el siguiente mensaje  Haga clic en el botón consultar para cargar toda la información")
    public void elSistemaMuestraElSiguienteMensajeHagaClicEnElBotonConsultarParaCargarTodaLaInformacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMsjConsultarInformacion.inicio(), Matchers.equalTo("Haga clic en el botón consultar para cargar toda la información")));

    }

    // @CP16357
    @Entonces("El sistema muestra la pantalla de inicio de Gestión Comercializador con los botones Limpiar, Consultar , Crear Comercializador para consultar  los campos NIT y Nombre o código distribuidor")
    public void elSistemaMuestraLaPantallaDeInicioDeGestionComercializadorConLosBotonesLimpiarConsultarCrearComercializadorParaConsultarLosCamposNITYNombreOCodigoDistribuidor(TblInicioGC tablaInicioGestionarComercializador) {
        Question<Boolean> validacionComponentesQuestion = ValidarDatosInicioGestionarComercializador.verGestionComercializador(tablaInicioGestionarComercializador);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacionComponentesQuestion));
    }
}


package co.com.konex.certification.login.backoffice.stepdefinitions.backend;

import co.com.konex.cetificacion.login.backoffice.models.backend.GestionEmpresaData;
import co.com.konex.cetificacion.login.backoffice.questions.backend.general.*;
import co.com.konex.cetificacion.login.backoffice.questions.backend.gestionempresa.ValidarResponseGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.END_POINT;


public class GestionEmpresaBackendStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(END_POINT)));
        OnStage.theActorCalled("User");
        SerenityRest.useRelaxedHTTPSValidation();
    }

    @DataTableType
    public GestionEmpresaData gestionEmpresaData(Map<String, String> entry){
        return new GestionEmpresaData(
                entry.get("id"),
                entry.get("idGrupoEmpresarial"),
                entry.get("nit"),
                entry.get("razonSocial"),
                entry.get("idPais"),
                entry.get("idMunicipio"),
                entry.get("direccion"),
                entry.get("correo"),
                entry.get("telefono"),
                entry.get("dominio"),
                entry.get("estado"),
                entry.get("moneda"),
                entry.get("tipoPago"),
                entry.get("aplicaComercializador"),
                entry.get("aplicaDistribuidor"),
                entry.get("responsableIva"),
                entry.get("obligadoFacturar"),
                entry.get("regimenSimple"),
                entry.get("entidadEstado")
        );
    }

    @Dado("^el usuario consulta por el id (.*) una empresa de gestión empresas$")
    public void elUsuarioConsultaPorElIdUnaEmpresaDeGestiónEmpresas(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarEmpresa.conId(id));
    }

    @Dado("^el usuario consulta una empresa de gestión empresas con los parametros$")
    public void elUsuarioConsultaporParametroEmpresaDeGestiónEmpresas(List<GestionEmpresaData> empresaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarEmpresaParametros.conDatos(empresaData.get(0)));
    }

    @Entonces("^el código de estado del request deberá ser (.*)$")
    public void elCódigoDeEstadoDelRequestDeberáSer(int statusCode) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCodigoEstado.deLaUltimaPeticion(), Matchers.equalTo(statusCode)));
    }

    @Y("^la respuesta del servicio deberá mostrar en (.*) con el valor (.*)$")
    public void laRespuestaDelServicioDeberáMostrarEnIdConElValor(String key, String value) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRespuestaServicio.deLaLlave(key), Matchers.equalTo(value)));
    }

    @Entonces("valida que exitan los campos del último request")
    public void validaQueExitanLosCamposDelÚltimoRequest(DataTable tabla) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposRespuestaServicio.consultaEmpresa(tabla)));
    }

    @Entonces("valida todos los campos de la ultima respuesta del servicio")
    public void validaTodosLosCamposDeLaUltimaRespuestaDelServicio(DataTable table) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarAllRespuestaServicio.allCampos(table)));
    }

    @Dado("^el usuario envía un PUT a gestión empresa al id (.*) con los siguientes datos$")
    public void elUsuarioEnvíaUnPUTAlIdConLosSiguientesDatos(String id, List<GestionEmpresaData> empresaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PutActualizarEmpresa.conIdYDatos(id, empresaData.get(0)));
    }

    @Dado("^el usuario envía un PATCH a gestión empresa al id (.*) con los siguientes datos$")
    public void elUsuarioEnvíaUnPATCHAGestiónEmpresaAlIdConLosSiguientesDatos(String id, List<GestionEmpresaData> empresaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PatchActualizarEmpresa.conDatos(id, empresaData.get(0)));
    }

    @Dado("^el usuario envía un PATCH ccompleto a gestión empresa al id (.*) con los siguientes datos$")
    public void elUsuarioEnvíaUnPATCHCompletoAGestiónEmpresaAlIdConLosSiguientesDatos(String id, List<GestionEmpresaData> empresaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PatchActualizarEmpresaCompleto.conDatos(id, empresaData.get(0)));
    }

    @Y("la respuesta debe contener más de un registro en la última petición")
    public void laRespuestaDebeContenerMásDeUnRegistroEnLaÚltimaPetición() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMasDeUnRegistro.delRequest()));
    }

    @Y("^la respuesta del servicio deberá contener el campo (.*) con el valor (.*)$")
    public void laRespuestaDelServicioDeberáContenerElCampoIdConElValor(String key, String valor) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarContieneInfoRespuestaServicio.deLaLlave(key, valor)));
    }

    @Dado("el usuario envía un POST a gestión empresa con los datos")
    public void elUsuarioEnvíaUnPOSTAGestiónEmpresaConLosDatos(List<GestionEmpresaData> empresaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PostCrearEmpresa.conLosDatos(empresaData.get(0)));
    }

    @Entonces("^el response obtenido del post de gestión empresa debe coincidir con el de el id guardado")
    public void elResponseObtenidoDelPostDeGestiónEmpresaDebeCoincidirConElDeElIdGuardado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResponseGestionEmpresa.gestionEmpresa()));
    }

    @Dado("^el usuario consulta el comercializador de la empresa con id (.*)$")
    public void elUsuarioConsultaElComercializadorDeLaEmpresaConId(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(GetComercializadorEmpresa.conId(id));
    }
}

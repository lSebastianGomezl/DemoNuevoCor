package co.com.konex.certification.login.backoffice.stepdefinitions.login;


import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.tasks.login.AbrirPag;
import co.com.konex.cetificacion.login.backoffice.tasks.login.IngresarBack;
import co.com.konex.cetificacion.login.backoffice.tasks.login.IngresarBackRecuperarClave;
import co.com.konex.cetificacion.login.backoffice.tasks.login.Seleccionarem;
import co.com.konex.cetificacion.login.backoffice.util.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.webdriver.driverproviders.webdrivermanager.WebDriverManagerSetup;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.WebdriverManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static co.com.konex.cetificacion.login.backoffice.util.ConstantesConetionBaseDeDatos.FILE_PATH_LAST_QUERY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MyStepdefinitions {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("tipoDocumento"), entry.get("usuario"), entry.get("contrasenna"));
    }

    //Caso 1
    @Dado("que el usuario ingresa al Backoffice")
    public void queElUsuarioIngresaAlBackoffice() {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.laPagina());
    }

    @Cuando("digita usuario y contrasenna del usuario")
    public void digitaUsuarioYContrasennaDelUsuario(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarBack.credenciales(tablaUsuarios.get(0)));
    }

    @Y("selecciona empresa")
    public void seleccionaEmpresa(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionarem.empresa(tablaUsuarios.get(0)));
    }

    @Dado("que el usuario se loguee en el sistema")
    public void queElUsuarioSeLogueeEnElSistema(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.laPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarBack.credenciales(tablaUsuarios.get(0)));
    }

    @Y("que el usuario se loguee en el sistema para recuperacion de clave")
    public void queElUsuarioSeLogueeEnElSistemaParaRecuperacionDeClave(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarBackRecuperarClave.credenciales(tablaUsuarios.get(0)));
    }

    @After
    public void cerrarNavegador() throws IOException, InterruptedException {
        //KillBrowser.processes("chrome");
        SerenityWebdriverManager.inThisTestThread().clearCurrentActiveDriver();
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
    }

    @Cuando("^realizo la consulta a la base de datos ADM con archivo (.*)$")
    public void realizoLaConsultaALaBaseDeDatosADM(String rutaDelArchivo){
        OracleDatabaseConnection.consultaBaseDeDatosADM(rutaDelArchivo);
    }

    @Cuando("^realizo la consulta a la base de datos ADM con query (.*)$")
    public void realizoLaConsultaALaBaseDeDatosADMQuery(String query){
        OracleDatabaseConnection.consultaBaseDeDatosADM(query);
    }

    @Entonces("^valido los datos correspondientes de la base de datos ADM$")
    public void validoLosDatosBaseDeDatosADM(){
        /*
         * El siguiente código debe ser integrado en una Question,
         * esto solo es informativo, para que vean como funciona.
         * Este ejemplo fue realizado con una consulta a la base de datos Loterias Y Sorteos
         * Para que esto funcione deben ejecutar la consulta a la base de datos,
         * ya que esto toma la ultima ejecución del query a la base de datos.
         */

        CsvFileHandler csvFileHandler = new CsvFileHandler(FullPathResolver.getFullPath(FILE_PATH_LAST_QUERY));

        // Busca un dato en la columna "CODIGO" con el valor "13"
        String result = csvFileHandler.findDataByColumn("CODIGO", "13");

        // Imprime el resultado
        System.out.println(result);

        // Obtiene todos los datos de la columna "NOMBRE"
        List<String> nombreColumnData = csvFileHandler.getColumnData("NOMBRE");
        System.out.println("Datos de la columna 'NOMBRE': " + nombreColumnData);

    }
}

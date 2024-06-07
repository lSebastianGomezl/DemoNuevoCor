package co.com.konex.certification.login.backoffice.stepdefinitions.gestionempresas;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.ValidarEditarElemento;
import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.LlenarFormularioFiltroEmpresas;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitionsFiltros {

    @DataTableType
    public TablaDeDatosFiltros tablaDeDatosFiltrosInsertar(Map<String, String> entry) {
        return new TablaDeDatosFiltros(
                entry.get("NIT"),
                entry.get("nombreOCodigo"),
                entry.get("pais"),
                entry.get("comercializador"),
                entry.get("distribuidor"));
    }


    @Y("el usuario da clic en el boton consultar")
    public void elUsuarioDaClicEnElBotonConsultar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnFiltrar.btnFiltrar());
    }

    @Entonces("el sistema muestra una tabla con las empresas registradas")
    public void elSistemaMuestraUnaTablaConLasEmpresasRegistradas(DataTable tabla) {
        List<Map<String, String>> datos = tabla.asMaps(String.class, String.class);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarColumnasTablaGestionEmpresa.columnasTablaGestionEmpresa(datos), Matchers.is(true)));
    }

    @Y("el usuario ingresa los datos de empresas en los campos de filtro")
    public void elUsuarioIngresaDatosDeEmpresasEnLosCamposDeFiltro(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPaisFiltro.seleccionPaisDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroComercializador.seleccionOpcionComercializadorDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroDistribuidor.seleccionOpcionDistribuidorDeLista(tablaDeDatosFiltros.get(0)));

    }

    @Y("el usuario diligencia los campos del formulario para filtrar")
    public void diligencieLosCamposDelFormulario(List<TablaDeDatosFiltros> tablaDeDatosFiltrosInsertar) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioFiltroEmpresas.conLosDatos(tablaDeDatosFiltrosInsertar.get(0)));

    }

    @Entonces("el sistema mostrara el respectivo mensaje ge")
    public void elSistemaMostraraElRespectivoMensaje() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensajeFiltro.msjFiltroSinresultados(), Matchers.equalTo("No se encontraron resultados que coincidan con los criterios de búsqueda")));
    }

    @Y("El usuario diligencia el campo de filtro con un NIT existente ge")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNITExistente(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));

    }

    @Entonces("el sistema valida el NIT ingresado y muestra la empresa con ese NIT asociado")
    public void elSistemaValidaElNITIngresadoYMuestraLaEmpresaConEseNITAsociado(List<String> NIT) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltroConNit.resultadosFiltroConNit(), Matchers.equalTo(NIT.get(1))));

    }

    @Y("El usuario diligencia el campo de filtro con un Nombre de empresa existente")
    public void elUsuarioDiligenciaElCampoDeFiltroConUnNombreDeEmpresaExistente(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaDeDatosFiltros.get(0)));
    }

    @Entonces("el sistema valida el nombre ingresado y muestra las empresas con ese nombre asociado")
    public void elSistemaValidaElNombreIngresadoYMuestraLasEmpresasConEseNombreAsociado(List<String> nombreOCodigo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltroConNombre.resultadosFiltroConNombre(), Matchers.equalTo(nombreOCodigo.get(1))));
    }

    @Y("El usuario selecciona un pais de las lista de paises")
    public void elUsuarioSeleccionaUnPaisDeLasListaDePaises(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPaisFiltro.seleccionPaisDeLista(tablaDeDatosFiltros.get(0)));
    }

    @Entonces("el sistema valida el pais seleccionado y muestra las empresas con ese pais asociado")
    public void elSistemaValidaElPaisSeleccionadoYMuestraLasEmpresasConEsePaisAsociado(List<String> Pais) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltroConPais.resultadosFiltroConPais(), Matchers.equalTo(Pais.get(1))));
    }

    @Y("El usuario selecciona la opcion Si de la lista")
    public void elUsuarioSeleccionaLaOpcionSiDeLaLista() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarSiComercializadorFiltro.opcionSiComercializador());
    }

    @Entonces("el sistema valida la opcion seleccionada y muestra las empresas que aplican como comercializador")
    public void elSistemaValidaLaOpcionSeleccionadaYMuestraLasEmpresasQueAplicanComoComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResulFiltroComercializador.resulFiltroSiComercializador()));
    }

    @Y("El usuario selecciona la opcion No de las lista")
    public void elUsuarioSeleccionaLaOpcionNoDeLasLista() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarNoComercializadorFiltro.opcionNoComercializador());
    }

    @Entonces("el sistema valida la opcion seleccionada y muestra las empresas que no aplican como comercializador")
    public void elSistemaValidaLaOpcionSeleccionadaYMuestraLasEmpresasQueNoAplicanComoComercializador() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResulFiltroNoComercializador.resulFiltro()));
    }

    @Y("El usuario selecciona la opcion Si")
    public void elUsuarioSeleccionaLaOpcionSi() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarSiDistribuidorFiltro.opcionSiDistribuidor());
    }

    @Entonces("el sistema valida la opcion seleccionada y muestra las empresas que aplican como Distribuidor")
    public void elSistemaValidaLaOpcionSeleccionadaYMuestraLasEmpresasQueAplicanComoDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResulFiltroSiDistribuidor.resulFiltro()));
    }

    @Y("El usuario selecciona la opcion No")
    public void elUsuarioSeleccionaLaOpcionNo() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarNoDistribuidorFiltro.opcionNoDistribuidor());
    }

    @Entonces("el sistema valida la opcion seleccionada y muestra las empresas que no aplican como Distribuidor")
    public void elSistemaValidaLaOpcionSeleccionadaYMuestraLasEmpresasQueNoAplicanComoDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResulFiltroNoDistribuidor.resulFiltro()));
    }

    @Y("el usuario ingresa datos de empresas existentes en los campos de filtro")
    public void elUsuarioIngresaDatosDeEmpresasExistentesEnLosCamposDeFiltro(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPaisFiltro.seleccionPaisDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroComercializador.seleccionOpcionComercializadorDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroDistribuidor.seleccionOpcionDistribuidorDeLista(tablaDeDatosFiltros.get(0)));
    }

    @Entonces("el sistema valida los datos ingresados y muestra la empresa con esos datos asociados")
    public void elSistemaValidaLosDatosIngresadosYMuestraLaEmpresaConEsosDatosAsociados(TablaDeDatosFiltros tablaDeDatosFiltros) {
        Question<Boolean> validacionComponentesQuestion = ValidarResultFiltroEmpresas.verResultDeRegistro(tablaDeDatosFiltros);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacionComponentesQuestion));
    }

    @Y("El usuario diligencia los campos de filtro")
    public void elUsuarioDiligenciaLosCamposDeFiltro(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPaisFiltro.seleccionPaisDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroComercializador.seleccionOpcionComercializadorDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroDistribuidor.seleccionOpcionDistribuidorDeLista(tablaDeDatosFiltros.get(0)));
    }

    @Y("El usuario diligencia los campos de filtro de Gestión Empresa")
    public void elUsuarioDiligenciaLosCamposDeFiltroGestEmp(List<TablaDeDatosFiltros> tablaDeDatosFiltros) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNit.ingresarNitEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.ingresarNombreEnCampoFiltro(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPaisFiltro.seleccionPaisDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroComercializador.seleccionOpcionComercializadorDeLista(tablaDeDatosFiltros.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarFiltroDistribuidor.seleccionOpcionDistribuidorDeLista(tablaDeDatosFiltros.get(0)));
    }

    @Y("El usuario selecciona el boton limpiar ge")
    public void elUsuarioSeleccionaElBotonLimpiar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBtnLimpiar.limpiarCampos());

    }

    @Entonces("^el sistema muestra el mensaje (.*)$")
    public void elSistemaMuestraElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionEmpresa.MENSAJE_ERROR_FILTRO), Matchers.equalTo(mensaje)));
    }

    @Entonces("el sistema no permite editar el campo NIT gestion empresas")
    public void elSistemaNoPermiteEditarElCampoNitGe() {
        String campoNit = ContenedorDeObjetosGestionEmpresa.INPUT_NIT.resolveFor(OnStage.theActorInTheSpotlight()).getValue();
        System.out.println("El contenido del campo es: " + campoNit);
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarEditarElemento.delElemento(ContenedorDeObjetosGestionEmpresa.INPUT_NIT)));

    }


}

package co.com.konex.certification.login.backoffice.stepdefinitions.gestionempresas;

import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.pantallainicio.*;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.pantallainicio.IngresarModuloGestionEmpre;
import co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.pantallainicio.SeleccionarBotonVerFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

public class StepDefinitionsPantalla_inicio {
    @Cuando("ingresa a la ruta Administración_Multinivel_GestiónEmpresas")
    public void ingresaALaRutaAdministración_Multinivel_GestiónEmpresas() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloGestionEmpre.gestionEmpresa());
    }

    @Entonces("el sistema muestra la pantalla inicial de gestión empresas")
    public void elSistemaMuestraLaPantallaInicialDeGestiónEmpresas() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaModulo.textoModulo(), Matchers.equalTo("Gestión Empresa")));

    }
    @Y("el usuario da clic en Consultar")
    public void daClicEnElVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.desplegarPanelDeFiltros());

    }
    @Entonces("el sistema despliega el panel de filtros ge")
    public void elSistemaDespliegaElPanelDeFiltros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDesplieguePanelDeFiltro.panelDeFiltroDesplegado(), Matchers.equalTo("Filtrar")));

    }
    @Y("el usuario vuelve a dar clic en el boton Ver filtros ge")
    public void elUsuarioVuelveADarClicEnElBotonVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.desplegarPanelDeFiltros());

    }

    @Entonces("el sistema oculta el panel de filtro ge")
    public void elSistemaOcultaElPanelDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarOcultarPanelDeFiltro.panelDeFiltroOculto(), Matchers.equalTo("Gestión Empresa")));

    }

    @Entonces("^el usuario valida el mensaje de busqueda (.*)$")
    public void elUsuarioValidaElMensajeDeBusqueda(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionEmpresa.MENSAJE_INFORMATIVO), Matchers.equalTo(mensaje)));
    }

    @Entonces("el sistema debe mostrar los elementos de Gestión Empresas")
    public void elSistemaDebeMostrarLosElementosDeGestionEmpresas() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementosGestionEmpresa.elementosGestionEmpresas()));
    }

    @Y("el usuario valida el botón limpiar")
    public void elUsuarioValidaElBotonLimpiar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGestionEmpresa.BTN_LIMPIAR_FILTRO)));
    }

    @Y("el usuario valida el botón consultar")
    public void elUsuarioValidaElBotonConsultar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(ContenedorDeObjetosGestionEmpresa.BTN_FILTRAR)));
    }
}

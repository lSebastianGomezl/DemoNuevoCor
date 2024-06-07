package co.com.konex.certification.login.backoffice.stepdefinitions.gestiondistribuidor;

import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial.ValidarDesplieguePanelDeFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial.ValidarOcultarPanelDeFiltro;
import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial.ValidarPantallaInicial;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.pantallainicial.IngresarModuloGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.pantallainicial.SeleccionarBotonVerFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

public class StepDefinitionsPantallaInicialDistribuidor {

    @Cuando("ingresa a la ruta Administración_Multinivel_GestiónDistribuidor")
    public void ingresaALaRutaAdministración_Multinivel_GestiónDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarModuloGestionDistribuidor.modGestionDistribuidor());
    }

    @Entonces("el sistema muestra la pantalla inicial de gestión distribuidor")
    public void elSistemaMuestraLaPantallaInicialDeGestiónDistribuidor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaInicial.textoModulo(), Matchers.equalTo("Gestión Distribuidor")));

    }


    @Y("da clic en el boton Ver filtros")
    public void daClicEnElBotonVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.panelDeFiltros());
    }

    @Entonces("el sistema despliega el panel de filtros")
    public void elSistemaDesplliegaElPanelDeFiltros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDesplieguePanelDeFiltro.panelDeFiltroDesplegado(), Matchers.equalTo("Filtrar")));

    }

    @Y("el usuario vuelve a dar clic en el boton Ver filtros")
    public void elUsuarioVuelveADarClicEnElBotonVerFiltros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonVerFiltros.panelDeFiltros());

    }

    @Entonces("el sistema oculta el panel de filtro")
    public void elSistemaOcultaElPanelDeFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarOcultarPanelDeFiltro.panelDeFiltroOculto(), Matchers.equalTo("Gestión Distribuidor")));

    }

    @Y("el usuario da clic en el boton Consultar gestion distribuidor")
    public void elUsuarioDaClicEnElBotonConsultarGestionDistribuidor() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_FILTRAR));
    }

    @Y("^valida que exista la barra de alerta con el mensaje (.*)$")
    public void validaQueExistaLaBarraDeAlertaConElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionDistribuidor.BARRA_INFORMATIVA), Matchers.equalTo(mensaje)));
    }

    @Y("^v2 valida que exista la barra de alerta con el mensaje (.*)$")
    public void validaQueExistaLaBarraDeAlertaConElMensajev2(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ContenedorDeObjetosGestionDistribuidor.BARRA_INFORMATIVA_V2), Matchers.equalTo(mensaje)));
    }
}

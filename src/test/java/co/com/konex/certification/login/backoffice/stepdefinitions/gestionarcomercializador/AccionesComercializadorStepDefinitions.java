package co.com.konex.certification.login.backoffice.stepdefinitions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AccionesComercializadorStepDefinitions {

    @Entonces("^el sistema muestra el mensaje con (.*)$")
    public void elSistemaMuestraElMensajeDeCreacionExitosa(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ALERTA_CREACION_EXITOSA, isVisible()).forNoMoreThan(20).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(ALERTA_CREACION_EXITOSA), Matchers.equalTo(mensaje)));
        System.out.println("El mensaje en el Toast es: " + mensaje);
    }

    @Y("el usuario da clic en el botón guardar crear comercializadora")
    public void elUsuarioDaClicEnElBotonGuardarCrearComercializadora() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(BTN_GUARDAR_COMERCIALIZADORA, isVisible()).forNoMoreThan(10).seconds());
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BTN_GUARDAR_COMERCIALIZADORA));
    }

    @Entonces("^el sistema muestra el titulo del modulo (.*)$")
    public void elSistemaMuestraElTituloDelModulo(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(TITULO_MODULO, isVisible()).forNoMoreThan(10).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(TITULO_MODULO), Matchers.equalTo(mensaje)));
        System.out.println("El titulo del modulo es: " + mensaje);
    }

    @Y("el sistema muestra el botón Guardar")
    public void elSistemaMuestraElBotonGuardar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(BTN_GUARDAR_COMERCIALIZADORA)));
    }

    @Y("el sistema muestra el botón Salir")
    public void elSistemaMuestraElBotonSalir() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(BTN_SALIR_EDITAR)));
    }

    @Y("el sistema muestra el botón Aceptar")
    public void elSistemaMuestraElBotonAceptar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(BTN_SI_CREAR_COMERCIALIZADOR)));
    }

    @Y("el sistema muestra el botón Cancelar")
    public void elSistemaMuestraElBotonCancelar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVisibilidadElemento.delElemento(BTN_NO_CREAR_COMERCIALIZADOR)));
    }

    @Y("el sistema muestra la ventana de confirmacion de crear comercializador")
    public void elSistemaMuestraVentanaDeConfirmacionActivar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarVentanaActivarComercializador.activarInactivarComercializador()));
        String mensaje = ContenedorDeObjetosGestionarComercializador.VENTANA_CONFIRMACION.resolveFor(OnStage.theActorInTheSpotlight()).getText();
        System.out.println("Se muestra la ventana de confirmación con el mensaje: " + mensaje);

    }

    @Entonces("el usuario valida las alertas de los campos")
    public void elUsuarioValidaLasAlertasDeLosCampos() {
        OnStage.theActorInTheSpotlight()
                .should(
                        GivenWhenThen.seeThat(ValidarAlertaCampoNit.validarAlertaCampoNit()),
                        GivenWhenThen.seeThat(ValidarAlertaCampoRazonSocial.validarAlertaCampoRazonSocial()),
                        GivenWhenThen.seeThat(ValidarAlertaCampoDireccion.validarAlertaCampoDireccion()),
                        GivenWhenThen.seeThat(ValidarAlertaCampoCorreoElectronico.validarAlertaCampoCorreoElectronico()),
                        GivenWhenThen.seeThat(ValidarAlertaCampoTelefono.validarAlertaCampoTelefono()),
                        GivenWhenThen.seeThat(ValidarAlertaCampoDominio.validarAlertaCampoDominio())
                );
    }

    @Entonces("el usuario valida las caracteristicas de los campos")
    public void elUsuarioValidaLasCaracteristicasDeLosCampos() {
        List<Question<Boolean>> validaciones = ValidacionesCampos.obtenerValidaciones();
        for (Question<Boolean> validacion : validaciones) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validacion));
        }
    }

    @Y("^el usuario valida los campos desplegados de (.*)$")
    public void elUsuarioValidaLosCamposDesplegados(String pais) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCamposDesplegados.deGestionComercializador(pais)));
    }

    @Cuando("el botón guardar esté inhabilitado")
    public void elBotonGuardarEsteInhabilitado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(BTN_GUARDAR_COMERCIALIZADORA)));
    }

    @Entonces("el botón guardar se habilita")
    public void elBotonGuardarSeHabilita() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElementoDeshabilitado.delElemento(BTN_GUARDAR_COMERCIALIZADORA), Matchers.equalTo(false)));
    }

    @Y("el usuario da clic en parametrización Colombia")
    public void elUsuarioDaClicEnParametrizacionColombia() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BTN_CONFIGURACION_COLOMBIA));
    }

    @Y("el usuario da clic en parametrización Costa de Marfil")
    public void elUsuarioDaClicEnParametrizacionCosta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BTN_CONFIGURACION_COSTA_MARFIL));
    }

}

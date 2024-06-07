package co.com.konex.cetificacion.login.backoffice.tasks.login;

import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class IngresarBackRecuperarClave implements Task {
    private TablaUsuarios tablaUsuarios;

    public IngresarBackRecuperarClave(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static IngresarBackRecuperarClave credenciales(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(IngresarBackRecuperarClave.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosLogin.TIPO_DOCUMENTO),
                Click.on(ContenedorDeObjetosLogin.TIPO_DOCUMENTO_OPTION.of(tablaUsuarios.getTipoDocumento())),
                Enter.theValue(tablaUsuarios.getUsuario()).into(ContenedorDeObjetosLogin.USER),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(ContenedorDeObjetosLogin.PASSWORD),
                Click.on(ContenedorDeObjetosLogin.BTN_DEMO_BIOMETRICO)
        );

        actor.attemptsTo(
                Click.on(ContenedorDeObjetosLogin.BTN_SING_IN_RECUPERAR)
        );

        if (ContenedorDeObjetosLogin.BTN_INGRESAR_HUELLA.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosLogin.BTN_INGRESAR_HUELLA),
                    WaitUntil.the(ContenedorDeObjetosLogin.INDICADOR_CARGANDO_HUELLA, isNotVisible()).forNoMoreThan(15).seconds(),
                    Click.on(ContenedorDeObjetosLogin.BTN_ACEPTAR_HUELLA)
            );
            actor.attemptsTo(
                    WaitUntil.the(ContenedorDeObjetosLogin.BTN_ACEPTAR_HUELLA, isNotVisible()).forNoMoreThan(60).seconds()
            );
        }

    }
}

package co.com.konex.cetificacion.login.backoffice.tasks.login;


import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.ALERTA_CREACION_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class IngresarBack implements Task {

    private TablaUsuarios tablaUsuarios;

    public IngresarBack(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static IngresarBack credenciales(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(IngresarBack.class, tablaUsuarios);
    }

    private static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try (InputStream input = IngresarBack.class.getClassLoader().getResourceAsStream(filePath)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + filePath);
                return properties;
            }

            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties properties = new Properties();

        String documentType = properties.getProperty("tipoDocumento");
        String user = properties.getProperty("usuario");
        String password = properties.getProperty("contrasenna");

        actor.attemptsTo(
                Click.on(ContenedorDeObjetosLogin.TIPO_DOCUMENTO),
                Click.on(ContenedorDeObjetosLogin.TIPO_DOCUMENTO_OPTION.of(documentType)),
                Enter.theValue(user).into(ContenedorDeObjetosLogin.USER),
                Enter.theValue(password).into(ContenedorDeObjetosLogin.PASSWORD),
                WaitUntil.the(ALERTA_CREACION_EXITOSA, isNotVisible()).forNoMoreThan(30).seconds(),
                Click.on(ContenedorDeObjetosLogin.BTN_DEMO_BIOMETRICO)
        );

        actor.attemptsTo(
                Click.on(ContenedorDeObjetosLogin.BTN_SING_IN),
                Click.on(ContenedorDeObjetosLogin.BTN_INGRESAR_HUELLA),
                WaitUntil.the(ContenedorDeObjetosLogin.INDICADOR_CARGANDO_HUELLA, isNotVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(ContenedorDeObjetosLogin.BTN_ACEPTAR_HUELLA, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ContenedorDeObjetosLogin.BTN_ACEPTAR_HUELLA)
        );

        actor.attemptsTo(
                WaitUntil.the(ContenedorDeObjetosLogin.BTN_ACEPTAR_HUELLA, isNotVisible()).forNoMoreThan(60).seconds()
        );
    }

}

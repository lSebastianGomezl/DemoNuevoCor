package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMSJErrorAlIngresarNITExistente implements Question<String> {
    public static ValidarMSJErrorAlIngresarNITExistente alIntentarCrearComercializadorConNITExistente() {
        return new ValidarMSJErrorAlIngresarNITExistente();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTENTE).answeredBy(actor);
    }
}
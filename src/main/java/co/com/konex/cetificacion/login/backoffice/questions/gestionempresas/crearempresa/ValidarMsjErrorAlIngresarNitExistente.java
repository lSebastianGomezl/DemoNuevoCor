package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorAlIngresarNitExistente implements Question<String> {
    public static ValidarMsjErrorAlIngresarNitExistente alIntentarCrearUnRegistroConUnNitExistente() {
        return new ValidarMsjErrorAlIngresarNitExistente();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTE).answeredBy(actor);
    }

}

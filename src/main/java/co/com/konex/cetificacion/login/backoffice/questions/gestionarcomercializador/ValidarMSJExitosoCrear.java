package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidarMSJExitosoCrear implements Question<String> {
    public static ValidarMSJExitosoCrear crearComercializador() {
        return new ValidarMSJExitosoCrear();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_EXITOSO_CREAR_COMERCIALIZADOR).answeredBy(actor);
    }
}

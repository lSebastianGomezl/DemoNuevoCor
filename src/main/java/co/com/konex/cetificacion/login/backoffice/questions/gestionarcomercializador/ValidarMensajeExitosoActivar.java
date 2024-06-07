package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensajeExitosoActivar implements Question<String> {

    public static ValidarMensajeExitosoActivar activar() {
        return new ValidarMensajeExitosoActivar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_EXITOSO_ACTIVAR).answeredBy(actor);
    }
}

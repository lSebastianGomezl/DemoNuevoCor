package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensajeExitosoActivaroInactivar implements Question<String> {

    public static ValidarMensajeExitosoActivaroInactivar activaroInactivar() {
        return new ValidarMensajeExitosoActivaroInactivar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_EXITOSO_ACTIVAR_INACTIVAR).answeredBy(actor);
    }
}

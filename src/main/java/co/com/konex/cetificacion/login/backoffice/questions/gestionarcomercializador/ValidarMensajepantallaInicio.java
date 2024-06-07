package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensajepantallaInicio implements Question<String> {
    public static ValidarMensajepantallaInicio inicio() {
        return new ValidarMensajepantallaInicio();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.TXT_MSJ_INICIO).answeredBy(actor);

    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjConsultarInformacion implements Question<String> {
    public static ValidarMsjConsultarInformacion inicio() {
        return new ValidarMsjConsultarInformacion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.TXT_MSJ_CONSULTA_INFO).answeredBy(actor);

    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarCamposrResaltados implements Question {
    public static ValidarCamposrResaltados bordeRojo() {
        return new ValidarCamposrResaltados();
    }
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionDistribuidor.VALIDAR_BORDES_ROJO_EN_CAMPOS,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }

}

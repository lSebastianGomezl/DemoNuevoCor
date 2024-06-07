package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCodigoEstado implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getStatusCode();
    }
    public static ValidarCodigoEstado deLaUltimaPeticion(){
        return new ValidarCodigoEstado();
    }
}

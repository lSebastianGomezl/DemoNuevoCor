package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRespuestaServicio implements Question<String> {
    private String key;

    public ValidarRespuestaServicio(String key) {
        this.key = key;
    }

    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getBody().path(key).toString().replaceAll("[{}\\[\\]()]","");
    }
    public static ValidarRespuestaServicio deLaLlave(String key){
        return new ValidarRespuestaServicio(key);
    }
}

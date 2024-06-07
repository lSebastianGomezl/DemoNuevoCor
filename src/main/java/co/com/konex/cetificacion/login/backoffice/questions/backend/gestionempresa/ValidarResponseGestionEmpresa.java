package co.com.konex.cetificacion.login.backoffice.questions.backend.gestionempresa;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarResponseGestionEmpresa implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String postBodyResponse = actor.recall("ultimoResponseBody");
        String postBodyConsulta = SerenityRest.lastResponse().getBody().print();
        if (postBodyResponse.equals(postBodyConsulta)) {
            return true;
        }
        return false;
    }
    public static ValidarResponseGestionEmpresa gestionEmpresa(){
        return new ValidarResponseGestionEmpresa();
    }
}

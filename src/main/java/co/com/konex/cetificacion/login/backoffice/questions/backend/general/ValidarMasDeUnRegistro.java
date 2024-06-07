package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.json.JSONArray;

import java.util.logging.Logger;

public class ValidarMasDeUnRegistro implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String response = SerenityRest.lastResponse().asString();
        JSONArray jsonArray = new JSONArray(response);
        int cantidadRegistros = jsonArray.length();
        Logger.getAnonymousLogger().info("Cantidad de registros: " + cantidadRegistros);
        if(cantidadRegistros>1){
            return true;
        }
        return false;
    }
    public static ValidarMasDeUnRegistro delRequest(){
        return new ValidarMasDeUnRegistro();
    }
}

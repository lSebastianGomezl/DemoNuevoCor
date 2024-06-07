package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ValidarContieneInfoRespuestaServicio implements Question<Boolean> {
    private String key;
    private String valor;

    public ValidarContieneInfoRespuestaServicio(String key, String valor) {
        this.key = key;
        this.valor = valor;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String response = SerenityRest.lastResponse().asString();
        List<String> ids = new ArrayList<>();

        try {
            // Convertir la cadena de respuesta JSON en un JSONArray
            JSONArray jsonArray = new JSONArray(response);

            // Iterar sobre el JSONArray para extraer los IDs y almacenarlos en la lista
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String id = String.valueOf(jsonObject.get(key));
                ids.add(id.replaceAll("[{}\\[\\]()]",""));
            }
        }catch (Exception e){
        }
        return buscarNumero(ids, valor);
    }
    private static boolean buscarNumero(List<String> lista, String numero) {
        return lista.contains(numero);
    }

    public static ValidarContieneInfoRespuestaServicio deLaLlave (String key, String valor){
        return new ValidarContieneInfoRespuestaServicio(key, valor);
    }
}

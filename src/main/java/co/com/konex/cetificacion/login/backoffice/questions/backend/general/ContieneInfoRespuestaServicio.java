package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.LetrasYNumerosAleatorios;
import co.com.konex.cetificacion.login.backoffice.util.NITAleatorio;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ContieneInfoRespuestaServicio implements Question<String> {
    private String key;

    public ContieneInfoRespuestaServicio(String key) {
        this.key = key;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.forget("valorNoDuplicado");
        String response = SerenityRest.lastResponse().asString();
        List<String> ids = new ArrayList<>();

        try {
            // Convertir la cadena de respuesta JSON en un JSONArray
            JSONArray jsonArray = new JSONArray(response);

            // Iterar sobre el JSONArray para extraer los IDs y almacenarlos en la lista
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String id = String.valueOf(jsonObject.get(key));
                ids.add(id);
            }
        } catch (Exception e) {
        }
        String valor = "";
        do {
            switch (key) {
                case "id":
                    valor = String.valueOf(LetrasYNumerosAleatorios.generarNumeroAleatorioEntre(1, 998));
                    break;
                case "nit":
                    valor = NITAleatorio.generateRandomNit();
                    break;
                case "razonSocial":
                    valor = GeneradorNombres.razonSocial();
                    break;
                default:
                    valor = "";
                    break;
            }
        } while (ids.contains(valor));
        actor.remember("valorNoDuplicado",valor);
        return valor;
    }


    public static ContieneInfoRespuestaServicio deLaLlave(String key) {
        return new ContieneInfoRespuestaServicio(key);
    }
}

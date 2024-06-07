package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.*;

public class ValidarAllRespuestaServicio implements Question<Boolean> {
    private DataTable campos;

    public ValidarAllRespuestaServicio(DataTable campos) {
        this.campos = campos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<List<String>> data = campos.asLists(String.class);
        Map<String, String> camposAllEsperados = new HashMap<>();
        List<String> camposEsperados = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (List<String> fila : data) {
            for (String celda : fila) {
                if(i==1){
                    camposAllEsperados.put(camposEsperados.get(j),celda.replaceAll("[{}\\[\\]()]","").trim());
                    j++;
                }
                camposEsperados.add(celda.replaceAll("[{}\\[\\]()]","").trim());
                //System.out.println(celda.replaceAll("[{}\\[\\]()]","").trim());
            }
            i++;
        }

        Map<String, String> camposRequest = new HashMap<>();
        Map<String, Object> jsonResponse = SerenityRest.lastResponse().jsonPath().get();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(jsonResponse);

        // Iterar sobre las claves y valores del JSON
        Iterator<Map.Entry<String, JsonNode>> fieldsIterator = jsonNode.fields();
        while (fieldsIterator.hasNext()) {
            Map.Entry<String, JsonNode> entry = fieldsIterator.next();
            String clave = entry.getKey().replaceAll("[{}\\[\\]()]", "").trim(); // Obtener la clave y limpiarla
            String valor = entry.getValue().toString().replaceAll("[{}\\[\\]()]", "").trim(); // Obtener el valor y limpiarlo
            camposRequest.put(clave, valor); // Agregar la clave y el valor al mapa
        }
        return sonMapasIguales(camposAllEsperados,camposRequest);
    }

    public static boolean sonMapasIguales(Map<String, String> map1, Map<String, String> map2) {
        if (map1 == null || map2 == null || map1.size() != map2.size()) {
            return false;
        }

        // Iterar sobre las claves
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String clave = entry.getKey();
            String valor1 = entry.getValue();
            String valor2 = map2.get(clave);
            if (!Objects.equals(valor1, valor2)) {
                return false;
            }
        }

        return true;
    }

    public static ValidarAllRespuestaServicio allCampos(DataTable campos) {
        return new ValidarAllRespuestaServicio(campos);
    }
}

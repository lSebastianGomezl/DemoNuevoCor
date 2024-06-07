package co.com.konex.cetificacion.login.backoffice.questions.backend.general;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ValidarCamposRespuestaServicio implements Question<Boolean> {
    private DataTable campos;

    public ValidarCamposRespuestaServicio(DataTable campos) {
        this.campos = campos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<List<String>> data = campos.asLists(String.class);
        List<String> camposEsperados = new ArrayList<>();
        for (List<String> fila : data) {
            for (String celda : fila) {
                camposEsperados.add(celda.replaceAll("[{}\\[\\]()]","").trim());
            }
        }
        List<String> camposResponse = new ArrayList<>();
        Map<String, Object> jsonResponse = SerenityRest.lastResponse().jsonPath().get();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(jsonResponse);

        // Iterar sobre las claves y valores del JSON
        Iterator<String> fieldNames = jsonNode.fieldNames();
        while (fieldNames.hasNext()) {
            String clave = fieldNames.next();
            String valor = jsonNode.get(clave).toString();
            camposResponse.add(clave.replaceAll("[{}\\[\\]()]","").trim());
        }


        return tienenMismosDatosSinOrden(camposEsperados,camposResponse);
    }

    private static boolean tienenMismosDatosSinOrden(List<String> lista1, List<String> lista2) {
        return lista1.size() == lista2.size() && lista1.containsAll(lista2) && lista2.containsAll(lista1);
    }

    public static ValidarCamposRespuestaServicio consultaEmpresa(DataTable campos) {
        return new ValidarCamposRespuestaServicio(campos);
    }
}

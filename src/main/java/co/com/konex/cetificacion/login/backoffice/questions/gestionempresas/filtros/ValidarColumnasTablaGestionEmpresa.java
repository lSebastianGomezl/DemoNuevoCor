package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.List;
import java.util.Map;

public class ValidarColumnasTablaGestionEmpresa implements Question<Boolean> {

    private final List<Map<String, String>> datos;

    public ValidarColumnasTablaGestionEmpresa(List<Map<String, String>> datos) {
        this.datos = datos;
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        String[] columnas = {"NIT","NOMBRE EMPRESA","PAÍS","DIRECCIÓN","MONEDA","TIPOS DE PAGO","COMERCIALIZADOR","DISTRIBUIDOR","ACCIONES"};
        for (Map<String, String> fila : datos) {
            for (int i = 0; i < columnas.length; i++) {
                String valorFila = fila.get(columnas[i]);
                String valorPagina = Text.of(ContenedorDeObjetosGestionEmpresa.ENCABEZADO_GESTION_EMPRESA.of(String.valueOf(i + 1))).answeredBy(actor);
                if (!valorFila.equals(valorPagina)) {
                    return false;
                }
                System.out.println("valorFila: " + valorFila + " - ValorPagina: " + valorPagina);
            }
        }
        return true;
    }

    public static ValidarColumnasTablaGestionEmpresa columnasTablaGestionEmpresa(List<Map<String, String>> datos) {
        return new ValidarColumnasTablaGestionEmpresa(datos);
    }
}

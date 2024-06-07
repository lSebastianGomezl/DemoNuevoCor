package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;
import java.util.Map;

public class ValidarColumnasFiltro implements Question<Boolean> {
    private final List<Map<String, String>> datos;

    public ValidarColumnasFiltro(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String[] columnas = {"NIT","PAÍS","NOMBRE GRUPO EMPRESARIAL","TELÉFONO","CORREO","ESTADO","ACCIONES"};

        for (Map<String, String> fila : datos) {
            for (int i = 0; i < columnas.length; i++) {
                String valorFila = fila.get(columnas[i]);
                System.out.println("valorFila: " + valorFila + " - ValorPagina: " + Text.of(ContenedorDeObjetosGrupoEmpresarial.COLUMNAS_TABLA_FILTROS.of(String.valueOf(i+1))).answeredBy(actor));
                if (!valorFila.equals(Text.of(ContenedorDeObjetosGrupoEmpresarial.COLUMNAS_TABLA_FILTROS.of(String.valueOf(i+1))).answeredBy(actor))) {
                    return false;
                }
            }
        }
        return true;
    }



    public static ValidarColumnasFiltro columnasFiltro(List<Map<String, String>> datos) {
        return new ValidarColumnasFiltro(datos);
    }
}

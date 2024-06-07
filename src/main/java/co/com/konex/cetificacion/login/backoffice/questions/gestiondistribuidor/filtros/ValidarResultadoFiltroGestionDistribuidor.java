package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidarResultadoFiltroGestionDistribuidor implements Question<Boolean> {
    private String posicion;
    private String campo;

    public ValidarResultadoFiltroGestionDistribuidor(String posicion, String campo) {
        this.posicion = posicion;
        this.campo = campo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datos = new ArrayList<>();
        Map<String, Integer> mapaPosiciones = new HashMap<>();
        mapaPosiciones.put("ASOCIADO A (EMPRESA/COMERCIALIZADOR)", 1);
        mapaPosiciones.put("NIT", 2);
        mapaPosiciones.put("NOMBRE DISTRIBUIDOR", 3);
        mapaPosiciones.put("PAÍS", 4);
        mapaPosiciones.put("DIRECCIÓN", 5);
        mapaPosiciones.put("DOMINIO", 6);
        mapaPosiciones.put("ESTADO", 7);
        int pos = mapaPosiciones.getOrDefault(posicion, -1);
        int i = 2;
        int j = 1;
        while (ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_CB.of(String.valueOf(i), String.valueOf(j)).isVisibleFor(actor)) { //registro
            while (ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_CB.of(String.valueOf(i), String.valueOf(j)).isVisibleFor(actor)) { //columna
                if (!Text.of(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_CB.of(String.valueOf(i), String.valueOf(j))).answeredBy(actor).isEmpty()) {
                    if (j == pos) {
                        System.out.println(Text.of(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_CB.of(String.valueOf(i), String.valueOf(j))).answeredBy(actor));
                        datos.add(Text.of(ContenedorDeObjetosGestionDistribuidor.RESULTADO_CONSULTA_CB.of(String.valueOf(i), String.valueOf(j))).answeredBy(actor));
                    }
                }
                j++;
            }
            j = 1;
            i++;
        }
        return sonTodosIguales(datos, campo);
    }
    private static boolean sonTodosIguales(List<String> datos, String campo) {
        boolean todosIguales = datos.stream().distinct().count() == 1;
        boolean aleatorioCoincide = datos.stream().anyMatch(dato -> dato.equals(campo));
        return todosIguales && aleatorioCoincide;
    }


    public static ValidarResultadoFiltroGestionDistribuidor resultadosConsulta_(String posicion, String campo) {
        return new ValidarResultadoFiltroGestionDistribuidor(posicion, campo);
    }
}

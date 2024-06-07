package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.SELECT_OPTION_PAIS_ALEATORIO;

public class ValidarRegionesGestionPolitica implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosPantalla = new ArrayList<>();
        List<String> datos = actor.recall("campoRegionesGuardadas");
        int i = 0;
        while (SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1)).resolveFor(actor).isVisible()) {
            System.out.println((Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor).toUpperCase()));
            datosPantalla.add(Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor).toUpperCase());
            i++;
        }

        return tienenMismosDatosSinOrden(datos, datosPantalla);

    }

    private static boolean tienenMismosDatosSinOrden(List<String> lista1, List<String> lista2) {
        // Eliminar elementos vacíos de ambas listas
        lista1.removeIf(String::isEmpty);
        lista2.removeIf(String::isEmpty);

        // Convertir las listas en sets para comparar sin orden
        Set<String> set1 = lista1.stream().collect(Collectors.toSet());
        Set<String> set2 = lista2.stream().collect(Collectors.toSet());

        // Verificar si los sets son iguales
        return set1.equals(set2);
    }

    public static ValidarRegionesGestionPolitica regiones() {
        return new ValidarRegionesGestionPolitica();
    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.SELECT_OPTION_PAIS_ALEATORIO;

public class ValidarPaisesGestionPolitica implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosPantalla = new ArrayList<>();
        List<String> datos = actor.recall("campoPaisesGuardado");
        int i = 0;
        while (SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1)).resolveFor(actor).isVisible()) {
            System.out.println((Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor)).toUpperCase());
            datosPantalla.add(Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor).toUpperCase());
            i++;
        }
        return tienenMismosDatosSinOrden( datos,datosPantalla);

    }

    private static boolean tienenMismosDatosSinOrden(List<String> lista1, List<String> lista2) {
        return lista1.size() == lista2.size() && lista1.containsAll(lista2) && lista2.containsAll(lista1);
    }
    public static ValidarPaisesGestionPolitica paises() {
        return new ValidarPaisesGestionPolitica();
    }
}
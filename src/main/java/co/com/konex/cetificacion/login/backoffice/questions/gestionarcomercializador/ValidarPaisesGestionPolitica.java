package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.SELECT_OPTION_PAIS_ALEATORIO;

public class ValidarPaisesGestionPolitica implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosPantalla = new ArrayList<>();
        List<String> datos = actor.recall("campoPaisesGuardado");
        int i = 0;
        while (SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1)).resolveFor(actor).isVisible()) {
            System.out.println((Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor).toUpperCase()));
            datosPantalla.add(Text.of(SELECT_OPTION_PAIS_ALEATORIO.of(String.valueOf(i + 1))).answeredBy(actor).toUpperCase());
            i++;
        }

        return contieneTodosElementos(datos, datosPantalla);

    }

    public static <T> boolean contieneTodosElementos(List<T> lista1, List<T> lista2) {
        return lista2.containsAll(lista1);
    }

    public static ValidarPaisesGestionPolitica paises() {
        return new ValidarPaisesGestionPolitica();
    }
}

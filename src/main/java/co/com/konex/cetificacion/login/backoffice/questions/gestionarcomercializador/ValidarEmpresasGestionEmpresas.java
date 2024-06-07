package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.SELECT_OPTION_EMPRESA_ALEATORIO_SPAN;

public class ValidarEmpresasGestionEmpresas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosPantalla = new ArrayList<>();
        List<String> datos = actor.recall("campoEmpresasGuardado");

        if (datos == null) {
            System.err.println("Error: 'campoGuardado' is null");
            return false;
        }

        int i = 0;
        boolean isVisible;
        do {
            isVisible = SELECT_OPTION_EMPRESA_ALEATORIO_SPAN.of(String.valueOf(i + 1)).resolveFor(actor).isVisible();
            if (isVisible) {
                String text = Text.of(SELECT_OPTION_EMPRESA_ALEATORIO_SPAN.of(String.valueOf(i + 1))).answeredBy(actor);
                System.out.println(text);
                datosPantalla.add(text);
            }
            i++;
        } while (isVisible);

        return contieneTodosElementos(datos, datosPantalla);
    }

    public static <T> boolean contieneTodosElementos(List<T> lista1, List<T> lista2) {
        return lista2.containsAll(lista1);
    }

    public static ValidarEmpresasGestionEmpresas empresas() {
        return new ValidarEmpresasGestionEmpresas();
    }
}

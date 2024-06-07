package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarNITBuscado implements Question<String> {
    public static ValidarNITBuscado filtroConNIT() {
        return new ValidarNITBuscado();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.NIT_BUSCADO).answeredBy(actor);
    }
}

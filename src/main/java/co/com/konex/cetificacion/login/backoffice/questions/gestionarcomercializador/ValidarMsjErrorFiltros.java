package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorFiltros implements Question<String> {
    public static ValidarMsjErrorFiltros mensajeErrorFiltros() {
        return new ValidarMsjErrorFiltros();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_ERROR_FILTRO).answeredBy(actor);
    }
}

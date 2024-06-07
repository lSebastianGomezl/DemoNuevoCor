package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarExpandirFiltros implements Question<Boolean> {
    public static ValidarExpandirFiltros filtrosExtraidos() {
        return new ValidarExpandirFiltros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionarComercializador.FILTRO_NOMBRE_COMERCIALIZADOR,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }
}

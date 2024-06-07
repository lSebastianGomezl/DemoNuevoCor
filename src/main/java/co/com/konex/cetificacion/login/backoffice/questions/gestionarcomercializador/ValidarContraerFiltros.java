package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarContraerFiltros implements Question<Boolean> {
    public static ValidarContraerFiltros filtrosContraidos() {
        return new ValidarContraerFiltros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionarComercializador.FILTRO_NIT,
                WebElementStateMatchers.isNotPresent()).forNoMoreThan(30).seconds());
        return true;
    }
}

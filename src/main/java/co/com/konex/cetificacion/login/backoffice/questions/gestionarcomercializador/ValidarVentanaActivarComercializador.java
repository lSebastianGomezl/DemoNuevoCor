package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarVentanaActivarComercializador implements Question<Boolean> {
    public static ValidarVentanaActivarComercializador activarInactivarComercializador() {
        return new ValidarVentanaActivarComercializador();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionarComercializador.VENTANA_CONFIRMACION,
                WebElementStateMatchers.isPresent()).forNoMoreThan(20).seconds());
        return true;
    }
}

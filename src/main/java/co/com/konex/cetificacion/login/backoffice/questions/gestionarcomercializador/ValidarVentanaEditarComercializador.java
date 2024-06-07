package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarVentanaEditarComercializador implements Question<Boolean> {
    public static ValidarVentanaEditarComercializador editarComercializador() {
        return new ValidarVentanaEditarComercializador();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionarComercializador.VENTANA_CONFIRMACION_EDITAR,
                WebElementStateMatchers.isNotPresent()).forNoMoreThan(50).seconds());
        return true;
    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarVentanaCierraCrear implements Question<Boolean> {

    public static ValidarVentanaCierraCrear crearVentanaCerrar() {
        return new ValidarVentanaCierraCrear();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionarComercializador.VENTANA_CONFIRMACION_CREAR,
                WebElementStateMatchers.isNotPresent()).forNoMoreThan(50).seconds());
        return true;
    }
}

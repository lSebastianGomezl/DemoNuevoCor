package co.com.konex.cetificacion.login.backoffice.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class prueba implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static prueba switchActivarAnulacion() {
        return Tasks.instrumented(prueba.class);
    }
}

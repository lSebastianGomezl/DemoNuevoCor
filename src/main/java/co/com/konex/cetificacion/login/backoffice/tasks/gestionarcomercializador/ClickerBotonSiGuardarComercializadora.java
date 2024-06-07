package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickerBotonSiGuardarComercializadora implements Task {
    public static ClickearBotonCrearComercilizador crearComercializadora() {
        return Tasks.instrumented(ClickearBotonCrearComercilizador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_SI_CREAR_COMERCIALIZADOR));
    }
}

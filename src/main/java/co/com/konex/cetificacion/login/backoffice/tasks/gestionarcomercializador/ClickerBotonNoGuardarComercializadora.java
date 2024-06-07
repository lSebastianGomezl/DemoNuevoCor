package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickerBotonNoGuardarComercializadora implements Task {
    public static ClickerBotonNoGuardarComercializadora noCrearComercializadora() {
        return Tasks.instrumented(ClickerBotonNoGuardarComercializadora.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.BTN_NO_CREAR_COMERCIALIZADOR));
    }
}

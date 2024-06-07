package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarModuloGestComercializador implements Task {
    public static IngresarModuloGestComercializador gestionarComercializador() {
        return Tasks.instrumented(IngresarModuloGestComercializador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.MD_ADMIN),
                Click.on(ContenedorDeObjetosGestionarComercializador.MENU_MULTINIVEL),
                Click.on(ContenedorDeObjetosGestionarComercializador.SUBMENU_GESTION_COMERCIALIZADOR));
    }
}

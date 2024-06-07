package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBtnCrearDistribuidor implements Task {
    public static SeleccionarBtnCrearDistribuidor btnCrearDistribuidor() {
        return Tasks.instrumented(SeleccionarBtnCrearDistribuidor.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.BTN_CREAR_DISTRIBUIDOR_FORMULARIO)
        );
    }
}

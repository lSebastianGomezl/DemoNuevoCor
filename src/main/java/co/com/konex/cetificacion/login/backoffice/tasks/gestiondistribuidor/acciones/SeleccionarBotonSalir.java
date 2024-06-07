package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarBotonSalir implements Task {
    public static SeleccionarBotonSalir SalirDePantallaEditarDistribuidor() {
        return Tasks.instrumented(SeleccionarBotonSalir.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ContenedorDeObjetosGestionDistribuidor.BOTON_SALIR_PANT_EDITAR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ContenedorDeObjetosGestionDistribuidor.BOTON_SALIR_PANT_EDITAR));
    }
}

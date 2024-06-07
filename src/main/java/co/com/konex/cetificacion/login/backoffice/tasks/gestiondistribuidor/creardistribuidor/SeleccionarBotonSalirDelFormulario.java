package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonSalirDelFormulario implements Task {
    public static SeleccionarBotonSalirDelFormulario SalirDePantallaCrearDistribuidor() {
        return Tasks.instrumented(SeleccionarBotonSalirDelFormulario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.BOTON_SALIR_PANT_CREAR_DISTRI));
    }

}

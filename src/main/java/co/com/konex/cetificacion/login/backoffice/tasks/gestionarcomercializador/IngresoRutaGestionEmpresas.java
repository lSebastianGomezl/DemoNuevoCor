package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresoRutaGestionEmpresas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.OP_GESTION_EMPRESA));
    }
    public static IngresoRutaGestionEmpresas gestionDistribuidor() {
        return Tasks.instrumented(IngresoRutaGestionEmpresas.class);
    }
}

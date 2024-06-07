package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InactivarRegistroDeDistribuidor implements Task {
    public static InactivarRegistroDeDistribuidor InactivarDistribuidor() {
        return Tasks.instrumented(InactivarRegistroDeDistribuidor.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.ICONO_INACTIVAR_DISTRIBUIDOR));
    }

}

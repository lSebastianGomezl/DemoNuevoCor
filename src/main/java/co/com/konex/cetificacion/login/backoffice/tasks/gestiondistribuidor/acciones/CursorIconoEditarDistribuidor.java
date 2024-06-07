package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class CursorIconoEditarDistribuidor implements Task {
    public static CursorIconoEditarDistribuidor editarDistribuidor() {
        return Tasks.instrumented(CursorIconoEditarDistribuidor.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(ContenedorDeObjetosGestionDistribuidor.ICONO_EDITAR_DISTRIBUIDOR));
    }
}

package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarModuloGestionDistribuidor  implements Task {
    public static IngresarModuloGestionDistribuidor modGestionDistribuidor() {
        return Tasks.instrumented(IngresarModuloGestionDistribuidor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.MD_ADMIN),
                Click.on(ContenedorDeObjetosGestionDistribuidor.MD_MULTINIVEL),
                Click.on(ContenedorDeObjetosGestionDistribuidor.OP_GESTION_DISTRIBUIDOR));
    }
}

package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.pantallainicio;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarModuloGestionEmpre implements Task {
    public static IngresarModuloGestionEmpre gestionEmpresa() {
        return Tasks.instrumented(IngresarModuloGestionEmpre.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.MD_ADMIN),
                Click.on(ContenedorDeObjetosGestionEmpresa.MD_MULTINIVEL),
                Click.on(ContenedorDeObjetosGestionEmpresa.OP_GESTION_EMPRESA));
    }

}
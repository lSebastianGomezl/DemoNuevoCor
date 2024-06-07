package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAGestionPolitica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(ContenedorDeObjetosGrupoEmpresarial.MD_ADMIN),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_GESTION_COMERCIAL),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_GESTION_POLITICA)
        );
    }
    public static IngresarAGestionPolitica ingresar() {
        return Tasks.instrumented(IngresarAGestionPolitica.class);
    }
}

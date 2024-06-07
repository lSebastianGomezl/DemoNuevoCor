package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresoRutaGestionEmpresarial implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGrupoEmpresarial.OP_GRUPO_EMPRESARIAL)
        );
    }


    public static IngresoRutaGestionEmpresarial gestionEmpresarial() {
        return Tasks.instrumented(IngresoRutaGestionEmpresarial.class);
    }

}


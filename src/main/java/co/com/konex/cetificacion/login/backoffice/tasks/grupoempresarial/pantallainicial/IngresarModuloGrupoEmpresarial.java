package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.pantallainicial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarModuloGrupoEmpresarial implements Task {
    public static IngresarModuloGrupoEmpresarial grupoEmpresarial() {
        return Tasks.instrumented(IngresarModuloGrupoEmpresarial.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ContenedorDeObjetosGrupoEmpresarial.MD_ADMIN, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.MD_ADMIN),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.MD_MULTINIVEL),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.OP_GRUPO_EMPRESARIAL));
    }

}
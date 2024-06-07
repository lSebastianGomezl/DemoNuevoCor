package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;


import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickBtnCrearGrupoEmpresarial implements Task {
    public static ClickBtnCrearGrupoEmpresarial crearGrupoEmpresarial() {

        return Tasks.instrumented(ClickBtnCrearGrupoEmpresarial.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGrupoEmpresarial.BTN_CREAR_GRUPO_EMPRESARIAL, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(ContenedorDeObjetosGrupoEmpresarial.BTN_CREAR_GRUPO_EMPRESARIAL, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_CREAR_GRUPO_EMPRESARIAL)
        );
    }

}

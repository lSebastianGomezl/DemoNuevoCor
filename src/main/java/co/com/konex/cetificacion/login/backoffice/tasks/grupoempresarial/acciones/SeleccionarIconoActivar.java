package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarIconoActivar implements Task {
    public static SeleccionarIconoActivar activarGrupoEmpresarial() {

        return Tasks.instrumented(SeleccionarIconoActivar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String diferenciadorActivoInactivo = "color-3";
        String color = String.valueOf(ContenedorDeObjetosGrupoEmpresarial.OPC_ESTADO_GRUPO_EMPRESA.resolveFor(actor).getAttribute("class"));
        if (color.contains(diferenciadorActivoInactivo)) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.OPC_ESTADO_GRUPO_EMPRESA));
        }
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.OPC_ESTADO_GRUPO_EMPRESA)
        );
    }
}
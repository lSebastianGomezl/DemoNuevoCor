package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosAccionesGE;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickEnOpcSi implements Task {
    private String opcion;

    public ClickEnOpcSi(String opcion) {
        this.opcion = opcion;
    }
    public static ClickEnOpcSi siEnVentanaDeConfirmacion() {
        return Tasks.instrumented(ClickEnOpcSi.class);
    }

    public static ClickEnOpcSi siEnVentanaDeConfirmacion(String opcion) {
        return Tasks.instrumented(ClickEnOpcSi.class, opcion);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(opcion.equalsIgnoreCase("si")){
            actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_SI_VENT_CONFIR));
        } else if (opcion.equalsIgnoreCase("no")) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_NO_VENT_CONFIR));
        } else if (opcion.equalsIgnoreCase("salir")) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_SALIR));
        } else if (opcion.equalsIgnoreCase("detalle")) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosAccionesGE.BTN_VER_DETALLES));
        } else {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_SI_VENT_CONFIR));
        }


    }

}

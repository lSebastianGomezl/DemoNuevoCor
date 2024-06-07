package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNitFiltroModal implements Task {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public IngresarNitFiltroModal(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    public static IngresarNitFiltroModal ingresarNitEnCampoFiltroModalDetalle(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(IngresarNitFiltroModal.class, tablaGrupoEmpresarial);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nitGenerado = tablaGrupoEmpresarial.getNIT();
        actor.remember(nitGenerado,"nitModal");
        System.out.println("nit nodal"+nitGenerado);
        actor.attemptsTo(
                Enter.theValue(nitGenerado).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO_MODAL),
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BOTON_FILTRAR_EN_MODAL));
    }

}

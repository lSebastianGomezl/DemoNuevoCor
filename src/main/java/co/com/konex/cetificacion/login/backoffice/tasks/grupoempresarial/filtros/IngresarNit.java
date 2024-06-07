package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.NITAleatorio;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNit implements Task {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public IngresarNit(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    public static IngresarNit ingresarNitEnCampoFiltro(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(IngresarNit.class, tablaGrupoEmpresarial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nitGenerado =  tablaGrupoEmpresarial.getNIT();
        actor.remember("nitGenerado", nitGenerado);
        System.out.println(nitGenerado);
        if (tablaGrupoEmpresarial.getNIT() != null) {
            if (tablaGrupoEmpresarial.getNIT().equals("nit con empresa asociada")) {
                actor.attemptsTo(Enter.theValue("830037843-3").into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO));
            } else {
                actor.attemptsTo(
                        Enter.theValue(
                                (tablaGrupoEmpresarial.getNIT().contains("invalido")) ? NITAleatorio.failNitConSigno()
                                        : nitGenerado
                        ).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO));
            }
        }


    }
}

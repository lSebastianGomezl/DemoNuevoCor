package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombre implements Task {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;
    public IngresarNombre(TablaGrupoEmpresarial tablaGrupoEmpresarial){
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }
    public static IngresarNombre ingresarNombreEnCampoFiltro(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(IngresarNombre.class, tablaGrupoEmpresarial);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String razonSocial =  tablaGrupoEmpresarial.getRazonSocialONombre();
        actor.remember("razonSocial",razonSocial);
        System.out.println("RAZON SOCIAL: " + razonSocial);
        actor.attemptsTo(
                Enter.theValue(
                        tablaGrupoEmpresarial.getRazonSocialONombre() == null ? ""
                                : (tablaGrupoEmpresarial.getRazonSocialONombre().contains("invalido")) ? GeneradorNombres.razonSocialFail()
                                : (tablaGrupoEmpresarial.getRazonSocialONombre().contains("existente")) ? GeneradorNombres.cargarRazonSocialExistente()
                                : razonSocial
                ).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NOMBRE_FILTRO));

                 }

}

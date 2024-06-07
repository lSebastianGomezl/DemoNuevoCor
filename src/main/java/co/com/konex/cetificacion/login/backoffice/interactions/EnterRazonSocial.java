package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterRazonSocial implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterRazonSocial(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String razonSocial = obtenerRazonSocial(tablaGrupoEmpresarial.getRazonSocialONombre());
        actor.remember("razonSocial", razonSocial);
        actor.attemptsTo(Enter.theValue(razonSocial).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE));
    }

    private String obtenerRazonSocial(String razonSocialOriginal) {
        if (razonSocialOriginal == null) {
            return "";
        }

        if (razonSocialOriginal.contains("caracteres")) {
            return GeneradorNombres.razonSocialFailCaracteres();
        }

        if (razonSocialOriginal.contains("existente")) {
            return "Grupo Quebec";
        }

        return GeneradorNombres.razonSocial();
    }
    public static EnterRazonSocial enterRazonSocial(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterRazonSocial.class, tablaGrupoEmpresarial);
    }
}

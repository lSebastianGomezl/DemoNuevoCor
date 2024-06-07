package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDominio implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterDominio(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String dominio = obtenerDominio(tablaGrupoEmpresarial.getDominio());
        actor.attemptsTo(Enter.theValue(dominio).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_DOMINIO));
    }

    private String obtenerDominio(String dominioOriginal) {
        if (dominioOriginal == null) {
            return "";
        }

        if(dominioOriginal.equals("valido")){
            return GeneradorNombres.dominio();
        }

        if (dominioOriginal.contains("invalido")) {
            return GeneradorNombres.razonSocial();
        }

        if (dominioOriginal.contains("caracteres")) {
            return GeneradorNombres.dominioCaracteres();
        }

        return dominioOriginal;
    }
    public static EnterDominio enterDominio(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterDominio.class, tablaGrupoEmpresarial);
    }

}

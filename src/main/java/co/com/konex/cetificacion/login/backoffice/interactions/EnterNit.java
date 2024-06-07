package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.NITAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterNit implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterNit(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nit = obtenerNit(tablaGrupoEmpresarial.getNIT());
        System.out.println(nit);
        actor.remember("nitGenerado", nit);
        actor.attemptsTo(Enter.theValue(nit).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT));
    }

    private String obtenerNit(String nitOriginal) {
        if (nitOriginal == null) {
            return "";
        }

        if(nitOriginal.equals("aleatorio")){
            return NITAleatorio.generateRandomNit();
        }

        if(nitOriginal.equals("valido")){
            return NITAleatorio.generateRandomNit();
        }

        if (nitOriginal.contains("invalido")) {
            return NITAleatorio.failNit();
        }

        if (nitOriginal.contains("caracteres")) {
            return NITAleatorio.failNitCaracteres();
        }

        if (nitOriginal.contains("existente")) {
            return "9008763322-2";
        }

        if(nitOriginal.contains("existente con empresa asociada")){
            return "830037843-3";
        }

        return nitOriginal;
    }
    public static EnterNit enterNit(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterNit.class, tablaGrupoEmpresarial);
    }

}

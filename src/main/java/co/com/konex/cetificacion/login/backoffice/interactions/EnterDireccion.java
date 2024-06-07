package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.RandomDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDireccion implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterDireccion(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String direccion = obtenerDireccion(tablaGrupoEmpresarial.getDireccion());
        System.out.println(direccion);
        actor.attemptsTo(Enter.theValue(direccion).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_DIRECCION));
    }

    private String obtenerDireccion(String direccionOriginal) {
        if (direccionOriginal == null) {
            return "";
        }

        if (direccionOriginal.equals("caracteres")) {
            return RandomDireccion.generateFailAddress();
        }

        return RandomDireccion.generateRandomAddress();
    }
    public static EnterDireccion enterDireccion(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterDireccion.class, tablaGrupoEmpresarial);
    }
}

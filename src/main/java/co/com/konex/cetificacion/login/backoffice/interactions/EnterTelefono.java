package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNumerosTelefono;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterTelefono implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterTelefono(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String telefono = obtenerTelefono(tablaGrupoEmpresarial.getTelefono());
        actor.attemptsTo(Enter.theValue(telefono).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_TELEFONO));
    }

    private String obtenerTelefono(String telefonoOriginal) {
        if (telefonoOriginal == null) {
            return "";
        }

        if(telefonoOriginal.equals("valido")){
            return GeneradorNumerosTelefono.telefonoColombia();
        }

        if (telefonoOriginal.contains("invalido")) {
            return GeneradorNumerosTelefono.telefonoFail();
        }

        if (telefonoOriginal.contains("caracteres")) {
            return GeneradorNumerosTelefono.telefonoFailCaracteres();
        }

        return telefonoOriginal;
    }
    public static EnterTelefono enterTelefono(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterTelefono.class, tablaGrupoEmpresarial);
    }

}

package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.EmailGenerator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterCorreoElectronico implements Interaction {
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public EnterCorreoElectronico(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String correoElectronico = obtenerCorreoElectronico(tablaGrupoEmpresarial.getCorreoElectronico());
        System.out.println(correoElectronico);
        actor.attemptsTo(Enter.theValue(correoElectronico).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_CORREO));
    }

    private String obtenerCorreoElectronico(String correoElectronicoOriginal) {
        if (correoElectronicoOriginal == null) {
            return "";
        }

        if(correoElectronicoOriginal.equals("valido")){
            return EmailGenerator.generateRandomEmail();
        }

        if (correoElectronicoOriginal.contains("invalido")) {
            return EmailGenerator.emailFail();
        }

        if (correoElectronicoOriginal.contains("caracteres")) {
            return EmailGenerator.failEmailCaracteres();
        }

        return correoElectronicoOriginal;
    }

    public static EnterCorreoElectronico enterCorreoElectronico(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(EnterCorreoElectronico.class, tablaGrupoEmpresarial);
    }

}

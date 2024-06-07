package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ValidarMsjErrorAlInactivarRegistro implements Question {
    private String mjsError;

    public ValidarMsjErrorAlInactivarRegistro(String mjsError) {
        this.mjsError = mjsError;
    }

    public static ValidarMsjErrorAlInactivarRegistro inactivarRegistroConEmpresaAsociada(String mjsError) {
        return new ValidarMsjErrorAlInactivarRegistro(mjsError);
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_ERROR_AL_INACTIVAR_GRU_EMP.of(mjsError)).answeredBy(actor);
    }
}

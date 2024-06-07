package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones.ValidarMsjErrorAlInactivarRegistro;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorAlIngresarNitExistente implements Question {
    private String msjError;

    public ValidarMsjErrorAlIngresarNitExistente(String msjError) {
        this.msjError = msjError;
    }

    public static ValidarMsjErrorAlIngresarNitExistente alIntentarCrearUnRegistroConUnNitExistente(String msjError) {
        return new ValidarMsjErrorAlIngresarNitExistente(msjError);
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTE.of(msjError)).answeredBy(actor);
    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorAlInactivarRegistroEmpresa implements Question<String> {
    public static ValidarMsjErrorAlInactivarRegistroEmpresa inactivarRegistroConComercializadorAsociado() {
        return new ValidarMsjErrorAlInactivarRegistroEmpresa();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_AL_INACTIVAR_EMPRESA_COR).answeredBy(actor);
    }

}

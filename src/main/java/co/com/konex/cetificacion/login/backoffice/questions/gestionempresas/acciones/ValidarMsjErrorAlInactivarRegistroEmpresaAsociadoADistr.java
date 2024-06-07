package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorAlInactivarRegistroEmpresaAsociadoADistr implements Question<String> {
    public static ValidarMsjErrorAlInactivarRegistroEmpresaAsociadoADistr inactivarRegistroConDistribuidorAsociado() {
        return new ValidarMsjErrorAlInactivarRegistroEmpresaAsociadoADistr();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_AL_INACTIVAR_EMPRESA_DIS).answeredBy(actor);
    }

}

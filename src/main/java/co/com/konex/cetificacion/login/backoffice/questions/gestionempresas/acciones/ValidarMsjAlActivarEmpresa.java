package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlActivarEmpresa implements Question<String> {
    public static ValidarMsjAlActivarEmpresa msjDeEmpresaActivada() {
        return new ValidarMsjAlActivarEmpresa();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_EMPRESA_ACTIVADA).answeredBy(actor);
    }

}

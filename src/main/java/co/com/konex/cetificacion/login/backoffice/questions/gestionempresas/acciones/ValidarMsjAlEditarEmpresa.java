package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlEditarEmpresa implements Question<String> {
    public static ValidarMsjAlEditarEmpresa msjDeEdicionExitosa() {
        return new ValidarMsjAlEditarEmpresa();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_AL_EDITAR_EMPRESA).answeredBy(actor);
    }

}

package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlEditarDistribuidor implements Question {
    public static ValidarMsjAlEditarDistribuidor msjDeConfirmacionAlEditarDistri() {
        return new ValidarMsjAlEditarDistribuidor();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_AL_EDITAR_DISTRIBUIDOR).answeredBy(actor);
    }

}

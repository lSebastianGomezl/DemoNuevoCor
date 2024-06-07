package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlInactivarDistribuidor implements Question {
    public static ValidarMsjAlInactivarDistribuidor msjDeConfirmacionDeInactivacionDistri() {
        return new ValidarMsjAlInactivarDistribuidor();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_AL_INACTIVAR_DISTRIBUIDOR).answeredBy(actor);
    }

}

package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjExito implements Question {
    public static ValidarMsjExito creacionExitosaDeRegistro() {
        return new ValidarMsjExito();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_EXITO_REGISTRO_CREADO).answeredBy(actor);
    }
}

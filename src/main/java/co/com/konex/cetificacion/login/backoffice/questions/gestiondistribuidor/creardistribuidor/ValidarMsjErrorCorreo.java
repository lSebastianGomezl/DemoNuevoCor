package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorCorreo implements Question<String> {
    public static ValidarMsjErrorCorreo datosCorreosIngresadosMal() {
        return new ValidarMsjErrorCorreo();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_ERROR_CORREO_INCORRECTO).answeredBy(actor);
    }



}

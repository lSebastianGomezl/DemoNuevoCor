package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarIngresoAlFormulario implements Question {
    public static ValidarIngresoAlFormulario formularioCrearDistribuidor() {
        return new ValidarIngresoAlFormulario();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.TXT_FORMULARIO_CREAR_DISTRIBUIDOR).answeredBy(actor);
    }
}

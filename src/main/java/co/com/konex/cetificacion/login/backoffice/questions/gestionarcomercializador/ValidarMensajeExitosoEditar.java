package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensajeExitosoEditar implements Question<String> {
    public static ValidarMensajeExitosoEditar editarComercilizador() {
        return new ValidarMensajeExitosoEditar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.MSJ_EXITOSO_EDITAR).answeredBy(actor);
    }
}

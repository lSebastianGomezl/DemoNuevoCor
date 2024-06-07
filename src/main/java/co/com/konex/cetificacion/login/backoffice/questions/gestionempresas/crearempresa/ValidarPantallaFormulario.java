package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarPantallaFormulario implements Question<String> {
    public static ValidarPantallaFormulario textoNombreFormulario() {
        return new ValidarPantallaFormulario();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.TEXTO_TITULO_FORMULARIO).answeredBy(actor);
    }

}

package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;


import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjErrorEnCampos implements Question<String> {
    public static ValidarMsjErrorEnCampos alIngresarDatosIncorrectos() {
        return new ValidarMsjErrorEnCampos();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS).answeredBy(actor);
    }
}

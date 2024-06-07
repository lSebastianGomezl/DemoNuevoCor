package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjDeAlerta implements Question {
    public static ValidarMsjDeAlerta alCrearDistribuidorConCamposVacios() {
        return new ValidarMsjDeAlerta();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_ALERTA_POR_CAMPOS_VACIOS).answeredBy(actor);
    }
}

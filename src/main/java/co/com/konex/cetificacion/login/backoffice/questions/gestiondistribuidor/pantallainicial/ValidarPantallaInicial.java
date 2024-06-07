package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarPantallaInicial implements Question<String> {
    public static ValidarPantallaInicial textoModulo() {
        return new ValidarPantallaInicial();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.TEXTO_PANTALLA_INICIAL).answeredBy(actor);
    }
}

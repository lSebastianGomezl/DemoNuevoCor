package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.pantallainicio;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarPantallaModulo implements Question<String> {
    public static ValidarPantallaModulo textoModulo() {
        return new ValidarPantallaModulo();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.TEXTO_MOD_GESTION_EMPRESA).answeredBy(actor);
    }

}

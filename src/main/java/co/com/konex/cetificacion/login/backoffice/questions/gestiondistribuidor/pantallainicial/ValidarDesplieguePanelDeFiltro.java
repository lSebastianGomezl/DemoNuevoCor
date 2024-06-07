package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarDesplieguePanelDeFiltro implements Question {
    public static ValidarDesplieguePanelDeFiltro panelDeFiltroDesplegado() {
        return new ValidarDesplieguePanelDeFiltro();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.TEXTO_PANEL_FILTRO).answeredBy(actor);
    }
}

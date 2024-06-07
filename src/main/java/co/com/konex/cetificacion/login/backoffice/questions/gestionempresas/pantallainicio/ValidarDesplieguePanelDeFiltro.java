package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.pantallainicio;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarDesplieguePanelDeFiltro implements Question<String> {
    public static ValidarDesplieguePanelDeFiltro panelDeFiltroDesplegado() {
        return new ValidarDesplieguePanelDeFiltro();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.TEXTO_PANEL_FILTRO).answeredBy(actor);
    }


}

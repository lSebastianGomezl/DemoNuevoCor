package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarOcultarPanelDeFiltro implements Question {
    public static ValidarDesplieguePanelDeFiltro panelDeFiltroOculto() {
        return new ValidarDesplieguePanelDeFiltro();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.TEXTO_PANEL_FILTRO2).answeredBy(actor);
    }

}

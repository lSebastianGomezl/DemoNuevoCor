package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjSinResultEncontrados implements Question<String> {
    public static ValidarMsjSinResultEncontrados msjFiltroSinresultados() {
        return new ValidarMsjSinResultEncontrados();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.MSJ_FILTRO_SIN_RESULTADOS).answeredBy(actor);
    }
}

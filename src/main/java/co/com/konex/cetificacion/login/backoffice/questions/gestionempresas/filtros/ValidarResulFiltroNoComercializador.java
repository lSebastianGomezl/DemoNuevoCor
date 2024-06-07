package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarResulFiltroNoComercializador implements Question<Boolean> {
    public static ValidarResulFiltroNoComercializador resulFiltro() {
        return new ValidarResulFiltroNoComercializador();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_OPC_NO_COMERCIALIZADOR,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }
}

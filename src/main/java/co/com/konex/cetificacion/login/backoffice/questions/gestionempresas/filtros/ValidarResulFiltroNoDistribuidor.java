package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarResulFiltroNoDistribuidor implements Question<Boolean> {
    public static ValidarResulFiltroNoDistribuidor resulFiltro() {
        return new ValidarResulFiltroNoDistribuidor();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_OPC_NO_DISTRIBUIDOR,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }

}

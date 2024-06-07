package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarActivacioSwichAplicaComoDistribuidor implements Question<Boolean> {

    public static ValidarActivacioSwichAplicaComoDistribuidor activacionSwich() {
        return new ValidarActivacioSwichAplicaComoDistribuidor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionEmpresa.SWITCH_APLICA_COMO_DISTRIBUIDOR,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }
}

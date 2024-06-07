package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarListadoDeDistribuidores implements Question {
    public static ValidarListadoDeDistribuidores listaDeDistribuidoresAlFiltrar() {
        return new ValidarListadoDeDistribuidores();
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGestionDistribuidor.VALIDAR_LISTA_DISTRIBUIDORES,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }

}

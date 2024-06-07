package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones;

import co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros.ValidarListadoDeDistribuidores;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarTextoTootip implements Question {
    public static ValidarTextoTootip textoTooltipIconoEditar() {
        return new ValidarTextoTootip();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.TEXTO_TOOLTIP_ICONO_EDITAR).answeredBy(actor);
    }
}

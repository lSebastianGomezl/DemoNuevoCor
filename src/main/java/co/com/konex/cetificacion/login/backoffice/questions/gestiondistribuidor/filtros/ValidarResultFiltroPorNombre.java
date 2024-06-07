package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultFiltroPorNombre implements Question {
    public static ValidarResultFiltroPorNombre filtroPorNombre() {
        return new ValidarResultFiltroPorNombre();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.RESULT_FILTRO_NOMBRE).answeredBy(actor);
    }


}

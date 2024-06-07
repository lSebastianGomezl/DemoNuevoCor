package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarNITBuscadoDistribuidor implements Question<String> {

    public static ValidarNITBuscadoDistribuidor filtroConNIT() {
        return new ValidarNITBuscadoDistribuidor();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionarComercializador.NIT_BUSCADO).answeredBy(actor);
    }
}

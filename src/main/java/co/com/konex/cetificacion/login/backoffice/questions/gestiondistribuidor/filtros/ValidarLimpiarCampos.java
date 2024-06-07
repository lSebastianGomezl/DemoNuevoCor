package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarLimpiarCampos implements Question<String> {
    public static ValidarLimpiarCampos limpiarCamposDeFiltro() {
        return new ValidarLimpiarCampos();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionDistribuidor.VALIDAR_CAMPO_NIT_VACIO).answeredBy(actor);
    }
}

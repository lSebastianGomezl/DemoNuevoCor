package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarLimpiarCampoNitModalDetalle implements Question {
    public static ValidarLimpiarCampoNitModalDetalle limpiarCampoDeFiltro() {
        return new ValidarLimpiarCampoNitModalDetalle();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT_FILTRO_MODAL).answeredBy(actor);
    }

}

package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarIngresoAModalVerDet implements Question {
    public static ValidarIngresoAModalVerDet modalVerDetalle() {
        return new ValidarIngresoAModalVerDet();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.TEXTO_MODAL_VER_DETALLE).answeredBy(actor);
    }


}

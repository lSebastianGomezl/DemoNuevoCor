package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarBotonesSiNoCrearGrupoEmpresarial implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(
                ContenedorDeObjetosGrupoEmpresarial.BTN_NO_VENT_CONFIR.isVisibleFor(actor)
                && ContenedorDeObjetosGrupoEmpresarial.BTN_SI_VENT_CONFIR.isVisibleFor(actor)
        ){
            return true;
        }
        return false;
    }
    public static ValidarBotonesSiNoCrearGrupoEmpresarial validar() {
        return new ValidarBotonesSiNoCrearGrupoEmpresarial();
    }
}

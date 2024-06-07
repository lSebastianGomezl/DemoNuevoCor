package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlEditarGrupoEmpresarial implements Question {
    public static ValidarMsjAlEditarGrupoEmpresarial msjDeEdicionExitosa() {
        return new ValidarMsjAlEditarGrupoEmpresarial();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_AL_EDITAR_GRUPO_EMPRESARIAL).answeredBy(actor);
    }


}

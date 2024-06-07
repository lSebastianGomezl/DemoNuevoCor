package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlInactivarGrupoEmpresarial implements Question {
    public static ValidarMsjAlInactivarGrupoEmpresarial msjDeGrupoEmpresarialInactivo() {
        return new ValidarMsjAlInactivarGrupoEmpresarial();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_GRUPO_EMPRESARIAL_INACTIVO).answeredBy(actor);
    }

}

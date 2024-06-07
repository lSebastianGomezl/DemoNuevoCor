package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjAlActivarGrupoEmpresarial implements Question {
    public static ValidarMsjAlActivarGrupoEmpresarial msjDeGrupoEmpresarialActivado() {
        return new ValidarMsjAlActivarGrupoEmpresarial();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_GRUPO_EMPRESARIAL_ACTIVADO).answeredBy(actor);
    }

}

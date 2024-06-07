package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjDeAlerta implements Question {
    public static ValidarMsjDeAlerta alCrearGrupoEmpresarialConCamposVacios() {
        return new ValidarMsjDeAlerta();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_ALERTA_POR_CAMPOS_VACIOS).answeredBy(actor);
    }
}

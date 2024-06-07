package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTituloFormulario implements Question {
    public static ValidarTituloFormulario alIngresarAlFormularioCrearGrupoEmpresarial() {
        return new ValidarTituloFormulario();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.TITULO_FORMULARIO).answeredBy(actor);
    }
}

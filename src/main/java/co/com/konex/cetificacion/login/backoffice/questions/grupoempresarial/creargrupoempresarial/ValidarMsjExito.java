package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjExito implements Question {
    public static ValidarMsjExito alCrearGrupoEmpresarial() {
        return new ValidarMsjExito();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.MSJ_EXITOSO).answeredBy(actor);
    }
}

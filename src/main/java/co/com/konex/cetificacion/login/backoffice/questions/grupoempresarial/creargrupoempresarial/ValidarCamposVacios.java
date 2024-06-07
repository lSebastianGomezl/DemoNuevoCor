package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarCamposVacios implements Question {
    public static ValidarCamposVacios bordeCampo() {

        return new ValidarCamposVacios();
    }

    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGrupoEmpresarial.BRD_ROJO_CAMPOS,
                WebElementStateMatchers.isPresent()).forNoMoreThan(100).seconds());

        return true;
    }


}

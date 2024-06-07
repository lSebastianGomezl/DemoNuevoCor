package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElementoClickable implements Question<Boolean> {
    private Target elemento;

    public ValidarElementoClickable(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.resolveFor(actor).isClickable();
    }

    public static ValidarElementoClickable delElemento(Target target) {

        return new ValidarElementoClickable(target);
    }
}

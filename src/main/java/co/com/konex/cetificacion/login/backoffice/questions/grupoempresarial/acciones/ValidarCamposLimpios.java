package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCamposLimpios implements Question<String> {
    private Target elemento;

    public ValidarCamposLimpios(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Value.of(elemento).answeredBy(actor);
    }
    public static ValidarCamposLimpios delElemento(Target elemento) {
        return new ValidarCamposLimpios(elemento);
    }
}

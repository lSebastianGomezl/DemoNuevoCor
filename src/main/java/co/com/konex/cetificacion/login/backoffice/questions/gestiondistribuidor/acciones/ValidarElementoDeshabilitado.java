package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElementoDeshabilitado implements Question<Boolean> {
    private Target elemento;

    public ValidarElementoDeshabilitado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Deshabilitado: " +  elemento.resolveFor(actor).isDisabled());
        System.out.println("   Clickeable: " +  elemento.resolveFor(actor).isClickable());
        System.out.println(elemento.resolveFor(actor).getAttribute("Disabled"));
        return elemento.resolveFor(actor).isDisabled();
    }

    public static ValidarElementoDeshabilitado delElemento(Target elemento) {
        return new ValidarElementoDeshabilitado(elemento);
    }
}

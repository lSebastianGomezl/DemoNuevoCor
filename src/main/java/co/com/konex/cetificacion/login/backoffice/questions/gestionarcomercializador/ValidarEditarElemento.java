package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarEditarElemento implements Question<Boolean> {

    private Target elemento;

    public ValidarEditarElemento(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (elemento.resolveFor(actor).isDisabled()) {
            System.out.println("El campo no se puede editar");
            return true;
        } else if (elemento.resolveFor(actor).isClickable()) {
            elemento.resolveFor(actor).click();
            elemento.resolveFor(actor).sendKeys("123456");
            return false;
        } else {
            System.out.println("Error al intentar editar el campo");
            return false;
        }
    }

    public static ValidarEditarElemento delElemento(Target elemento) {
        return new ValidarEditarElemento(elemento);
    }

}

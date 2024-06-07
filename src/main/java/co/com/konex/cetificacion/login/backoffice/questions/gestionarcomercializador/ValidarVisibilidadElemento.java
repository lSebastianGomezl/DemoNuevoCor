package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarVisibilidadElemento implements Question<Boolean> {
    private Target elemento;

    public ValidarVisibilidadElemento(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.isVisibleFor(actor);
    }

    public static ValidarVisibilidadElemento delElemento(Target elemento) {
        return new ValidarVisibilidadElemento(elemento);
    }
}

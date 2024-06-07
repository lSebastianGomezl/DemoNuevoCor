package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE;

public class ValidarElementoDeshabilitado implements Question<Boolean> {
    private Target elemento;

    public ValidarElementoDeshabilitado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Deshabilitado: " +  elemento.resolveFor(actor).isDisabled());
        System.out.println("   Clickeable: " +  elemento.resolveFor(actor).isClickable());
        return elemento.resolveFor(actor).isDisabled();
    }

    public static ValidarElementoDeshabilitado delElemento(Target elemento) {
        return new ValidarElementoDeshabilitado(elemento);
    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class ValidarEmpresaComercializadorSincronico implements Question<Boolean> {
    private String campo;

    public ValidarEmpresaComercializadorSincronico(String campo) {
        this.campo = campo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(campo.equals("Asociar a Empresa")){
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_EMPRESAS));
        }else{
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_COMERCIALIZADORES));
        }
        return !ContenedorDeObjetosGestionDistribuidor.LISTADO_SELECT.resolveFor(actor).isVisible();
    }
    public static ValidarEmpresaComercializadorSincronico sincronico(String campo){
        return new ValidarEmpresaComercializadorSincronico(campo);
    }
}

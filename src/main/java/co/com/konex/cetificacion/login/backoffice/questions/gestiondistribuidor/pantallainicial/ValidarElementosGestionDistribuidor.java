package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.pantallainicial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElementosGestionDistribuidor implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Target[] elementos = {
                ContenedorDeObjetosGestionDistribuidor.BTN_LIMPIAR_FILTRO,
                ContenedorDeObjetosGestionDistribuidor.BTN_CREAR_DISTRIBUIDOR,
                ContenedorDeObjetosGestionDistribuidor.BTN_FILTRAR,
                ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FILTRO,
                ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FILTRO
        };
        for (int i = 0; i < elementos.length; i++) {
            if(!elementos[i].resolveFor(actor).isPresent()){
               return false;
            }
        }
        return true;
    }
    public static ValidarElementosGestionDistribuidor filtros(){
        return new ValidarElementosGestionDistribuidor();
    }
}

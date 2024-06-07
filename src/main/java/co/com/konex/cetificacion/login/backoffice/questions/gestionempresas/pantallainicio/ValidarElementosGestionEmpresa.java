package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.pantallainicio;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElementosGestionEmpresa implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Target[] elementos = {

                ContenedorDeObjetosGestionEmpresa.INPUT_NIT_FILTRO,
                ContenedorDeObjetosGestionEmpresa.INPUT_NOMBRE_FILTRO,
                ContenedorDeObjetosGestionEmpresa.SELECT_PAIS_FILTRO,
                ContenedorDeObjetosGestionEmpresa.SELECT_COMERCIALIZADOR_FILTRO,
                ContenedorDeObjetosGestionEmpresa.SELECT_DISTRIBUIDOR_FILTRO
        };

        for (int i = 0; i < elementos.length; i++) {
            if (!elementos[i].resolveFor(actor).isPresent()) {
                return false;
            }
        }
        return true;
    }

    public static ValidarElementosGestionEmpresa elementosGestionEmpresas() {
        return new ValidarElementosGestionEmpresa();
    }
}

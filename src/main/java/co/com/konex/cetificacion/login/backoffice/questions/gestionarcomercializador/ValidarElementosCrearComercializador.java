package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElementosCrearComercializador implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Target[] elementos = {
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_ASOCIAR_EMPRESA,
                ContenedorDeObjetosGestionarComercializador.INPUT_NIT,
                ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL,
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_PAIS,
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD,
                ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION,
                ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO,
                ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO,
                ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO,
                ContenedorDeObjetosGestionarComercializador.SWITCH_ESTADO
        };
        for (int i = 0; i < elementos.length; i++) {
            if (!elementos[i].isVisibleFor(actor)) {
                return false;
            }
        }
        return true;
    }

    public static ValidarElementosCrearComercializador comercializador() {
        return new ValidarElementosCrearComercializador();
    }
}

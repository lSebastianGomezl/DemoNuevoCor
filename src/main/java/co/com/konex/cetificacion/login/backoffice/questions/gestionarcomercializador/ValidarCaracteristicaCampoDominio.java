package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCaracteristicaCampoDominio implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String campoDominio = ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO.resolveFor(actor).getValue();

        if (campoDominio.length() >= 20) {
            String mensaje = Text.of(ContenedorDeObjetosGestionarComercializador.ALERTA_ERROR_DOMINIO).answeredBy(actor);
            System.out.println("Alerta Campo Dominio: " + mensaje);
            System.out.println("El dato ingresado es: " + campoDominio);
            return true;
        } else if (campoDominio.length() <= 19) {
            System.out.println("Ingreso de caracteres permitido campo dominio");
            System.out.println("El dato ingresado es: " + campoDominio);
            return true;
        } else {
            System.out.println("No hay datos ingresados campo dominio");
            return false;
        }
    }

    public static ValidarCaracteristicaCampoDominio validarCaracteristicaCampoDominio() {
        return new ValidarCaracteristicaCampoDominio();
    }
}

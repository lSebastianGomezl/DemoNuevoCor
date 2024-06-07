package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAlertaCampoDominio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String campoDominio = ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO.resolveFor(actor).getValue();

        if (campoDominio.length() > 0) {
            if (campoDominio.startsWith("http://") || campoDominio.startsWith("https://")) {
                System.out.println("Ingreso de caracteres permitido en el campo dominio");
                System.out.println("El dato ingresado es: " + campoDominio);
                return true;
            } else {
                String mensaje = Text.of(ContenedorDeObjetosGestionarComercializador.ALERTA_ERROR_DOMINIO).answeredBy(actor);
                System.out.println("Alerta Campo Dominio: " + mensaje);
                System.out.println("El dato ingresado es: " + campoDominio);
                return true;
            }
        } else {
            System.out.println("No hay datos ingresados en el campo dominio");
            return false;
        }
    }

    public static Question<Boolean> validarAlertaCampoDominio() {
        return new ValidarAlertaCampoDominio();
    }
}
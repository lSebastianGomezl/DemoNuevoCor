package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAlertaCampoCorreoElectronico implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String campoCorreoElectronico = ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO.resolveFor(actor).getValue();

        if (campoCorreoElectronico.length() > 0) {
            if (campoCorreoElectronico.contains("@") && (campoCorreoElectronico.endsWith(".com") || campoCorreoElectronico.endsWith(".co"))) {
                System.out.println("Ingreso de caracteres permitido en Campo Correo");
                System.out.println("El dato ingresado es: " + campoCorreoElectronico);
                return true;
            } else {
                String mensaje = Text.of(ContenedorDeObjetosGestionarComercializador.ALERTA_ERROR_CORREO).answeredBy(actor);
                System.out.println("Alerta Campo Correo: " + mensaje);
                System.out.println("El dato ingresado es: " + campoCorreoElectronico);
                return true;
            }
        } else {
            System.out.println("No hay datos ingresados en Campo Correo");
            return false;
        }
    }

    public static ValidarAlertaCampoCorreoElectronico validarAlertaCampoCorreoElectronico() {
        return new ValidarAlertaCampoCorreoElectronico();
    }
}

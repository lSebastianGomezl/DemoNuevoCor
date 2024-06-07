package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAlertaCampoTelefono implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String campoTelefono = ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO.resolveFor(actor).getValue();

        if (campoTelefono.length() > 0) {
            if (campoTelefono.startsWith("+(") && campoTelefono.contains(")")) {
                System.out.println("Ingreso de caracteres permitido campo telefono");
                System.out.println("El dato ingresado es: " + campoTelefono);
                return true;
            } else {
                String mensaje = Text.of(ContenedorDeObjetosGestionarComercializador.ALERTA_ERROR_TELEFONO).answeredBy(actor);
                System.out.println("Alerta Campo Telefono: " + mensaje);
                System.out.println("El dato ingresado es: " + campoTelefono);
                return true;
            }
        } else {
            System.out.println("No hay datos ingresados en campo telefono");
            return false;
        }

    }

    public static ValidarAlertaCampoTelefono validarAlertaCampoTelefono() {
        return new ValidarAlertaCampoTelefono();
    }
}

package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoTelefono implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String campoTelefono = ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO.resolveFor(actor).getValue();

        if (campoTelefono.length() >= 20) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_TELEFONO).answeredBy(actor);
            System.out.println("Alerta Campo Telefono: " + mensaje);
            System.out.println("El dato ingresado es: " + campoTelefono);
            return true;
        } else if (campoTelefono.length() <= 19) {
            System.out.println("Ingreso de caracteres permitido campo telefono");
            System.out.println("El dato ingresado es: " + campoTelefono);
            return true;
        } else {
            System.out.println("No hay datos ingresados en campo telefono");
            return false;
        }
    }
    public static ValidarCampoTelefono validarCampoTelefono() {
        return new ValidarCampoTelefono();
    }
}

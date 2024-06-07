package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoCorreo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String campoCorreo = ContenedorDeObjetosGestionEmpresa.INPUT_CORREO.resolveFor(actor).getValue();

        if (campoCorreo.length() >= 50) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_CORREO).answeredBy(actor);
            System.out.println("Alerta Campo Correo: " + mensaje);
            System.out.println("El dato ingresado es: " + campoCorreo);
            return true;
        } else if (campoCorreo.length() <= 49) {
            System.out.println("Ingreso de caracteres permitido campo correo");
            System.out.println("El dato ingresado es: " + campoCorreo);
            return true;
        } else {
            System.out.println("No hay datos ingresados en campo correo");
            return false;
        }

    }


    public static ValidarCampoCorreo validarCampoCorreo() {
        return new ValidarCampoCorreo();
    }
}

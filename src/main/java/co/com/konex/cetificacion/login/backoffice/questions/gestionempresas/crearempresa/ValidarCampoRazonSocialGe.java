package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoRazonSocialGe implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String campoRazonSocial = ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE.resolveFor(actor).getValue();

        if (campoRazonSocial.length() >= 60) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_RAZON_SOCIAL).answeredBy(actor);
            System.out.println("Alerta Campo Razón Social: " + mensaje);
            System.out.println("El dato ingresado es: " + campoRazonSocial);
            return true;
        } else if (campoRazonSocial.length() <= 59) {
            System.out.println("Ingreso de caracteres permitido campo razón social");
            System.out.println("El dato ingresado es: " + campoRazonSocial);
            return true;
        } else {
            System.out.println("No hay datos ingresados en campo razón social");
            return false;
        }

    }

    public static ValidarCampoRazonSocialGe validarCampoRazonSocialGe() {
        return new ValidarCampoRazonSocialGe();
    }
}

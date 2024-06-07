package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoNit implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String campoNit = ContenedorDeObjetosGestionEmpresa.INPUT_NIT.resolveFor(actor).getValue();

        if (campoNit.length() >= 20) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS).answeredBy(actor);
            System.out.println("Alerta Campo Nit: " + mensaje);
            System.out.println("El dato ingresado es: " + campoNit);
            return true;
        } else if (campoNit.length() <= 19) {
            System.out.println("Ingreso de caracteres permitido campo NIT");
            System.out.println("El dato ingresado es: " + campoNit);
            return true;
        } else {
            System.out.println("No hay datos ingresados en campo NIT");
            return false;
        }
    }

    public static ValidarCampoNit validarCampoNit() {
        return new ValidarCampoNit();
    }

}



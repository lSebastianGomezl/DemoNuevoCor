package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoDominio implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        String campoDominio = ContenedorDeObjetosGestionEmpresa.INPUT_DOMINIO.resolveFor(actor).getValue();

        if (campoDominio.length() >= 20) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_DOMINIO).answeredBy(actor);
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


    public static ValidarCampoTelefono validarCampoTelefono() {
        return new ValidarCampoTelefono();
    }
}

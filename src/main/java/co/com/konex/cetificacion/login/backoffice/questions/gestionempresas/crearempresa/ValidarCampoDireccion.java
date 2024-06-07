package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCampoDireccion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String campoDireccion = ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION.resolveFor(actor).getValue();

        if (campoDireccion.length() >= 50) {
            String mensaje = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_DIRECCION).answeredBy(actor);
            System.out.println("Alerta Campo Dirección: " + mensaje);
            System.out.println("El dato ingresado es: " + campoDireccion);
            return true;
        } else if (campoDireccion.length() <= 49) {
            System.out.println("Ingreso de caracteres permitido en campo dirección");
            System.out.println("El dato ingresado es: " + campoDireccion);
            return true;
        } else {
            System.out.println("No hay datos ingresados en campo dirección");
            return false;
        }
    }

    public static ValidarCampoDireccion validarCampoDireccion() {
        return new ValidarCampoDireccion();
    }
}

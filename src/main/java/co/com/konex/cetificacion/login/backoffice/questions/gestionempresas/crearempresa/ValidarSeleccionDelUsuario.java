package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarSeleccionDelUsuario implements Question<String> {
    public static ValidarSeleccionDelUsuario usuarioSeleccionadoDeLaLista() {
        return new ValidarSeleccionDelUsuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.NOMBRE_DEL_USUARIO).answeredBy(actor);
    }

}

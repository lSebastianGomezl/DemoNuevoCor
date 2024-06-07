package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarSeleccionDelRol implements Question<String> {
    public static ValidarSeleccionDelRol rolSeleccionadoDeLaLista() {
        return new ValidarSeleccionDelRol();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.ROL_SELECCIONADO).answeredBy(actor);
    }
}

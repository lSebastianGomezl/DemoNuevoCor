package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarSeleccionGrupEmpresarial implements Question<String> {
    public static ValidarSeleccionGrupEmpresarial grupoEmpresarial() {
        return new ValidarSeleccionGrupEmpresarial();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.NOMBRE_GRUPO_EMPRESARIAL).answeredBy(actor);
    }

}

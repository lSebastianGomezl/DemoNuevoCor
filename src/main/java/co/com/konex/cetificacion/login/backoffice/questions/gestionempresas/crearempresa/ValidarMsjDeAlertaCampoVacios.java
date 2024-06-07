package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMsjDeAlertaCampoVacios implements Question<String> {
    public static ValidarMsjDeAlertaCampoVacios alCrearEmpresaConCamposVacios() {
        return new ValidarMsjDeAlertaCampoVacios();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ALERTA_POR_CAMPOS_VACIOS).answeredBy(actor);
    }

}

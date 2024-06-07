package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAlertaCampos implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String alertaNit = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS).answeredBy(actor);
        String alertaCorreo = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_CORREO).answeredBy(actor);
        String alertaTelefono = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_TELEFONO).answeredBy(actor);
        String alertaDominio = Text.of(ContenedorDeObjetosGestionEmpresa.MSJ_ERROR_EN_CAMPOS_DOMINIO).answeredBy(actor);

        return alertaNit + alertaCorreo + alertaTelefono + alertaDominio;
    }

    public static ValidarAlertaCampos validarAlertaCampos() {
        return new ValidarAlertaCampos();
    }
}

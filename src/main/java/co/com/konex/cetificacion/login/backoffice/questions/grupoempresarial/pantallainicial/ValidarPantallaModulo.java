package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.pantallainicial;


import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarPantallaModulo implements Question {
    public static ValidarPantallaModulo textoModulo() {
        return new ValidarPantallaModulo();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.TEXTO_MOD_GRUPO_EMPRESARIAL).answeredBy(actor);
    }

}

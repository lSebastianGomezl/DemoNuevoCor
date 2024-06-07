package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarLimpiarCampoNombre implements Question {
    public static ValidarLimpiarCampoNit limpiarCampoNombreFiltro() {
        return new ValidarLimpiarCampoNit();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.VALIDAR_CAMPO_NOMBRE_VACIO).answeredBy(actor);
    }


}

package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultFiltroNitModalDetalle implements Question {
    public static ValidarResultFiltroNitModalDetalle resultadosFiltro() {
        return new ValidarResultFiltroNitModalDetalle();
    }

    @Override
    public Object answeredBy(Actor actor) {
        String nitGenerado = actor.recall("nitGenerado");
        System.out.println("otro nit comparado: " + nitGenerado);
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.RESULTADO_FILTRO_NIT_MODAL.of(nitGenerado)).answeredBy(actor);
    }


}

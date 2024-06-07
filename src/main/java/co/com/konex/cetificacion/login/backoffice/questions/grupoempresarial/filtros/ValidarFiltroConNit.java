package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltroConNit implements Question {
    public static ValidarFiltroConNit resultadosFiltroConNit() {
        return new ValidarFiltroConNit();
    }
    @Override
    public Object answeredBy(Actor actor) {
        String variableRecuperada = actor.recall("nitGenerado");
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.NIT_TABLA_RESULTADOS.of(variableRecuperada)).answeredBy(actor);
    }

}

package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.SharedContext;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltroConNombre implements Question {

    public static ValidarFiltroConNombre resultadosFiltroConNombre() {
        return new ValidarFiltroConNombre();
    }

    @Override
    public Object answeredBy(Actor actor) {
        String razonSocial = actor.recall("razonSocial");
        return Text.of(ContenedorDeObjetosGrupoEmpresarial.NOMBRE_TABLA_RESULTADOS.of(razonSocial)).answeredBy(actor);
    }

}

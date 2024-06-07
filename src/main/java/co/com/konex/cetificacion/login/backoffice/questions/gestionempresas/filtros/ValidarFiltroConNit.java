package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltroConNit implements Question<String> {
    public static ValidarFiltroConNit resultadosFiltroConNit() {
        return new ValidarFiltroConNit();
    }

    @Override
    public String answeredBy(Actor actor) {
        System.out.println("El NIT consultado es: " + Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_NIT).answeredBy(actor));
        return Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_NIT).answeredBy(actor);
    }
}

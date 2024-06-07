package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltroConNombre implements Question<String> {
    public static ValidarFiltroConNombre resultadosFiltroConNombre() {
        return new ValidarFiltroConNombre();
    }

    @Override
    public String answeredBy(Actor actor) {
        System.out.println("El nombre de la empresa consultada es: " + Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_NOMBRE).answeredBy(actor));
        return Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_NOMBRE).answeredBy(actor);
    }

}

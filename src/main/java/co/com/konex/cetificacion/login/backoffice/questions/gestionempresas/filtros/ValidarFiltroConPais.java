package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltroConPais implements Question<String> {
    public static ValidarFiltroConPais resultadosFiltroConPais() {
        return new ValidarFiltroConPais();
    }

    @Override
    public String answeredBy(Actor actor) {
        System.out.println("El país consultado es: " + Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_PAIS).answeredBy(actor));
        return Text.of(ContenedorDeObjetosGestionEmpresa.RESULT_FILTRO_PAIS).answeredBy(actor);
    }

}

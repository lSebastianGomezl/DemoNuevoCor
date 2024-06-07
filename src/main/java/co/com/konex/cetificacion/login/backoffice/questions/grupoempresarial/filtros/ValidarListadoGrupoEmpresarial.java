package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarListadoGrupoEmpresarial implements Question {
    public static ValidarListadoGrupoEmpresarial listaDeGruposEmpresarialesAlFiltrar() {
        return new ValidarListadoGrupoEmpresarial();
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ContenedorDeObjetosGrupoEmpresarial.VALIDAR_LISTA_GRUPO_EMPRESARIAL,
                WebElementStateMatchers.isPresent()).forNoMoreThan(50).seconds());
        return true;
    }

}

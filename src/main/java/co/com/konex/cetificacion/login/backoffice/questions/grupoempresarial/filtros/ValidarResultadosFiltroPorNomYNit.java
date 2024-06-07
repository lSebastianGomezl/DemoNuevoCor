package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.filtros;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarResultadosFiltroPorNomYNit implements Question {

    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public ValidarResultadosFiltroPorNomYNit(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    public static ValidarResultadosFiltroPorNomYNit verResultDeFiltro(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return new ValidarResultadosFiltroPorNomYNit(tablaGrupoEmpresarial);
    }

    @Override
    public Object answeredBy(Actor actor) {
        String nitGenerado = actor.recall("nitGenerado");
        boolean isElementNit = nitGenerado.equals(ContenedorDeObjetosGrupoEmpresarial.NIT_TABLA_RESULTADOS.of(nitGenerado).resolveFor(actor).getText());
        return isElementNit ;
    }

}

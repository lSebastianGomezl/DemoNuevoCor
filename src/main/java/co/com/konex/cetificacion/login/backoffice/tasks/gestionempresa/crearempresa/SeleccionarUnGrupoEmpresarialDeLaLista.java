package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarUnGrupoEmpresarialDeLaLista implements Task {

    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;

    public SeleccionarUnGrupoEmpresarialDeLaLista(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {
        this.tablaDeDatosCrearEmpresa = tablaDeDatosCrearEmpresa;
    }

    public static SeleccionarUnGrupoEmpresarialDeLaLista grupoEmpresarial(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresaablaDeDatosCrearEmpresa) {

        return Tasks.instrumented(SeleccionarUnGrupoEmpresarialDeLaLista.class, tablaDeDatosCrearEmpresaablaDeDatosCrearEmpresa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConstruirXpathGestionEmpresas.GRUPO_EMPRESARIAL(tablaDeDatosCrearEmpresa.getGrupoEmpresarial()))
        );
    }

}

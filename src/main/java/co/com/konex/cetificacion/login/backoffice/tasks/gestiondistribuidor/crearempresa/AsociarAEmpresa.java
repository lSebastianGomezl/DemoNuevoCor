package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AsociarAEmpresa implements Task {
    private ConstruirXpathGestionDistribuidor construirXpathGestionDistribuidor;
    private TblGestionDistribuidor tblGestionDistribuidor;

    public AsociarAEmpresa(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static AsociarAEmpresa empresaFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(AsociarAEmpresa.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_EMPRESAS),
                Click.on(construirXpathGestionDistribuidor.ASOCIAR_A_EMPRESA(tblGestionDistribuidor.getAsociarAEmpresa())));

    }

}

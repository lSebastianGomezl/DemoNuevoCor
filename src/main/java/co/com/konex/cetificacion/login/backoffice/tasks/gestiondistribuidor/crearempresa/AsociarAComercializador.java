package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AsociarAComercializador implements Task {
    private ConstruirXpathGestionDistribuidor construirXpathGestionDistribuidor;
    private TblGestionDistribuidor tblGestionDistribuidor;

    public AsociarAComercializador(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static AsociarAComercializador comercializadorFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(AsociarAComercializador.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                Click.on(construirXpathGestionDistribuidor.ASOCIAR_A_COMERCIALIZADOR(tblGestionDistribuidor.getAsociarAComercializador())));

    }
}

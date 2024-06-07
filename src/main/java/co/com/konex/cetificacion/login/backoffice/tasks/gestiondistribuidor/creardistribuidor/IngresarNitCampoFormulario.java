package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.NITAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNitCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;
    public IngresarNitCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static IngresarNitCampoFormulario nitFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarNitCampoFormulario.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tblGestionDistribuidor.getNIT()!=null){
            if(tblGestionDistribuidor.getNIT().equals("aleatorio")){
                actor.attemptsTo(
                        Enter.theValue(NITAleatorio.generateRandomNit()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FORMULARIO)
                );
            }else{
                actor.attemptsTo(
                        Enter.theValue(tblGestionDistribuidor.getNIT()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FORMULARIO));
            }
        }

    }

}

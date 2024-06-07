package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;
import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosEnCampos implements Task {
    private ConstruirXpathGrupoEmpresarial construirXpathGrupoEmpresarial;
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;
    public IngresarDatosEnCampos(TablaGrupoEmpresarial tablaGrupoEmpresarial){
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    public static IngresarDatosEnCampos llenarCampos(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(IngresarDatosEnCampos.class, tablaGrupoEmpresarial);


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaGrupoEmpresarial.getNIT()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_NIT),
                Enter.theValue(tablaGrupoEmpresarial.getDireccion()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_DIRECCION),
                Enter.theValue(tablaGrupoEmpresarial.getCorreoElectronico()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_CORREO),
                Enter.theValue(tablaGrupoEmpresarial.getTelefono()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_TELEFONO));
    }
}

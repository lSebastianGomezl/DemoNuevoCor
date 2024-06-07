package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;



import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosEnCampos implements Task {
    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;
    public IngresarDatosEnCampos(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa){
        this.tablaDeDatosCrearEmpresa = tablaDeDatosCrearEmpresa;
    }

    public static IngresarDatosEnCampos llenarCampos(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {
        return Tasks.instrumented(IngresarDatosEnCampos.class, tablaDeDatosCrearEmpresa );


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE),
                Click.on(ConstruirXpathGestionEmpresas.GRUPO_EMPRESARIAL(tablaDeDatosCrearEmpresa.getGrupoEmpresarial())),
                Enter.theValue(tablaDeDatosCrearEmpresa.getNit()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NIT),
                Enter.theValue(tablaDeDatosCrearEmpresa.getDireccion()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION),
                Enter.theValue(tablaDeDatosCrearEmpresa.getCorreoElectronico()).into(ContenedorDeObjetosGestionEmpresa.INPUT_CORREO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getTelefono()).into(ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO));
    }
}

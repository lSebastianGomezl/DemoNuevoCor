package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarFormularioCrearEmpre implements Task {
    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;

    public DiligenciarFormularioCrearEmpre(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {
        this.tablaDeDatosCrearEmpresa = tablaDeDatosCrearEmpresa;
    }

    public static DiligenciarFormularioCrearEmpre completarCamposRequeridos(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {
        return Tasks.instrumented(DiligenciarFormularioCrearEmpre.class, tablaDeDatosCrearEmpresa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE),
                Click.on(ConstruirXpathGestionEmpresas.GRUPO_EMPRESARIAL(tablaDeDatosCrearEmpresa.getGrupoEmpresarial())),
                Enter.theValue(tablaDeDatosCrearEmpresa.getNit()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NIT),
                Enter.theValue(tablaDeDatosCrearEmpresa.getRazonSocialONombre()).into(ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS),
                Click.on(ConstruirXpathGestionEmpresas.PAIS(tablaDeDatosCrearEmpresa.getPais())),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_DEPART),
                Click.on(ConstruirXpathGestionEmpresas.DEPARTAMENTO(tablaDeDatosCrearEmpresa.getDepartamento())),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_CIUDAD),
                Click.on(ConstruirXpathGestionEmpresas.CIUDAD(tablaDeDatosCrearEmpresa.getCiudad())),
                Enter.theValue(tablaDeDatosCrearEmpresa.getDireccion()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION),
                Enter.theValue(tablaDeDatosCrearEmpresa.getCorreoElectronico()).into(ContenedorDeObjetosGestionEmpresa.INPUT_CORREO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getTelefono()).into(ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getDominio()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DOMINIO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getMoneda()).into(ContenedorDeObjetosGestionEmpresa.INPUT_MONEDA),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_TIPO_DE_PAGO),
                Click.on(ConstruirXpathGestionEmpresas.TIPO_DE_PAGO(tablaDeDatosCrearEmpresa.getTipoDePago())));
    }
}

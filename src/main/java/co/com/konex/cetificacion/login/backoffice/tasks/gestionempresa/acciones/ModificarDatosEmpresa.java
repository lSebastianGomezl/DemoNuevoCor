package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.acciones;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.RandomDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarDatosEmpresa implements Task {

    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;
    public ModificarDatosEmpresa(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa){
        this.tablaDeDatosCrearEmpresa = tablaDeDatosCrearEmpresa;
    }
    public static ModificarDatosEmpresa modificarDatosEmpre(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {
        return Tasks.instrumented(ModificarDatosEmpresa.class, tablaDeDatosCrearEmpresa );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE)),
                Click.on(ConstruirXpathGestionEmpresas.GRUPO_EMPRESARIAL(tablaDeDatosCrearEmpresa.getGrupoEmpresarial())),
                Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE),
                Clear.field(ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE));
        if(tablaDeDatosCrearEmpresa.getRazonSocialONombre().equals("aleatorio")){
            actor.attemptsTo(Enter.theValue(GeneradorNombres.razonSocial()).into(ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE));
        }else{
            actor.attemptsTo(Enter.theValue(tablaDeDatosCrearEmpresa.getRazonSocialONombre()).into(ContenedorDeObjetosGestionEmpresa.INPUT_RAZON_SOCIAL_NOMBRE));
        }
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION),
                Clear.field(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION)
        );
        if(tablaDeDatosCrearEmpresa.getDireccion().equals("aleatorio")){
            actor.attemptsTo(Enter.theValue(RandomDireccion.generateRandomAddress()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION));
        }else{
            actor.attemptsTo(Enter.theValue(tablaDeDatosCrearEmpresa.getDireccion()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DIRECCION));
        }
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_CORREO),
                Clear.field(ContenedorDeObjetosGestionEmpresa.INPUT_CORREO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getCorreoElectronico()).into(ContenedorDeObjetosGestionEmpresa.INPUT_CORREO),
                Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO),
                Clear.field(ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO),
                Enter.theValue(tablaDeDatosCrearEmpresa.getTelefono()).into(ContenedorDeObjetosGestionEmpresa.INPUT_TELEFONO),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_TIPO_DE_PAGO),
                Click.on(ConstruirXpathGestionEmpresas.TIPO_DE_PAGO(tablaDeDatosCrearEmpresa.getTipoDePago())),
                Click.on(ContenedorDeObjetosGestionEmpresa.BTN_EDITAR_EMPRESA));
    }

}

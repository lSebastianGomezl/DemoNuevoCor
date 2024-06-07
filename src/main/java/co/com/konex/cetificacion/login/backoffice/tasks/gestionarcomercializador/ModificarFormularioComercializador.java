package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarFormularioComercializador implements Task {
    private TblCrearComerci tblCrearComerci;

    public ModificarFormularioComercializador(TblCrearComerci tblCrearComerci) {
        this.tblCrearComerci = tblCrearComerci;
    }

    public static ModificarFormularioComercializador gestionComercializador(TblCrearComerci tblCrearComerci) {
        return Tasks.instrumented(ModificarFormularioComercializador.class, tblCrearComerci);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION),
                Clear.field(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION),
                Enter.theValue(tblCrearComerci.getDireccion()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION),
                Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO),
                Clear.field(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO),
                Enter.theValue(tblCrearComerci.getCorreoelectronico()).into(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO),
                Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO),
                Clear.field(ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO),
                Enter.theValue(tblCrearComerci.getTelefono()).into(ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO),
                Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO),
                Clear.field(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO),
                Enter.theValue(tblCrearComerci.getDominio()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO));
    }
}

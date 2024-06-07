package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTipoDePago implements Interaction {

    private String tipoDePago;

    public SelectTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!tipoDePago.equals("N/A")) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_TIPO_DE_PAGO));
            String[] pago = tipoDePago.split(",");
            for (int i = 0; i < pago.length; i++) {
                actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(pago[i])));
            }
        }
    }
    public static SelectTipoDePago tipoDePago(String tipoDePago) {
        return Tasks.instrumented(SelectTipoDePago.class, tipoDePago);
    }
}

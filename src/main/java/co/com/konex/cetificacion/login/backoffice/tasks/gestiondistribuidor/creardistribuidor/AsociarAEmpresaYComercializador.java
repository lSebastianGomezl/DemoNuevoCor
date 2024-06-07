package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.LetrasYNumerosAleatorios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin.SELECT_OPCION_ROLE;

public class AsociarAEmpresaYComercializador implements Task {
    private ConstruirXpathGestionDistribuidor construirXpathGestionDistribuidor;
    private TblGestionDistribuidor tblGestionDistribuidor;

    public AsociarAEmpresaYComercializador(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static AsociarAEmpresaYComercializador empresaYComercializadorFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(AsociarAEmpresaYComercializador.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (tblGestionDistribuidor.getAsociarAEmpresa() != null) {
            if (tblGestionDistribuidor.getAsociarAEmpresa().equals("aleatorio")) {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_EMPRESAS),
                        Click.on(SELECT_OPCION_ROLE.of(String.valueOf(LetrasYNumerosAleatorios.generarNumeroAleatorioEntre(1, 10))))
                );
            } else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_EMPRESAS),
                        Click.on(ConstruirXpathGestionDistribuidor.ASOCIAR_A_EMPRESA(tblGestionDistribuidor.getAsociarAEmpresa())));
            }
        }
        if (tblGestionDistribuidor.getAsociarAComercializador() != null) {
            if (tblGestionDistribuidor.getAsociarAComercializador().equals("aleatorio")) {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                        Click.on(SELECT_OPCION_ROLE.of(String.valueOf(LetrasYNumerosAleatorios.generarNumeroAleatorioEntre(1, 10))))
                );
            } else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_COMERCIALIZADORES),
                        Click.on(construirXpathGestionDistribuidor.ASOCIAR_A_COMERCIALIZADOR(tblGestionDistribuidor.getAsociarAComercializador())));

            }
        }

    }
}

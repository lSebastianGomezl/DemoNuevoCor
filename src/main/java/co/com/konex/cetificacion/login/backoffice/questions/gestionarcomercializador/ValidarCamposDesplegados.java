package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCamposDesplegados implements Question<Boolean> {
    private  String pais;

    public ValidarCamposDesplegados(String pais) {
        this.pais = pais;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String comboBoxPais;
        comboBoxPais = pais;
        System.out.println("El país seleccionado es: " + comboBoxPais);

        switch (comboBoxPais) {
            case "COLOMBIA":
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_REGION.isVisibleFor(actor);
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_DEPARTAMENTO.isVisibleFor(actor);
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Región, Departamento, Ciudad son desplegados");
                return true;
            case "ARGENTINA":
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Ciudad son desplegados");
                return true;
            case "ESTADOS UNIDOS":
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_DEPARTAMENTO.isVisibleFor(actor);
                ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Región, Departamento, Ciudad son desplegados");
                return true;

            default:
                System.out.println("Puede que el país haya sido recien registrado o no se encuentre en la lista desplegable");
                return false;
        }

    }

    public static ValidarCamposDesplegados deGestionComercializador(String pais) {
        return new ValidarCamposDesplegados(pais);
    }
}

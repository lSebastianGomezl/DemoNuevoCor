package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCamposDesplegadosGe implements Question<Boolean> {
    private String pais;

    public ValidarCamposDesplegadosGe(String pais) {
        this.pais = pais;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String comboBoxPais = pais;
        System.out.println("El país seleccionado es: " + comboBoxPais);

        switch (comboBoxPais) {
            case "COLOMBIA":
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_REGION.isVisibleFor(actor);
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_DEPART.isVisibleFor(actor);
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Región, Departamento, Ciudad son desplegados");
                return true;
            case "ARGENTINA":
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Ciudad son desplegados");
                return true;
            case "RUSIA":
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_DEPART.isVisibleFor(actor);
                ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_CIUDAD.isVisibleFor(actor);
                System.out.println("Los campos Región, Departamento, Ciudad son desplegados");
                return true;

            default:
                System.out.println("Puede que el país haya sido recien registrado o no se encuentre en la lista desplegable");
                return false;
        }


    }

    public static ValidarCamposDesplegadosGe delElemento(String pais) {
        return new ValidarCamposDesplegadosGe(pais);
    }

}
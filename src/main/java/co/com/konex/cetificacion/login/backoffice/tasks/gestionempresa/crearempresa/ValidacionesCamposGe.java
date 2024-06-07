package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador.ValidarDatosComboBox;
import co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.crearempresa.*;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

public class ValidacionesCamposGe {

    private ValidacionesCamposGe() {
    }

    public static List<Question<Boolean>> obtenerValidaciones() {
        return Arrays.asList(
                ValidarDatosComboBox.delComboBox(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE),
                ValidarCampoNit.validarCampoNit(),
                ValidarCampoRazonSocialGe.validarCampoRazonSocialGe(),
                ValidarDatosComboBox.delComboBox(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_PAIS),
                ValidarDatosComboBox.delComboBox(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_DEPART),
                ValidarDatosComboBox.delComboBox(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_CIUDAD),
                ValidarCampoDireccion.validarCampoDireccion(),
                ValidarCampoCorreo.validarCampoCorreo(),
                ValidarCampoTelefono.validarCampoTelefono(),
                ValidarCampoDominio.validarCampoTelefono()
        );

    }
}

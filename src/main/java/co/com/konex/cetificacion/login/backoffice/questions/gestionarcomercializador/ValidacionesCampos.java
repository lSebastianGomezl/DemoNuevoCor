package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.*;

public class ValidacionesCampos {

    private ValidacionesCampos() {
    }
    public static List<Question<Boolean>> obtenerValidaciones() {
        return Arrays.asList(
                ValidarDatosComboBox.delComboBox(COMBOBOX_ASOCIAR_EMPRESA),
                ValidarCaracteristicaCampoNit.validarCaracteristicaCampoNit(),
                ValidarAlertaCampoRazonSocial.validarAlertaCampoRazonSocial(),
                ValidarDatosComboBox.delComboBox(COMBOBOX_PAIS),
                ValidarDatosComboBox.delComboBox(COMBOBOX_REGION),
                ValidarDatosComboBox.delComboBox(COMBOBOX_DEPARTAMENTO),
                ValidarDatosComboBox.delComboBox(COMBOBOX_CIUDAD),
                ValidarAlertaCampoDireccion.validarAlertaCampoDireccion(),
                ValidarCaracteristicaCampoCorreo.validarCaracteristicaCampoCorreo(),
                ValidarCaracteristicaCampoTelefono.validarCaracteristicaCampoTelefono(),
                ValidarCaracteristicaCampoDominio.validarCaracteristicaCampoDominio()
        );

    }
}

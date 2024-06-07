package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetosGestionEmpresa {

    private ContenedorDeObjetosGestionEmpresa() {
    }

    public static final String BUSQUEDA_FILTRO = "//tbody[@class='p-element p-datatable-tbody']";

    public static final Target TEXTO_PANEL_FILTRO = Target.the("Texto de panel de filtro").locatedBy("//label[contains(text(),'Filtrar')]");
    public static final Target MD_ADMIN = Target.the("Modulo de Administración").locatedBy("//div[contains(text(),'Administración')]");
    public static final Target MD_MULTINIVEL = Target.the("Modulo de Multinivel").locatedBy("//div[contains(text(),' Multinivel ')]");
    public static final Target OP_GESTION_EMPRESA = Target.the("Gestion empresa").locatedBy("//span[contains(text(),' Gestión Empresas')]");
    public static final Target TEXTO_MOD_GESTION_EMPRESA = Target.the("Texto del modulo Gestion empresa").locatedBy("//h3[contains(text(),'Gestión Empresa')]");
    public static final Target BTN_VER_FILTROS = Target.the("Ver filtros").locatedBy("//button[@id='btnFiltrar']");
    public static final Target OP_CREAR_EMPRESA = Target.the("Opción módulo Gestion empresa").locatedBy("//button[@id='backoffice_seccionFiltros_boton_artefacto']");
    public static final Target TEXTO_TITULO_FORMULARIO = Target.the("Texto del titulo del formulario").locatedBy("//h3[contains(text(),'Crear Empresa')]");
    public static final Target BOTON_SALIR_FORMU_CREAR_EMPRESA = Target.the("Botón Salir del formulario Crear Empresa").locatedBy("//button[@id='btnClosePanelCrearEditarEmpresa']");
    public static final Target MENSAJE_INFORMATIVO = Target.the("Mensaje informativo de busqueda").located(By.xpath("(//*[contains(@class,'m-0')])[5]"));
    public static final Target BTN_CREAR_EMPRESA = Target.the("Boton crear empresa").locatedBy("//button[@id='btnEnviarFormularioCrearEditarEmpresa']");
    public static final Target MSJ_ALERTA_POR_CAMPOS_VACIOS = Target.the("Mensaje al intentatr crear empresa con campos vacíos").locatedBy("//div[contains(text(),'Debe ingresar todos los campos requeridos del formulario')]");
    public static final Target LIST_DESPLEGABLE_GRUP_EMPRE = Target.the("Lista desplegable de grupos empresariales").locatedBy("//p-dropdown[@id='grupoEmpresarialGestionEmpresa']");
    public static final Target NOMBRE_GRUPO_EMPRESARIAL = Target.the("Nombre de grupo emppresarial desplegado en la lista").locatedBy("//button[@title='Permite crear una nueva empresa']");
    public static final Target INPUT_NIT = Target.the("NIT").locatedBy("//input[@id='nit']");
    public static final Target INPUT_RAZON_SOCIAL_NOMBRE = Target.the("Razón social o nombre").locatedBy("//input[@id='razonSocialGestionEmpresa']");
    public static final Target LIST_DESPLEGABLE_PAIS = Target.the("Lista desplegable de paises").locatedBy("//p-dropdown[@id='paisCrearEditarEmpresa']");
    public static final Target LIST_DESPLEGABLE_PAIS_FILTRO = Target.the("Lista desplegable de paises").locatedBy("//p-dropdown[@id='paisGestionEmpresa']");
    public static final Target LIST_DESPLEGABLE_TIPO_DOCUMENTO = Target.the("Lista desplegable de tipo documento").locatedBy("//p-dropdown[@id='tipoDocumentoUsuarioGestionEmpresa']");
    public static final Target INPUT_DOCUMENTO = Target.the("input documento").locatedBy("//input[@id='numeroDocumentoUsuarioGestionEmpresa']");
    public static final Target INPUT_FECHA = Target.the("input fecha").locatedBy("//input[@id='fechaRutGestionEmpresa']");
    public static final Target BUSCAR_DOCUMENTO = Target.the("buscar documento").locatedBy("//button[@class='p-element p-button p-component p-button-icon-only']");
    public static final Target NOMBRE_PAIS = Target.the("Nombre de pais").locatedBy("");
    public static final Target LIST_DESPLEGABLE_DEPART = Target.the("Lista desplegable de departamentos").locatedBy("//p-dropdown[@id='DEPARTAMENTOCrearEditarEmpresa']");
    public static final Target LIST_DESPLEGABLE_REGION = Target.the("Lista desplegable de region").locatedBy("//p-dropdown[@id='REGIONCrearEditarEmpresa']");
    public static final Target NOMBRE_DEPARTAMENTO = Target.the("Departamentos").locatedBy("");
    public static final Target LIST_DESPLEGABLE_CIUDAD = Target.the("Lista desplegable de ciudades").locatedBy("//p-dropdown[@id='municipioCrearEditarEmpresa']");
    public static final Target NOMBRE_CIUDAD = Target.the("nombre ciudad").locatedBy("//input[@id='']");
    public static final Target INPUT_DIRECCION = Target.the("Dirección").locatedBy("//input[@id='direccionGestionEmpresa']");
    public static final Target INPUT_CORREO = Target.the("Correo electronico").locatedBy("//input[@id='emailGestionEmpresa']");
    public static final Target INPUT_TELEFONO = Target.the("Teléfono").locatedBy("//input[@id='telefonoGestionEmpresa']");
    public static final Target INPUT_DOMINIO = Target.the("Dominio").locatedBy("//input[@id='dominioGestionEmpresa']");
    public static final Target INPUT_MONEDA = Target.the("Moneda").locatedBy("//input[@id='monedaGestionEmpresa']");
    public static final Target LIST_DESPLEGABLE_TIPO_DE_PAGO = Target.the("Lista desplegable Tipo de pago").locatedBy("//*[@id='tipoDePagoGestionEmpresa']");
    public static final Target MSJ_ERROR_EN_CAMPOS = Target.the("Mensaje de error campo nit").locatedBy("//app-mensaje-error-input[@class='ng-star-inserted visible']");
    public static final Target MSJ_ERROR_EN_CAMPOS_RAZON_SOCIAL = Target.the("Mensaje de error campo razon social").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[2]");
    public static final Target MSJ_ERROR_EN_CAMPOS_CORREO = Target.the("Mensaje de error campo correo").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[4]");
    public static final Target MSJ_ERROR_EN_CAMPOS_TELEFONO = Target.the("Mensaje de error campo telefono").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[5]");
    public static final Target MSJ_ERROR_EN_CAMPOS_DOMINIO = Target.the("Mensaje de error campo dominio").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[6]");
    public static final Target MSJ_ERROR_EN_CAMPOS_MONEDA = Target.the("Mensaje de error campo moneda").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[6]");
    public static final Target MSJ_ERROR_EN_CAMPOS_DIRECCION = Target.the("Mensaje de error campo direccion").locatedBy("(//app-mensaje-error-input[@class='ng-star-inserted visible'])[3]");

    public static final Target SWITCH_APLICA_COMO_DISTRIBUIDOR = Target.the("Switch aplica como distribuidor").locatedBy("(//span[@class='p-inputswitch-slider'])[1]");
    public static final Target SWITCH_IVA = Target.the("Switch aplica IVA").locatedBy("(//span[@class='p-inputswitch-slider'])[4]");
    public static final Target SWITCH_OBLIGADO_FACTURAR = Target.the("Switch Obligado a facturar").locatedBy("(//span[@class='p-inputswitch-slider'])[5]");
    public static final Target SWITCH_REGIMEN = Target.the("Switch Regimen Simple").locatedBy("(//span[@class='p-inputswitch-slider'])[6]");
    public static final Target SWITCH_ENTIDAD_ESTADO = Target.the("Switch Entidad del estado").locatedBy("(//span[@class='p-inputswitch-slider'])[7]");
    public static final Target SWITCH_APLICA_COMO_COMERCIALIZADOR = Target.the("Switch aplica como comercializador").locatedBy("(//span[@class='p-inputswitch-slider'])[2]");
    public static final Target SWITCH_ESTADO = Target.the("Switch del estado de la empresa").locatedBy("(//span[@class='p-inputswitch-slider'])[3]");
    public static final Target SWITCH_ASIGNAR = Target.the("Switch asignar").locatedBy("(//span[@class='p-inputswitch-slider'])[8]");
    public static final Target LIST_DESPLEGABLE_USUARIOS = Target.the("Lista desplegable usuarios").locatedBy("");
    public static final Target NOMBRE_DEL_USUARIO = Target.the("Nombre del usuario").locatedBy("");
    public static final Target LIST_DESPLEGABLE_ROLES = Target.the("Lista desplegable usuarios").locatedBy("");
    public static final Target ROL_SELECCIONADO = Target.the("Nombre del rol").locatedBy("");
    public static final Target BTN_SI_VENT_CONFIR = Target.the("Opcion SÍ en la ventana de confirmacion").locatedBy("//span[contains(text(),'Si')]");
    public static final Target MSJ_EXITOSO = Target.the("Mensaje al crear una empresa").locatedBy("//div[contains(text(),'Se ha creado exitosamente el registro con el código 46 - ACERTEMOS')]");
    public static final Target MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTE = Target.the("Mensaje al intentar crear uan Empresa con un NIT ya existente en el sistema").locatedBy("//div[contains(text(),'Este NIT ya se encuentra creado para otra Empresa')]");


    public static final Target BTN_FILTRAR = Target.the("Boton consultar").locatedBy("//app-button[@inputid='btnFiltrar']");
    public static final Target MSJ_FILTRO_SIN_RESULTADOS = Target.the("Mensaje de No se encuentrarón resultados").locatedBy("//strong[contains(text(),'No se encontraron resultados que coincidan con los criterios de búsqueda')]");
    public static final Target INPUT_NIT_FILTRO = Target.the("Campo NIT del filtro").locatedBy("//input[@id='nitGestionEmpresa']");
    public static final Target INPUT_NOMBRE_FILTRO = Target.the("Campo Nombre del filtro").locatedBy("//input[@id='nombreGestionEmpresa']");
    public static final Target SELECT_PAIS_FILTRO = Target.the("Select de pais del filtro").locatedBy("(//*[@name='idPais'])");
    public static final Target SELECT_COMERCIALIZADOR_FILTRO = Target.the("Select de comercializador del filtro").locatedBy("(//*[@id='comercilizadorGestionEmpresa'])");
    public static final Target SELECT_DISTRIBUIDOR_FILTRO = Target.the("Select de distribuidor del filtro").locatedBy("(//*[@id='distribuidorGestionEmpresa'])");


    public static final Target BTN_LIMPIAR_FILTRO = Target.the("Opción limpiar en la pantalla de filtro").locatedBy("//button[@id='btnLimpiarFiltros']");
    public static final Target RESULT_FILTRO_NIT = Target.the("NIT en tabla de registros de empresas").locatedBy("(//tr) //td[1]");
    public static final Target RESULT_FILTRO_NOMBRE = Target.the("Nombre en tabla de registros de empresas").locatedBy("(//tr) //td[2]");
    public static final Target RESULT_FILTRO_PAIS = Target.the("Pais en tabla de registros de empresas").locatedBy("(//tr) //td[3]");
    public static final Target RESULT_FILTRO_COMERC = Target.the("Comercializador en tabla de registros de empresas").locatedBy("//*[@id=\"pr_id_29-table\"]/tbody/tr/td[7]");
    public static final Target RESULT_FILTRO_DISTRIB = Target.the("Distribuidor en tabla de registros de empresas").locatedBy("//*[@id=\"pr_id_29-table\"]/tbody/tr/td[8]");
    public static final Target LISTA_DESPLEGABLE_COMERCIALIZADORES = Target.the("Lista desplegable de comercializadores filtro").locatedBy("//p-dropdown[@id='comercilizadorGestionEmpresa']");
    public static final Target LISTA_DESPLEGABLE_DISTRIBUIDOR = Target.the("Lista desplegable de distribuidores filtro").locatedBy("//p-dropdown[@id='distribuidorGestionEmpresa']");
    public static final Target OPC_SI_CPMERCIALIZADOR_FILTRO = Target.the("Opcion Si comercializador en filtro").locatedBy("//li[@aria-label='SI']");
    public static final Target OPC_NO_CPMERCIALIZADOR_FILTRO = Target.the("Opcion No comercializador").locatedBy("//li[@aria-label='NO']");
    public static final Target RESULT_FILTRO_OPC_SI_COMERCIALIZADOR = Target.the("Opcion Si comercializador resultados de filtro de busqueda").locatedBy(BUSQUEDA_FILTRO );
    public static final Target RESULT_FILTRO_OPC_NO_COMERCIALIZADOR = Target.the("Opcion No comercializador resultados de filtro de busqueda").locatedBy(BUSQUEDA_FILTRO );
    public static final Target OPC_SI_DISTRIBUIDOR_FILTRO = Target.the("Opcion Si distribuidor en filtro").locatedBy("//li[@aria-label='SI']");
    public static final Target OPC_NO_DISTRIBUIDOR_FILTRO = Target.the("Opcion No distribuidor en filtro").locatedBy("//li[@aria-label='NO']");
    public static final Target RESULT_FILTRO_OPC_SI_DISTRIBUIDOR = Target.the("Opcion Si distribuidor resultados de filtro de busqueda").locatedBy(BUSQUEDA_FILTRO );
    public static final Target RESULT_FILTRO_OPC_NO_DISTRIBUIDOR = Target.the("Opcion No distribuidor resultados de filtro de busqueda").locatedBy(BUSQUEDA_FILTRO );
    public static final Target ENCABEZADO_GESTION_EMPRESA = Target.the("Encabezado tabla consultas gestion empresa").locatedBy("(//tr)[1] //th[{0}]");
    public static final Target MSJ_ERROR_AL_INACTIVAR_EMPRESA_COR = Target.the("Mensaje de error al intentar inactivar una empresa con comercializador asociado").locatedBy("//div[contains(text(),'No se puede inactivar debido a que existe Comercializadores asociados.')]");
    public static final Target MSJ_ERROR_AL_INACTIVAR_EMPRESA_DIS = Target.the("Mensaje de error al intentar inactivar una empresa con distribuidor asociado").locatedBy("//div[contains(text(),'No se puede inactivar debido a que existe Distribuidores asociados.')]");
    public static final Target MENSAJE_ERROR_FILTRO = Target.the("Mensaje al no encontrar registros").locatedBy("(//*[contains(@class,'m-0')])[5]");

    public static final Target OPC_ACT_EMPRESA = Target.the("opcion activar empresa").locatedBy("//i[@title='Cambiar Estado']");
    public static final Target OPC_INACTIVAR_EMPRESA = Target.the("Opcion inactivar empresa").locatedBy("//i[@title='Cambiar Estado']");
    public static final Target MSJ_EMPRESA_INACTIVADA = Target.the("Mensaje de exito al inactivar empresa").locatedBy("//div[contains(text(),'Se ha inactivado exitosamente el registro con el código 46 - ACERTEMOS')]");
    public static final Target MSJ_EMPRESA_ACTIVADA = Target.the("Mensaje de exito al activar empresa").locatedBy("//div[contains(text(),'Se ha activado exitosamente el registro con el código 46 - ACERTEMOS')]");
    public static final Target OPC_EDITAR_EMPRESA = Target.the("Opción editar empresa").locatedBy("(//i[@title='Permite editar la gestion empresa'])[1]");
    public static final Target OPC_EDITAR_EMPRESA_ACCION = Target.the("Opción editar empresa").locatedBy("//i[@title='Editar']");
    public static final Target BTN_EDITAR_EMPRESA = Target.the("Boton editar empresa").locatedBy("//button[@id='btnEnviarFormularioCrearEditarEmpresa']");
    public static final Target MSJ_AL_EDITAR_EMPRESA = Target.the("Mensaje de exito al editar empresa").locatedBy("//div[contains(text(),'Se ha editado exitosamente el registro con el código 46 - GO-4')]");
    public static final Target BTN_SALIR = Target.the("Boton salir ").locatedBy("//button[@id='btnClosePanelCrearEditarEmpresa']");
    public static final Target TOAST_EXITOSO = Target.the("Toast exitoso").locatedBy("//*[@id='toastMedium']");
}


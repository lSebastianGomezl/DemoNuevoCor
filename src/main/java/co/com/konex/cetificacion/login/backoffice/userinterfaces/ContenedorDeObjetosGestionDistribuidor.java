package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ContenedorDeObjetosGestionDistribuidor {
    public static final Target RESULTADO_CONSULTA_CB = Target.the("Campo de alerta de la busqueda").locatedBy("(//tr)[{0}]//td[{1}]");
    public static final Target BARRA_INFORMATIVA_V2 = Target.the("Barra donde aparece la alerta v2").located(By.xpath("//app-barra-alerta //div //div"));
    public static final Target RESULTADO_CONSULTA = Target.the("Campo de alerta de la busqueda").locatedBy("(//tr)[{0}]//td[{1}]");
    public static final Target RESULTADO_CONSULTA_ACTIVA = Target.the("Campo de alerta de la busqueda").locatedBy("(//tr)[{0}]//td[{1}] //i");
    public static final Target NUMERO_PAGINADOR = Target.the("Elementos del paginador").locatedBy("//button[contains(@class,'p-paginator-element') and text()=' {0} ']");
    public static final Target BTN_VER_FILTROS = Target.the("Ver filtros").locatedBy("//button[@id='backoffice_seccionFiltros_boton_verFiltros']");
    public static final Target TEXTO_PANEL_FILTRO = Target.the("Texto panel filtros").locatedBy("//label[contains(text(),'Filtrar')]");
    public static final Target MD_ADMIN = Target.the("Modulo de Administración").locatedBy("//div[contains(text(),'Administración')]");
    public static final Target MD_MULTINIVEL = Target.the("Submodulo multinivel").locatedBy("//div[contains(text(),'Multinivel')]");
    public static final Target OP_GESTION_DISTRIBUIDOR = Target.the("opción gestión distribuidor").locatedBy("//a[@title='Nuevo modulo para gestionar distribuidores']");
    public static final Target TEXTO_PANTALLA_INICIAL = Target.the("Texto pantalla inicial").locatedBy("//h3[contains(text(),' Gestión Distribuidor ')]");
    public static final Target BTN_CREAR_DISTRIBUIDOR = Target.the("Botón para ingresar al formulario de crear distribuidor").locatedBy("//button[@id='backoffice_seccionFiltros_boton_artefacto']");
    public static final Target TXT_FORMULARIO_CREAR_DISTRIBUIDOR = Target.the(" Texto del Formulario crear Distribuidor").locatedBy("//h3[contains(text(),'Crear Distribuidor')]");
    public static final Target BTN_CREAR_DISTRIBUIDOR_FORMULARIO = Target.the("Botón del formulario para crear distribuidor").locatedBy("//button[@id='btnEnviarFormularioCrearEditarGestionD']");
    public static final Target BOTON_SALIR_PANT_CREAR_DISTRI = Target.the("Boton Salir del formulario ").locatedBy("//button[@id='btnClosePanelCrearEditarGestionD']");
    public static final Target MSJ_ERROR_ASOCIAR_EMPRE_Y_COMERC = Target.the("Mensaje de error al crear distribuidor con empresa y comercializador asociado ").locatedBy("//div[contains(text(),'Debe de seleccionar una empresa o un comercializador.')]");
    public static final Target VALIDAR_BORDES_ROJO_EN_CAMPOS = Target.the("Borde de campos al ser requeridos").locatedBy("");
    public static final Target MSJ_ALERTA_POR_CAMPOS_VACIOS = Target.the("Mensaje al intentar cear distribuidor con campos vacios").locatedBy("//div[contains(text(),'Debe ingresar todos los campos requeridos del formulario')]");
    public static final Target INPUT_NIT_FORMULARIO = Target.the("Campo NIT formulario crear distribuidor").locatedBy("//input[@id=\"nitCrearEditarGd\"] ");
    public static final Target INPUT_NOMBRE_FORMULARIO = Target.the("Campo Nombre formulario crear distribuidor").locatedBy("//input[@id='razonSocialCrearEditarGd']");
    public static final Target INPUT_CORREO_FORMULARIO = Target.the("Campo Correo formulario crear distribuidor").locatedBy("//input[@id='correoCrearEditarGd']");
    public static final Target INPUT_TELEFONO_FORMULARIO = Target.the("Campo telefono formulario crear distribuidor").locatedBy("//input[@id='telefonoCrearEditarGd']");
    public static final Target INPUT_DOMINIO_FORMULARIO = Target.the("Campo dominio formulario crear distribuidor").locatedBy("//input[@id='dominioCrearEditarGd']");
    public static final Target INPUT_DIRECCION_FORMULARIO = Target.the("Campo direccion formulario crear distribuidor").locatedBy("//input[@id='direccionCrearEditarGd']");
    public static final Target LISTA_DESPLEGABLE_EMPRESAS = Target.the("Lista desplegable de empresas a asociar").locatedBy("//p-dropdown[@id='idEmpresaCrearEditarGd']");
    public static final Target LISTA_DESPLEGABLE_COMERCIALIZADORES = Target.the("Lista desplegable de comercializadores a asociar").locatedBy("//p-dropdown[@id='idComercializadorCrearEditarGd']");
    //public static final Target LISTA_DESPLEGABLE_PAISES = Target.the("Lista desplegable de paises ").locatedBy("//p-dropdown[@id='paisCrearEditarDistri']");
    //public static final Target LISTA_DESPLEGABLE_DEPARATAMENTOS = Target.the("Lista desplegable de departamentos").locatedBy("//p-dropdown[@id='DEPARTAMENTOCrearEditarDistri']");
    //public static final Target LISTA_DESPLEGABLE_CIUDAD = Target.the("Lista desplegable de ciudades").locatedBy("//p-dropdown[@id='municipioCrearEditarDistri']");
    //public static final Target MSJ_ERROR_CORREO_INCORRECTO = Target.the("Mensaje al ingresar datos erroneamente").locatedBy("//app-mensaje-error-input[@class='ng-star-inserted visible']");
    //public static final Target MSJ_ERROR_NIT_YA_REGISTRADO = Target.the("Mensaje al ingresar un número de NIT ya registrado").locatedBy("//div[contains(text(),'Este NIT ya se encuentra creado para otro Distribuidor')]");
    public static final Target MSJ_ERROR_NOMBRE_YA_REGISTRADO = Target.the("Mensaje al ingresar un nombre o razón social ya registrada").locatedBy("//div[contains(text(),'Esta Razón Social ya se encuentra creado para otro Distribuidor')]");
    public static final Target SWITCH_ESTADO = Target.the("Swich estado de el distribuidor").locatedBy("//span[@class='p-inputswitch-slider']");
    public static final Target BTN_SI_VENT_CONFIR = Target.the("Opción si en la ventana de confirmación").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target MSJ_EXITO_REGISTRO_CREADO = Target.the("Mensaje de confirmacion de registro creado").locatedBy("//div[contains(text(),'Se ha creado exitosamente el registro con el código 45 - SU RED APUESTAS')]");


    //ACCIONES
    //public static final Target ICONO_INACTIVAR_DISTRIBUIDOR = Target.the("Icono inactivar estado").locatedBy("(//i[@title='Permite activar el Distribuidor'])[1]");
    //public static final Target MSJ_AL_INACTIVAR_DISTRIBUIDOR = Target.the("Mensaje de confirmacion al inactivar distribuidor").locatedBy("//div[contains(text(),'Se ha inactivado exitosamente el registro con el código 45 - SU RED APUESTAS')]");
    //public static final Target ICONO_ACTIVAR_DISTRIBUIDOR = Target.the("icono activar distribuidor").locatedBy("(//i[@title='Permite activar el Distribuidor'])[1]");
    //public static final Target MSJ_AL_ACTIVAR_DISTRIBUIDOR = Target.the("Mensaje de confirmacion al activar distribuidor").locatedBy("//div[contains(text(),'Se ha activado exitosamente el registro con el código 45 - SU RED APUESTAS')]");
    //public static final Target ICONO_EDITAR_DISTRIBUIDOR = Target.the("Icono editar distribuidor").locatedBy("//i[@id='btnEditar1']");
    //public static final Target BOTON_EDITAR_DISTRIBUIDOR = Target.the("Botón editar distribuidor").locatedBy("//button[@id='btnEnviarFormularioCrearEditarGestionD']");
    //public static final Target MSJ_AL_EDITAR_DISTRIBUIDOR = Target.the("Mensaje de confirmación al editar distribuidor").locatedBy("//div[contains(text(),'Se ha editado exitosamente el registro con el código 45 - SU RED')]");
    //public static final Target BOTON_SALIR_PANT_EDITAR = Target.the("Botón Salir").locatedBy("//button[@id='btnClosePanelCrearEditarGestionD']");
    public static final Target TEXTO_TOOLTIP_ICONO_EDITAR = Target.the("Texto de tooltip de icono editar").locatedBy("//*[contains(text(),'Editar Comercializador')]");


    //FILTROS
    public static final Target BTN_FILTRAR = Target.the("Botón Consultar").located(By.id("btnFiltrar"));
    public static final Target LISTA_DESPLEGABLE_PAISES = Target.the("Lista desplegable de paises ").locatedBy("//p-dropdown[@id='paisCrearEditarDistri']");
    public static final Target LISTA_DESPLEGABLE_DEPARATAMENTOS = Target.the("Lista desplegable de departamentos").locatedBy("//p-dropdown[@id='DEPARTAMENTOCrearEditarDistri']");
    public static final Target LISTA_DESPLEGABLE_CIUDAD = Target.the("Lista desplegable de ciudades").locatedBy("//p-dropdown[@id='municipioCrearEditarDistri']");
    public static final Target MSJ_ERROR_CORREO_INCORRECTO = Target.the("Mensaje al ingresar datos erroneamente").locatedBy("//app-mensaje-error-input[@class='ng-star-inserted visible']");
    public static final Target MSJ_ERROR_NIT_YA_REGISTRADO = Target.the("Mensaje al ingresar un número de NIT ya registrado").locatedBy("");
    //public static final Target SWITCH_ESTADO = Target.the("Swich estado de el distribuidor").locatedBy("//*[@id=\"maincontent\"]/main/div[2]/app-gestion-distribuidores-v2/app-seccion-general/div/div[2]/app-crear-editar-distribuidor/div[1]/form/span[13]/p-inputswitch/div/span");
    //public static final Target BTN_SI_VENT_CONFIR = Target.the("Opción si en la ventana de confirmación").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    //public static final Target MSJ_EXITO_REGISTRO_CREADO = Target.the("Mensaje de confirmacion de registro creado").locatedBy("//div[contains(text(),'Se ha creado el distribuidor 487596124-1 - WIN POWER')]");

    //ACCIONES
    public static final Target ICONO_INACTIVAR_DISTRIBUIDOR = Target.the("Icono inactivar estado").locatedBy("[title='Cambiar Estado']");
    public static final Target MSJ_AL_INACTIVAR_DISTRIBUIDOR = Target.the("Mensaje de confirmacion al inactivar distribuidor").locatedBy("//div[contains(text(),'El estado se cambió con éxito')]");
    public static final Target ICONO_ACTIVAR_DISTRIBUIDOR = Target.the("icono activar distribuidor").locatedBy("[title='Cambiar Estado']");
    public static final Target MSJ_AL_ACTIVAR_DISTRIBUIDOR = Target.the("Mensaje de confirmacion al activar distribuidor").locatedBy("//div[contains(text(),'Se ha cambiado el estado del registro (454564369-6 - PRUEBA 1) exitosamente')]");
    public static final Target ICONO_EDITAR_DISTRIBUIDOR = Target.the("Icono editar distribuidor").locatedBy("[title='Editar']");
    public static final Target BOTON_EDITAR_DISTRIBUIDOR = Target.the("Botón editar distribuidor").locatedBy("//button[@id='btnEnviarFormularioCrearEditarGestionD']");
    public static final Target MSJ_AL_EDITAR_DISTRIBUIDOR = Target.the("Mensaje de confirmación al editar distribuidor").locatedBy("//div[contains(text(),'Se ha editado el distribuidor 454564369-6 - PRUEBA 1')]");
    public static final Target BOTON_SALIR_PANT_EDITAR = Target.the("Botón Salir").locatedBy("//button[@id='btnClosePanelCrearEditarGestionD']");


    //FILTROS
    //public static final Target BTN_FILTRAR = Target.the("Botón filtrar").locatedBy("//button[@title='Filtra los Distribuidores de acuerdo a los criterios de búsqueda']");
    public static final Target VALIDAR_LISTA_DISTRIBUIDORES = Target.the("lista de distribuidores").locatedBy("//tbody[@class='p-element p-datatable-tbody']");
    public static final Target INPUT_NIT_FILTRO = Target.the("Campo NIT de pantalla de filtro ").located(By.id("nitGestionDistribuidor"));
    public static final Target INPUT_NOMBRE_FILTRO = Target.the("Campo Nombre de pantalla de filtro ").located(By.id("razonSocialGestionDistribuidor"));
    public static final Target MSJ_FILTRO_SIN_RESULTADOS = Target.the("Mensaje al no encontrar registros").locatedBy("//strong[contains(text(),'No se encontraron DISTRIBUIDORES CONFIGURADOS')]");
    //public static final Target RESULT_FILTRO_NIT = Target.the("Resultado del registro encontrado por el filtro por NIT").locatedBy("//td[contains(text(),'56232841559-4')]");
    //public static final Target RESULT_FILTRO_NOMBRE = Target.the("Resultado del registro encontrado por el filtro por Nombre").locatedBy("//td[contains(text(),'Rifa El Pueblo S A S')]");
    //public static final Target BTN_LIMPIAR_FILTRO = Target.the("Limpiar filtros").locatedBy("//button[@id='btnLimpiarFiltros']");
    //public static final Target VALIDAR_CAMPO_NIT_VACIO = Target.the("Campo de filtro NIT").locatedBy("//input[@id='nitGestionDistribuidor']");


    public static final Target RESULT_FILTRO_NIT = Target.the("Resultado del registro encontrado por el filtro por NIT").locatedBy("//td[contains(text(),'900624957-6')]");
    public static final Target RESULT_FILTRO_NOMBRE = Target.the("Resultado del registro encontrado por el filtro por Nombre").locatedBy("//td[contains(text(),'PRUEBA 1')]");
    public static final Target BTN_LIMPIAR_FILTRO = Target.the("Limpiar filtros").located(By.id("btnLimpiarFiltros"));
    public static final Target VALIDAR_CAMPO_NIT_VACIO = Target.the("Campo de filtro NIT").locatedBy("//input[@id='nitGestionDistribuidor']");


    public static final Target BARRA_INFORMATIVA = Target.the("Barra donde aparece la alerta").located(By.xpath("//app-barra-alerta //p"));

    public static final Target MSJ_VENTANA_DE_CONFIRMACION = Target.the("Mensaje de confirmación de ventana ").located(By.xpath("//*[contains(@class,'p-confirm-dialog-message')]"));
    public static final Target ALERTA_CREACION_EXITOSA = Target.the("Alerta creacion exitosa").located(xpath("//div[contains(@class,'p-toast-detail')]"));
    public static final Target LISTA_DESPLEGABLE_REGION = Target.the("lista desplegable región").located(By.id("REGIONCrearEditarDistri"));

    public static final Target BTN_ACEPTAR_VENATA_CONFIRMACION = Target.the("Botón aceptar venatana de confirmación").located(By.id("backoffice_ventanaConfirmacion_boton_si"));
    public static final Target BTN_CANCELAR_VENATA_CONFIRMACION = Target.the("Botón cancelar venatana de confirmación").located(By.id("backoffice_ventanaConfirmacion_boton_no"));
    public static final Target BTN_SALIR_CREAR_GESTION_DISTRIBUIDOR = Target.the("Botón salir").located(By.id("btnClosePanelCrearEditarGestionD"));
    public static final Target TITULO_INVENTARIO_GENERAL = Target.the("Titulo del modulo IG").located(By.className("card-panel-header__title"));
    public static final Target BTN_GUARDAR = Target.the("Titulo del modulo IG").located(By.id("btnEnviarFormularioCrearEditarGestionD"));
    public static final Target SUB_MENU_GESTION_COMERCIAL = Target.the("Sub menú gestión comercial").located(By.xpath("//*[text()=' Gestión Comercial ']"));
    public static final Target BTN_CONSULTAR_GESTION_POLITICA = Target.the("Boton gestión politica - Consultar").located(By.id("btnFilter"));
    public static final Target SELECT_OPTION_PAIS_ALEATORIO = Target.the("Lista de paises").locatedBy("(//li[@role='option'])[{0}] ");
    public static final Target SUB_MENU_GESTION_POLITICA = Target.the("Sub menú gestión politica").located(By.xpath("//*[@title='Este módulo de la gestión comercial gestiona todo lo relacionado para la división política de un país']"));
    public static final Target LISTADO_SELECT = Target.the("Listado del select").located(By.className("p-dropdown-items-wrapper"));




}

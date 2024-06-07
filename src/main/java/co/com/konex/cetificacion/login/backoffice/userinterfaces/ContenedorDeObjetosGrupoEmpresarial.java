package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetosGrupoEmpresarial {

    public static final Target H3_TITULO_MOUDULO = Target.the("h3 que contiene la ruta actual").located(By.xpath("(//h3)[2]"));
    public static final Target COLUMNAS_TABLA_FILTROS = Target.the("Columnas mostradas filtros").locatedBy("(//tr //th)[{0}]");
    public static final Target TEXTO_PANEL_FILTRO2 = Target.the("Texto del boton Crear rupo empresarial").locatedBy("//label[contains(text(),'Crear grupo empresarial')]");
    public static final Target OPC_ESTADO_GRUPO_EMPRESA = Target.the("Opción estado").locatedBy("[title=\"Cambiar Estado\"]");
    public static final Target TEXTO_PANEL_FILTRO = Target.the("Texto del boton Filtrar").locatedBy("//label[contains(text(),'Filtrar')]");
    public static final Target MD_ADMIN = Target.the("Modulo de Administración").locatedBy("//div[contains(text(),'Administración')]");
    public static final Target MD_MULTINIVEL = Target.the("Modulo de Multinivel").locatedBy("//div[contains(text(),' Multinivel ')]");
    public static final Target OP_GRUPO_EMPRESARIAL = Target.the("Grupo empresarial").locatedBy("//a[@title='Modulo que permite la gestión de los grupos empresariales']");
    public static final Target TEXTO_MOD_GRUPO_EMPRESARIAL = Target.the("Texto del modulo Grupo empresarial").locatedBy("//h3[contains(text(),' Gestión Grupo Empresarial ')]");
    public static final Target BTN_VER_FILTROS = Target.the("Ver filtros").located(By.id("btnFiltrar"));
    public static final Target OP_CREAR_GRUPO_EMPRESAL = Target.the("Opción módulo Grupo empresarial").locatedBy("//*[contains(text(),'Crear grupo empresarial')]");
    public static final Target TITULO_FORMULARIO = Target.the("Titulo formulario crear Grupo empresarial").locatedBy("//h3[contains(text(),' Crear Grupo Empresarial ')]");
    public static final Target BTN_CREAR_GRUPO_EMPRESARIAL = Target.the("Boton crear Grupo empresarial").locatedBy("//button[@id='btnEnviarFormularioCrearEditarGrupo']");
    public static final Target BOTON_SALIR_PANT_CREAR_GRU_EMPRE = Target.the("Boton SALIR del formulario Crear Grupo empresarial").locatedBy("//button[@id='btnClosePanelCrearEditarEmpresa']");
    public static final Target BRD_ROJO_CAMPOS = Target.the("Campos resaltados con bordes rojos").locatedBy("//button[@class='button-global button-add-red ng-star-inserted']");
    public static final Target MSJ_ALERTA_POR_CAMPOS_VACIOS = Target.the("Mensaje de alerta ").locatedBy("//div[contains(text(),'Debe ingresar todos los campos requeridos del formulario')]");
    public static final Target INPUT_NIT = Target.the("NIT").locatedBy("//input[@id='nitCrearEditarGrupo']");
    public static final Target INPUT_RAZON_SOCIAL_NOMBRE = Target.the("Razón social o nombre").locatedBy("//input[@id='razonSocialCrearEditarGrupo']");
    public static final Target LIST_DESPLEGABLE_PAIS = Target.the("Lista desplegable de paises").locatedBy("//p-dropdown[@id='paisCrearEditarGrupo']");
    public static final Target SELECT_PAIS = Target.the("Lista desplegable de paises").locatedBy("[aria-label='{0}']");
    public static final Target LIST_DESPLEGABLE_DEPART = Target.the("Lista desplegable de departamentos").locatedBy("//p-dropdown[@id='DEPARTAMENTOCrearEditarGrupo']");
    public static final Target LIST_DESPLEGABLE_CIUDAD = Target.the("Lista desplegable de ciudades").locatedBy("//p-dropdown[@id='municipioCrearEditarGrupo']");
    public static final Target INPUT_DIRECCION = Target.the("Dirección").locatedBy("//input[@id='direccionCrearEditarGrupo']");
    public static final Target INPUT_CORREO = Target.the("Correo electronico").locatedBy("//input[@id='correoCrearEditarGrupo']");
    public static final Target INPUT_TELEFONO = Target.the("Teléfono").locatedBy("//input[@id='telefonoCrearEditarGrupo']");
    public static final Target INPUT_DOMINIO = Target.the("Doominio").locatedBy("//input[@id='dominioCrearEditarGrupo']");
    public static final Target ACTIVAR_SWITCH_ESTADO = Target.the("Estado").locatedBy("//span[@class='p-inputswitch-slider']");
    public static final Target INACTIVAR_SWITCH_ESTADO = Target.the("Inactivar estado del registro").locatedBy("//span[@class='p-inputswitch-slider']");

    public static final Target MSJ_ERROR_EN_CAMPOS = Target.the("Mensaje de error al ingresar datos mal").locatedBy("//app-mensaje-error-input[@class='ng-star-inserted visible']");
    public static final Target BTN_SI_VENT_CONFIR = Target.the("Boton Sí en venta de confirmación").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_si']");
    public static final Target BTN_NO_VENT_CONFIR = Target.the("Boton Sí en venta de confirmación").locatedBy("//button[@id='backoffice_ventanaConfirmacion_boton_no']");
    public static final Target MSJ_EXITOSO = Target.the("Mensaje exito al crear Grupo empresarial").locatedBy("//div[contains(text(),'Se ha creado exitosamente el registro con el código 68 - MATRIZ')]");
    public static final Target MSJ_ERROR_AL_INGRESAR_NIT_EXISTENTE = Target.the("Mensaje de error al intentar crear un registro con un NIT existente").locatedBy("//div[contains(text(),'{0}')]");


    public static final Target BTN_FILTRAR = Target.the("Boton filtar").located(By.id("btnFiltrar"));
    public static final Target BTN_GUARDAR = Target.the("Boton guardar").located(By.id("btnEnviarFormularioCrearEditarGrupo"));
    public static final Target VALIDAR_LISTA_GRUPO_EMPRESARIAL = Target.the("Lista de grupos empresariales").locatedBy("//tbody[@class='p-element p-datatable-tbody']");
    public static final Target MSJ_FILTRO_SIN_RESULTADOS = Target.the("Mensaje de No se encuentrarón resultados").locatedBy("//strong[contains(text(),'No se encontraron GRUPOS EMPRESARIALES CONFIGURADOS')]");
    public static final Target INPUT_NIT_FILTRO = Target.the("Campo NIT del filtro").locatedBy("//input[@id='nitGrupoEmpresarial']");
    public static final Target INPUT_NOMBRE_FILTRO = Target.the("Campo Nombre del filtro").locatedBy("//input[@id='razonSocialGrupoEmpresarial']");
    public static final Target BTN_LIMPIAR_FILTRO = Target.the("Opción limpiar en la pantalla de filtro").located(By.id("btnLimpiarFiltros"));
    public static final Target NIT_TABLA_RESULTADOS = Target.the("NIT en tabla de resultados de filtro de busqueda").locatedBy("//td[contains(text(),'{0}')]");
    public static final Target NOMBRE_TABLA_RESULTADOS = Target.the("Nombre en tabla de resultados de filtro de busqueda").locatedBy("//td[contains(text(),'{0}')]");
    public static final Target VALIDAR_CAMPO_NIT_VACIO = Target.the("Limpiar campo de NIT de filtro").locatedBy("//input[@id='nitGrupoEmpresarial']");
    public static final Target VALIDAR_CAMPO_NOMBRE_VACIO = Target.the("Limpiar campo de Nombre de filtro").locatedBy("//input[@id='razonSocialGrupoEmpresarial']");


    public static final Target OPC_ACTIVAR_GRUPO_EMPRESA = Target.the("Activar grupo empresarial").located(By.cssSelector("[title='Activar Grupo Empresarial']"));
    public static final Target OPC_ACTIVAR_GESTION_COM = Target.the("Activar grupo empresarial").locatedBy("i.state-activa");
    public static final Target OPC_INACTIVAR_GRUPO_EMPRESA = Target.the("Inactivar grupo empresarial").located(By.cssSelector("[title='Desactivar Grupo Empresarial']"));
    public static final Target OPC_INACTIVAR_GESTION_COM = Target.the("Inactivar grupo empresarial").locatedBy("i.state-inactivo");
    public static final Target MSJ_GRUPO_EMPRESARIAL_INACTIVO = Target.the("Mensaje al inactivar grupo empresarial").locatedBy("//div[contains(@class,'p-toast-detail')]");
    public static final Target MSJ_GRUPO_EMPRESARIAL_ACTIVADO = Target.the("Mensaje al activar grupo empresarial").locatedBy("//div[contains(text(),'Se ha activado exitosamente el registro)]");
    public static final Target OPC_EDITAR_GRUPO_EMPRESARIAL = Target.the("Icono editar grupo empresarial").located(By.cssSelector("[title='Editar']"));
    public static final Target BTN_EDITAR_GRUPO_EMPRESARIAL = Target.the("Editar grupo empresarial").locatedBy("//button[@id='btnEnviarFormularioCrearEditarGrupo']");
    public static final Target MSJ_AL_EDITAR_GRUPO_EMPRESARIAL = Target.the("Mensaje al editar grupo empresarial").locatedBy("//div[contains(text(),'Se ha editado exitosamente el registro')]");
    public static final Target BTN_SALIR_PANT_EDICION = Target.the("Boton salir de formulario editar Grupo empresarial ").locatedBy("//button[@id='btnClosePanelCrearEditarEmpresa']");
    public static final Target ICONO_VER_DETALLE = Target.the("Icono Ver detalle ").located(By.cssSelector("[title='Ver Grupo Empresarial']"));
    public static final Target ICONO_VER_DETALLE_ACCION = Target.the("Icono Ver detalle ").located(By.cssSelector("[title='Ver Detalle']"));
    public static final Target TEXTO_MODAL_VER_DETALLE = Target.the("Modal ver detalle ").locatedBy("//span[contains(text(),'Detalle Grupo Empresarial')]");
    public static final Target INPUT_NIT_FILTRO_MODAL = Target.the("Campo NIT del Filtro del modal detalle").locatedBy("//input[@id='filtroNitGrupoEmpresarial']");
    public static final Target BOTON_FILTRAR_EN_MODAL = Target.the("Boton Filtrar del modal detalle").located(By.cssSelector("#filtrarDetailGrupoEmpresarial button"));
    public static final Target RESULTADO_FILTRO_NIT_MODAL = Target.the("Registro asociado al NIT ingresado").locatedBy("//td[contains(text(),'{0}')]");
    public static final Target BTN_LIMPIAR_FILTRO_MODAL = Target.the("Botón limpiar en modal ver detalle").located(By.cssSelector("#limpiarFiltrosGrupoEmpresarial button"));
    public static final Target MSJ_ERROR_AL_INACTIVAR_GRU_EMP = Target.the("Mensaje de error al intentar inactivar grupo empresarial con empresa asociada").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_GESTION_COMERCIAL = Target.the("Botón para acceder a gestion comercial").located(By.xpath("//*[contains(text(),' Gestión Comercial ')]"));
    public static final Target BTN_GESTION_POLITICA = Target.the("Botón para acceder a gestion politica").located(By.xpath("//*[contains(text(),' Gestión Política')]"));
    public static final Target BTN_FILTRAR_GESTION_POLITICA = Target.the("Botón para filtrar gestion politica").located(By.id("btnFilter"));
    public static final Target BTN_ACTIVO_INACTIVO = Target.the("Vizualizacion de activo/inactivo").locatedBy("(//*[@id='btnTogglePais'])[{0}]");
    public static final Target PAIS_TABLA = Target.the("pais de la tabla").locatedBy("//*[@role='table']/tbody/tr[{0}]/td[3]");
    public static final Target LISTA_PAISES_GRUPO_EMPRESARIAL = Target.the("paises de la lista de grupo empresarial").locatedBy("(//*[@role='listbox']//span)[{0}]");
    public static final Target VENTANA_CONFIRMACION = Target.the("Ventana de conformacion al crear grupo empresarial").locatedBy("//*[contains(@class,'p-confirm-dialog-message')]");
    public static final Target BTN_SALIR = Target.the("Boton para salir").located(By.id("btnClosePanelCrearEditarGrupo"));
    public static final Target SELECT_REGION = Target.the("Boton seleccionar region").located(By.id("REGIONCrearEditarGrupo"));
}

# language: es

@HU3CREAREMPRESA
Característica: Validar formulario crear grupo empresarial
  COMO administrador
  QUIERO poder crear un grupo empresarial con ciertas características
  PARA poder administrarlas

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial
    Y de clic en la opcion Crear Grupo Empresarial+


  @CP5827
  Escenario: Validar ingreso al formulario Crear Grupo empresarial
    Entonces el sistema muestra el formulario de crear grupo empresarial

  @CP5829
  Escenario: Validar boton Salir del formulario Crear Grupo empresarial.
    Y el usuario da click en salir
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el usuario valida el titulo del modulo Gestión Grupo Empresarial

  @CP4517
  Esquema del escenario: Verificar mensaje al intentar crear grupo empresarial con campos obligatorios vacíos
    Y el usuario deja en blanco algunos de los campos
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> |
    Entonces el sistema inhabilita el boton guardar

    Ejemplos:
      | Descripcion                       | NIT         | razonSocialONombre | pais  | departamento     | ciudad | direccion        | correoElectronico  | telefono   |
      | Al dejar el campo de NIT vacio    |             | APUESTA S.A.S      | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56  | apuest@gmail.com   | 3125894358 |
      | Al dejar el campo de nombre vacío | 123456789-1 |                    | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56  | apuest@gmail.com   | 3125894358 |
      | Al campo de direccion vacío       | 55689867-2  | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  |                  | apuest@hotmail.com | 3125806358 |
      | Al campo de correo vacío          | 556845632-3 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22D #7-90  |                    | 3125898358 |
      | Al campo de teléfono vacío        | 556874586-4 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 25A # 8-50 | apuest@hotmail.com |            |

  @CP7413
  Esquema del escenario: Validar mensaje al ingresar datos incorrectos en los campos e intentar crear un grupo empresarial
    Y el usuario ingrese datos incorrectos en los campos del formulario
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Entonces el sistema muestra el respectivo mensaje de error ge
      | msjError   |
      | <msjError> |
    Ejemplos:
      | NIT         | razonSocialONombre | pais  | departamento     | ciudad | direccion       | correoElectronico | telefono        | dominio  | msjError                                                                      |
      | 556885698-1 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56 | invalido          | +(57)3125896358 | valido   | El formato del correo electrónico ingresado no es correcto                    |
      | 556885698-1 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56 | valido            | 312 589 63 58   | valido   | El formato debe ser +(Indicativo país)Número de teléfono, Eje:+(57)3205511122 |
      | 556885698-1 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56 | valido            | +(57)3125896358 | invalido | Debe iniciar con 'http://' o 'https://', seguido el enlace web                |
      | 556885698   | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56 | valido            | +(57)3125896358 | valido   | Este campo no es válido                                                       |

  @CP5828 @CP16662
  Esquema del escenario: Verificar que se permita crear un Grupo empresarial al completar todo los datos requeridos
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y activa el switch Estado
    Y le da click al boton Crear grupo empresarial
    Entonces el usuario valida en la ventana de confirmación <mensaje>
    Y valida que exista el boton ACEPTAR
    Y valida que exista el boton CANCELAR
    Y el usuario da clic en Si en la ventana de confirmación
    Y guarda los valores

    Ejemplos:
      | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion                                     | correoElectronico  | telefono        | dominio | mensaje                                            |
      | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | Av. Calle 26 No. 69D – 91 Torre 2 Oficina 905 | acierta2@gmail.com | +(57)3205874126 |         | ¿Está seguro que desea crear el grupo empresarial? |


  @CP10155
  Esquema del escenario: Mensaje de error al crear un registro con un NIT ya existente
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y activa el switch Estado
    Y le da click al boton Crear grupo empresarial
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema muestra un mensaje de error indicando que el NIT ya existe <msjError>

    Ejemplos:
      | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion                                     | correoElectronico | telefono     | dominio | msjError                                                    |
      | existente | MATRIX             | RUSIA | DISTRITO FEDERAL | MOSCU  | Av. Calle 26 No. 69D – 91 Torre 2 Oficina 905 | valido            | +(57)5966999 | valido  | Este NIT ya se encuentra creado para otro Grupo Empresarial |

  @CP4518
  Esquema del escenario: Validar ingreso de caracteres
    Cuando el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Entonces valida la cantidad de caracteres grupo empresarial con <msjDeFalla>

    Ejemplos:
      | NIT        | razonSocialONombre | pais  | departamento     | ciudad | direccion  | correoElectronico | telefono   | dominio    | msjDeFalla                                          |
      | caracteres | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | valido     | valido            | valido     | valido     | Este campo debe contener 20 caracteres como máximo  |
      | valido     | caracteres         | RUSIA | DISTRITO FEDERAL | MOSCU  | valido     | valido            | valido     | valido     | Este campo debe contener 60 caracteres como máximo  |
      | valido     | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | caracteres | valido            | valido     | valido     | Este campo debe contener 50 caracteres como máximo  |
      | valido     | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | valido     | caracteres        | valido     | valido     | Este campo debe contener 50 caracteres como máximo  |
      | valido     | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | valido     | valido            | caracteres | valido     | Este campo debe contener 20 caracteres como máximo  |
      | valido     | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | valido     | valido            | valido     | caracteres | Este campo debe contener 255 caracteres como máximo |


    #Este mensaje deberá estar como cambio del 23/05/2024
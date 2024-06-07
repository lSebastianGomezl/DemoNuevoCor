# language: es


@HU2
Característica: Validar el modulo gestión Distribuidor
  COMO administrador
  QUIERO poder crear un distribuidor con ciertas características
  PARA poder administrarlo


  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GestiónDistribuidor
    Y de clic en la opcion Crear Distribuidor+

  @CP6187
  Escenario: Validar ingreso al formulario Crear Distribuidor
    Entonces el sistema muestra el formulario de crear distribuidor


  @CP7018
  Esquema del escenario: Verificar mensaje al crear distribuidor con campos vacíos.
    Y el usuario ingresa datos solo en algunos campos
      | asociarAEmpresa   | asociarAComercializador   | NIT   | razonSocialONombre   | pais   | region   | departamento   | ciudad   | municipio   | correoElectronico   | telefono   |
      | <asociarAEmpresa> | <asociarAComercializador> | <NIT> | <razonSocialONombre> | <pais> | <region> | <departamento> | <ciudad> | <municipio> | <correoElectronico> | <telefono> |
    Entonces el boton guardar de gestion distribuidor debe estar deshabilitado
    Ejemplos:
      | Descripcion                          | asociarAEmpresa              | asociarAComercializador | NIT         | razonSocialONombre | pais     | region | departamento | municipio | direccion       | correoElectronico      | telefono       | msjError                                                  |
      | Al dejar el campo de NIT vacio       | Jm Holding Inversiones S A S |                         |             | GanaTodo           | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | Calle 5S #20-00 | konex@gmail.com        | +(57)312587489 | Debe ingresar todos los campos requeridos del formulario. |
      | Al dejar el campo de Nombre vacio    | Jm Holding Inversiones S A S |                         | 896541234-1 |                    |          |        |              |           | Calle 5S #20-00 | konex@gmail.com        | +(57)312587489 | Debe ingresar todos los campos requeridos del formulario. |
      | Al dejar el campo de direccion vacio | Jm Holding Inversiones S A S |                         | 896541236-1 | GanaTodo           | COLOMBIA |        |              |           |                 | dnaempresa@hotmail.com | +(57)639585411 | Debe ingresar todos los campos requeridos del formulario. |
      | Al dejar el campo de correo vacio    | Jm Holding Inversiones S A S |                         | 895623145-2 | GanaTodo           | COLOMBIA | ANDINA |              |           | Calle 4N #20-00 |                        | +(57)87512536  | Debe ingresar todos los campos requeridos del formulario. |
      | Al dejar el campo de telefono vacio  | Jm Holding Inversiones S A S |                         | 895623142-2 | GanaTodo           | COLOMBIA | ANDINA | CUNDINAMARCA |           | Calle 4N #20-00 | jsa-gana@gmail.com     |                | Debe ingresar todos los campos requeridos del formulario. |


  @CP7177
  Esquema del escenario: Validar mensaje al ingresar datos incorrectos en los campos  al crear distribuidor
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa   | asociarAComercializador   | NIT   | razonSocialONombre   | pais   | region   | departamento   | municipio   | direccion   | correoElectronico   | telefono   | dominio   |
      | <asociarAEmpresa> | <asociarAComercializador> | <NIT> | <razonSocialONombre> | <pais> | <region> | <departamento> | <municipio> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Entonces el sistema muestra el respectivo mensaje de error
      | msjError   |
      | <msjError> |
    Ejemplos:
      | Descripcion                                 | asociarAEmpresa              | asociarAComercializador | NIT         | razonSocialONombre | pais     | region | departamento | municipio | direccion       | dominio                   | correoElectronico  | telefono        | msjError                                                                      |
      | Al ingresar un NIT invalido                 | Jm Holding Inversiones S A S |                         | 5568        | JUEGOS             | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56 | http://www.la.com         | apuest@gmail.com   | +(57)3125896358 | Este campo no es válido                                                       |
      | Al ingresar un formato de correo invalido   | Jm Holding Inversiones S A S |                         | 556856321-9 | APUESTAS S.A.S     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56 | http://www.l_apuestas.com | apuesthotmail.com  | +(57)3125896358 | El formato del correo electrónico ingresado no es correcto                    |
      | Al ingresar un formato de telefono invalido | Jm Holding Inversiones S A S |                         | 556856321-9 | APUESTAS S.A.S     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56 | http://www.l_apuestas.com | apuest@hotmail.com | 3125896358      | El formato debe ser +(Indicativo país)Número de teléfono, Eje:+(57)3205511122 |
      | Al ingresar un formato de telefono invalido | Jm Holding Inversiones S A S |                         | 556856321-9 | APUESTAS S.A.S     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56 | www.l_apuestas.com        | apuest@hotmail.com | +(57)3125896358 | Debe iniciar con 'http://' o 'https://', seguido el enlace web                |


  @CP11738
  Escenario: Validar que solo de enlisten los registros activos en la lista desplegable de "Empresa"
    Dado el usuario da clic en gestión empresas
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Y se guardan todas las empresas activas de gestion empresa
    Dado el usuario da clic en gestion distribuidor
    Y el usuario da clic en el boton crear distribuidor
    Y el usuario da clic en asociar empresa
    Entonces el sistema enlista solo los registro activos de Empresas

  @CP11739
  Escenario: Validar que solo de enlisten los registros activos en la lista desplegable de "Comercializador"
    Dado el usuario da clic en gestión comercializadores
    Y el usuario da clic en el boton Consultar gestion comercializadores
    Y se guardan todas los comercializadores activas de gestion comercializador
    Dado el usuario da clic en gestion distribuidor
    Y el usuario da clic en el boton crear distribuidor
    Y el usuario da clic en asociar comercializador
    Entonces el sistema enlista solo los registro activos de Comercializador

  @CP16713
  Escenario: Validar ventana de confirmación al accionar el botón salir de la pantalla crea distribuidor
    Y el usuario da clic en el boton Salir en el formulario gestion comercializador
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de que desea volver sin guardar los cambios?
    Y valida que exista el boton ACEPTAR
    Y valida que exista el boton CANCELAR

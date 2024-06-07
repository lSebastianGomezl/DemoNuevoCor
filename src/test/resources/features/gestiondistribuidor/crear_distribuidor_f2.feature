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


  @CP16715
  Escenario: Validar botón "No" de la ventana de confirmación de la pantalla crear distribuidor
    Y el usuario da clic en el boton Salir en el formulario gestion comercializador
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de que desea volver sin guardar los cambios?
    Y el usuario da click en no de la ventana de confirmacion
    Entonces el usuario valida el titulo del modulo Crear Distribuidor

  @CP6807
  Escenario: Validar botón "Si" de la ventana de confirmación de la pantalla crear distribuidor
    Y el usuario da clic en el boton Salir en el formulario gestion comercializador
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de que desea volver sin guardar los cambios?
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el usuario valida el titulo del modulo Gestión Distribuidor

  @CP8774
  Esquema del escenario: Validar ingreso de Caracteres
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa   | asociarAComercializador   | NIT   | razonSocialONombre   | pais   | region   | departamento   | municipio   | direccion   | correoElectronico   | telefono   | dominio   |
      | <asociarAEmpresa> | <asociarAComercializador> | <NIT> | <razonSocialONombre> | <pais> | <region> | <departamento> | <municipio> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Entonces el sistema muestra el respectivo mensaje de error
      | msjError   |
      | <msjError> |

    Ejemplos:
      | asociarAEmpresa              | asociarAComercializador | NIT                              | razonSocialONombre                                                                         | pais     | region | departamento | municipio | direccion                                                | dominio                                                                                                                                                                                                                                                                     | correoElectronico                                           | telefono                                                          | msjError                                            |
      | Jm Holding Inversiones S A S |                         | 11111111111111111111111111111111 | JUEGOS                                                                                     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56                                          | http://www.la.com                                                                                                                                                                                                                                                           | apuest@gmail.com                                            | +(57)3125896358                                                   | Este campo debe contener 20 caracteres como máximo  |
      | Jm Holding Inversiones S A S |                         | 123456-9                         | 123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56                                          | http://www.la.com                                                                                                                                                                                                                                                           | apuest@gmail.com                                            | +(57)3125896358                                                   | Este campo debe contener 60 caracteres como máximo  |
      | Jm Holding Inversiones S A S |                         | 123456-9                         | JUEGOS                                                                                     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | 12345678901234567890123456789012345678901234567890123456 | http://www.la.com                                                                                                                                                                                                                                                           | apuest@gmail.com                                            | +(57)3125896358                                                   | Este campo debe contener 50 caracteres como máximo  |
      | Jm Holding Inversiones S A S |                         | 123456-9                         | JUEGOS                                                                                     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56                                          | http://www.la.com                                                                                                                                                                                                                                                           | 1@45678901234567890123456789012345678901234567890123456.COM | +(57)3125896358                                                   | Este campo debe contener 50 caracteres como máximo  |
      | Jm Holding Inversiones S A S |                         | 123456-9                         | JUEGOS                                                                                     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56                                          | http://www.la.com                                                                                                                                                                                                                                                           | apuest@gmail.com                                            | +(57)111111111111111111111111111111111111111111111111111111111111 | Este campo debe contener 20 caracteres como máximo  |
      | Jm Holding Inversiones S A S |                         | 123456-9                         | JUEGOS                                                                                     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | calle 22d #8-56                                          | https://123456789012345678901234567890123888888888888888888888888888888888888888888sdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd8888.com45678901234567890123456 | apuest@gmail.com                                            | +(57)350210555                                                    | Este campo debe contener 255 caracteres como máximo |


  @CP16722
  Escenario: Validar ventana de confirmación al accionar el botón "Guardar"
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa              | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      | Jm Holding Inversiones S A S |                         | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y valida que exista el boton ACEPTAR
    Y valida que exista el boton CANCELAR

  @CP16723
  Escenario: Validar botón "No" de ventana de confirmación para la creación de un distribuidor
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa              | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      | Jm Holding Inversiones S A S |                         | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y el usuario da click en no de la ventana de confirmacion
    Entonces el sistema muestra el formulario de crear distribuidor

  @CP6701
  Escenario: Validar crear distribuidor con empresa asociada
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa              | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      | Jm Holding Inversiones S A S |                         | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito


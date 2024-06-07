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


  @CP9924
  Escenario: Validar crear distribuidor con comercializador asociado
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      |                 | aleatorio               | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP10162
  Escenario: Validar mensaje al intentar crear un registro con un NIT ya existente en el sistema
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa | asociarAComercializador | NIT         | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      |                 | aleatorio               | 555555555-1 | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo Este NIT ya se encuentra creado para otro Distribuidor


  @CP10248
  Esquema del escenario: Validar mensaje de error al intentar crear un distribuidor y asociarlo a empresa y comercializador simultaneamente.
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa   | asociarAComercializador   | NIT   | razonSocialONombre   | pais   | region   | departamento   | municipio   | direccion   | correoElectronico   | telefono   | dominio   |
      | <asociarAEmpresa> | <asociarAComercializador> | <NIT> | <razonSocialONombre> | <pais> | <region> | <departamento> | <municipio> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Entonces el campo <campo> está deshabilitado

    Ejemplos:
      | asociarAEmpresa | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   | campo                     |
      |                 | aleatorio               | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio | Asociar a Empresa         |
      | aleatorio       |                         | aleatorio | aleatorio          | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio | Asociar a Comercializador |


  @CP14063
  Escenario: Validar mensaje al intentar crear un registro con una Razón social ya existente en el sistema
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono  | dominio   |
      |                 | aleatorio               | aleatorio | Sun City S A S     | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN     | aleatorio | aleatorio         | aleatorio | aleatorio |
    Cuando el usuario da clic en el boton editar guardar
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea crear el distribuidor?
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo Esta Razón Social ya se encuentra creada para otro Distribuidor

  @CP16652
  Escenario: Validar que solo se enlisten los países activos en el menú despegable "País"
    Dado el usuario da clic en gestion comercial
    Y el usuario da clic en gestion politica
    Y el usuario da clic en consultar gestion politica
    Cuando el usuario guarda los paises activos
    Dado el usuario da clic en gestion distribuidor
    Y de clic en la opcion Crear Distribuidor+
    Y el usuario da clic en el select de pais gestion distribuidor
    Entonces valida que los paises listados sean los guardados de gestion politica

  @CP16653
  Escenario: Validar despliegue automático de la división política configurada al seleccionar el país
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Y el usuario da clic en parametrización Colombia
    Y el usuario da clic en el boton Consultar Jerarquias
    Entonces el sistema guarda las regiones buscadas
    Y el usuario ingresa a la ruta Multinivel Gestion Distribuidor
    Y de clic en la opcion Crear Distribuidor+
    Y el usuario ingrese datos en los campos del formulario de una manera
      | asociarAEmpresa | asociarAComercializador | NIT       | razonSocialONombre | pais     | region | departamento | municipio | direccion | correoElectronico | telefono | dominio |
      |                 | aleatorio               | aleatorio | aleatorio          | COLOMBIA |        |              |           |           |                   |          |         |
    Entonces el usuario da clic en Select de Región de gestion distribuidor
    Y el sistema muestra las regiones activas en Gestion Comercializador

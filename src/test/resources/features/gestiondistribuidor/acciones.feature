# language: es

@HU4
Característica: Validar que se pueda realizar acciones como editar activar e inactivar un distribuidor
  COMO administrador
  QUIERO poder realizar la busqueda de un distribuidor por una carcteristica especifica
  PARA poder editarla, activar e inactivar

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GestiónDistribuidor
    Y El usuario diligencie los campos de fitro que desee y seleccione el boton filtrar
      | NIT         | nombre |
      | 651728740-1 |        |

  @CP7009
  Escenario: Verificar que se pueda inactivar el distribuidor que desee el usuario
    Dado el usuario da clic en el boton Consultar gestion distribuidor
    Y selecciona el icono de desactivar en el apartado de acciones ge dis
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de cambiar el estado del distribuidor?
    Y el usuario da click en no de la ventana de confirmacion
    Y selecciona el icono de desactivar en el apartado de acciones ge dis
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP7010
  Escenario: Verificar que se pueda activar el distribuidor que desee el usuario
    Dado el usuario da clic en el boton Consultar gestion distribuidor
    Y selecciona el icono de activar en el apartado de acciones ge dis
    Y el usuario da click en no de la ventana de confirmacion
    Y selecciona el icono de desactivar en el apartado de acciones ge dis
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP7014
  Escenario: Verificar que se pueda editar el distribuidor que desse el usuario
    Dado el usuario da clic en el boton Consultar gestion distribuidor
    Y selecciona el icono de editar en el apartado de acciones ge dis
    Y realiza las modificaciones en los campos que desee
      | asociarAEmpresa | asociarAComercializador | razonSocialONombre | pais     | region | departamento | municipio | direccion       | correoElectronico         | telefono        | dominio                 |
      | BANCARD S.A.S   |                         | aleatorio           | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN    | CARRERA 9 #7-52 | pruebacalidad@hotmail.com | +(57)0986745823 | http://WWW.PRUEBA_1.COM |
    Y el usuario da clic en el boton editar guardar
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El registro se actualizó con éxito

  @CP7015
  Escenario: Verificar que se pueda salir de la pantalla editar distribuidor
    Dado el usuario da clic en el boton Consultar gestion distribuidor
    Y selecciona el icono de editar en el apartado de acciones ge dis
    Y el usuario da clic en el boton Salir gd
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el usuario valida el titulo del modulo Gestión Distribuidor

  @CP8928
  Escenario: Validar el no poder editar NIT
    Dado el usuario da clic en el boton Consultar gestion distribuidor
    Y selecciona el icono de editar en el apartado de acciones ge dis
    Entonces valida el nit este deshabilitado gestion distribuidor


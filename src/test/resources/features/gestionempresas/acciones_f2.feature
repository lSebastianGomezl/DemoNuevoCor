# language: es
#Autor:sebastian.zapata@konexinnovation.com.co

@HU4
Característica: Validar que se pueda realizar acciones como editar o inactivar/activar una empresa
  COMO administrador
  QUIERO poder realizar la busqueda de una empresa por una carcteristica especifica
  PARA poder editarla y activar/inactivar

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GestiónEmpresas

  @CP10239
  Escenario: Verificar mensaje de error al intentar modificar el estado de una empresa con distribuidor asociado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT         | nombreOCodigo       |
      | 253698126-1 | EmpresaCundinamarca |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de editar en el apartado de acciones
    Y el usuario inactiva el switch Estado y da clic en editar Empresa
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Distribuidores asociados.

  @CP5811
  Escenario: Verificar que se pueda salir de la pantalla editar empresa
    Y El usuario diligencia el campo de filtro con un NIT existente de un registro con distribuidor asociado
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de editar en el apartado de acciones
    Y el usario da clic en salir del menu editar
    Y da clic en Si
    Entonces el sistema regresa a la pantala de filtro ge

  @CP16978
  Escenario: Validar ventana de confirmación al activar/Inactivar un registro
    Y El usuario diligencia el campo de filtro con un NIT existente de un registro con distribuidor asociado
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de inactivar en el apartado de acciones
    Y el sistema muestra la ventana de confirmacion de activar

  @CP16979
  Escenario: Validar botón "No" de la ventana de confirmación para el cambio de estado de un registro
    Y El usuario diligencia el campo de filtro con un NIT existente de un registro con distribuidor asociado
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de inactivar en el apartado de acciones
    Y el sistema muestra la ventana de confirmacion de activar
    Y da clic en No

  @CP8927
  Escenario: Validar el no poder editar NIT
    Y El usuario diligencia el campo de filtro con un NIT existente de un registro con distribuidor asociado
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de editar en el apartado de acciones
    Entonces el sistema no permite editar el campo NIT gestion empresas



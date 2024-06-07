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

  @CP5808
  Escenario: Verificar que se pueda desactivar la empresa  asociada al NIT ingresado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT         |
      | 694442301-7 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de inactivar en el apartado de acciones
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP5809
  Escenario: Verificar que se pueda activar la empresa  asociada al NIT ingresado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT         |
      | 694442301-7 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de activar en el apartado de acciones ge
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito


  @CP5810
  Escenario: Verificar que se pueda editar la empresa  asociada al NIT ingresado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de editar en el apartado de acciones
    Y realiza las modificaciones que desea y presiona el boton editar empresa
      | grupoEmpresarial | razonSocialONombre        | direccion | correoElectronico                      | telefono        | tipoDePago |
      | Grupo Quebec     | Gran Punto De Suerte Ltda | aleatorio | contacto.empresa@gransuertecali.com.co | +(57)6023375089 | EFECTIVO   |
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se actualizó con éxito

  @CP10229
  Escenario: Verificar mensaje al intentar inactivar registro con comercializador asociado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT          |
      | 9012813742-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de inactivar en el apartado de acciones
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Comercializadores asociados.


  @CP10230
  Escenario: Verificar mensaje al intentar inactivar registro con distribuidor asociado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT         | nombreOCodigo       |
      | 901289601-6 | Dreams Colombia S A S |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de inactivar en el apartado de acciones
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Distribuidores asociados.


  @CP10238
  Escenario: Verificar mensaje de error al intentar modificar el estado de una empresa con comercializador asociado
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT          |
      | 9000853717-8 |
    Y el usuario da clic en el boton consultar
    Y selecciona el icono de editar en el apartado de acciones
    Y el usuario inactiva el switch Estado y da clic en editar Empresa
    Y da clic en Si
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Comercializadores asociados.

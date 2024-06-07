# language: es

@HUACCIONESGRUPOEMPRESARIAL
Característica: Validar que se pueda realizar acciones como editar o inactivar/activar un grupo empresarial
  COMO administrador
  QUIERO poder realizar la busqueda de una empresa por una carcteristica especifica
  PARA poder editarla y activar/inactivar

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial


  @CP5836
  Escenario: Verificar que se pueda inactivar la empresa  asociada al NIT ingresado
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 289064079-5 |
    Y le da clic en el boton filtar
    Y selecciona el icono de desactivar en el apartado de acciones
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP5837
  Escenario: Verificar que se pueda activar el grupo empresarial asociado al NIT ingresado
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 289064079-5 |
    Y le da clic en el boton filtar
    Y selecciona el icono de activar en el apartado de acciones ge
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP5838
  Esquema del escenario: Verificar que se pueda editar el grupo empresarial asociado al NIT ingresado
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y el usuario da clic en el boton filtar grupo empresarial
    Y selecciona el icono de editar en el apartado de acciones ge
    Y realiza las modificaciones en los campos que desee y presiona el boton editar Grupo empresarial
      | razonSocialONombre   | direccion   | correoElectronico   | telefono   | dominio   |
      | <razonSocialONombre> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo El registro se actualizó con éxito

    Ejemplos:
      | razonSocialONombre | direccion  | correoElectronico                  | telefono      | dominio                    |
      | aleatorio          | Dg. 91 #69 | matriz_grupo_empresarial@gmail.com | +(57)30000000 | https://www.grupomatrix.co |


  @CP5839
  Escenario: Verificar que se pueda salir de la pantalla editar empresa
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y selecciona el icono de editar en el apartado de acciones ge
    Y el usuario da clic en el boton salir ge
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema muestra el titulo del modulo Gestión Grupo Empresarial

  @CP5840
  Escenario: Verificar el ingreso al modal de ver detalle
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT          |
      | 9008763322-2 |
    Y le da clic en el boton filtar
    Y selecciona el icono de ver detalle
    Entonces el sistema muestra un modal con las empresas asociadas al grupo empresarial

  @CP5877
  Esquema del escenario: Verificar el filtro de empresas en el modal de ver detalle
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT          |
      | 9008763322-2 |
    Y le da clic en el boton filtar
    Y selecciona el icono de ver detalle
    Y ingresa un NIT existente en el campo de filtro del modal y da clic en el boton filtrar
      | NIT   |
      | <nit> |
    Entonces el sistema muestra la empresa con el NIT ingresado asociado
    Ejemplos:
      | nit         |
      | 900876543-2 |

  @CP587788
  Esquema del escenario: Verificar el boton limpiar
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT    |
      | <nit1> |
    Y El usuario selecciona el boton limpiar ge
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT    |
      | <nit2> |
    Y le da clic en el boton filtar
    Y selecciona el icono de ver detalle
    Y ingresa un NIT existente en el campo de filtro del modal y da clic en el boton filtrar
      | NIT    |
      | <nit2> |
    Y El usuario selecciona el boton limpiar del Modal
    Entonces el sistema limpia los campos de filtro
    Ejemplos:
      | nit1         | nit2         |
      | 9008763322-2 | 9008763322-2 |

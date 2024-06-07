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

  @CP587744 @CP16664
  Esquema del escenario: Verificar mensaje al intentar inactivar registro con empresa asociada
    Y El usuario diligencia el campo de filtro con un NIT existente y que tenga asociado una empresa
      | NIT   |
      | <nit> |
    Y le da clic en el boton filtar
    Y selecciona el icono de desactivar en el apartado de acciones
    Entonces el sistema debe mostrar el mensaje respectivo <mjsError>

    Ejemplos:
      | nit                      | mjsError                                                       |
      | nit con empresa asociada | No se puede inactivar debido a que existen Empresas asociadas. |


  @CP583988
  Escenario: Verificar mensaje de error al intentar modificar el estado de un grupo empresarial con empresa asociada
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 830037843-3 |
    Y le da clic en el boton filtar
    Y el usuario da clic en cambiar estado
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Empresas asociadas.


  @CP6038
  Esquema del escenario: Validar filtro de modal
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT          |
      | 9008763322-2 |
    Y le da clic en el boton filtar
    Dado selecciona el icono de ver detalle
    E ingresa un NIT existente en el campo de filtro del modal y da clic en el boton filtrar
      | NIT   |
      | <nit> |
    Entonces verifica que el nit ingresado este listado <nit>
    Y le da clic en el boton limpiar nodal
    Entonces valida que se hayan limpiado los campos
    Ejemplos:
      | nit      |
      | 519941-7 |

  @CP8926
  Escenario: Validar el no poder editar NIT (Manual)
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT          |
      | 9008763322-2 |
    Y le da clic en el boton filtar
    Dado selecciona el icono de editar en el apartado de acciones ge
    Entonces verifica que el nit no se pueda editar

  @CP16665
  Escenario: Validar botón "No" de la ventana de confirmación para el cambio de estado de un registro
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT          |
      | 9008763322-2 |
    Y le da clic en el boton filtar
    Y selecciona el icono de desactivar en el apartado de acciones
    Entonces valida que siga en el filtro de crear grupo empresarial

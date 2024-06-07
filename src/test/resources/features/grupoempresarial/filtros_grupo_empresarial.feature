# language: es

@HU2
Característica: Validar que se pueda filtrar para realizar la busqueda de una empresa
  COMO administrador
  QUIERO poder filtrar una busqueda de empresa
  PARA poder editar la empresa

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial


  @CP5832
  Escenario: Verificar boton Filtrar
    Y el usuario da clic en el boton filtar grupo empresarial
    Entonces el sistema mostrara todas los grupos empresariales creados enlistados en una tabla con su respectiva informacion


  @CP5834
  Esquema del escenario: Verificar mensaje al accionar el botón Filtrar y no tener registros de grupo empresariales
    Y el usuario ingresa datos en los campos de filtro
      | NIT   | razonSocialONombre   |
      | <NIT> | <razonSocialONombre> |
    Y el usuario da clic en el boton filtar grupo empresarial
    Entonces v2 valida que exista la barra de alerta con el mensaje No se encontraron resultados que coincidan con los criterios de búsqueda
    Ejemplos:
      | Descripción                                   | NIT      | razonSocialONombre |
      | ingresando un dato de NIT inexistente         | invalido |                    |
      | ingresando un datoo de Nombre inexistente     |          | invalido           |
      | ingresando datos de NIT y Nombre inexistentes | invalido | invalido           |

  @CP4707
  Esquema del escenario: Verificar que se pueda filtrar por NIT
    Y el usuario ingresa datos en los campos de filtro
      | NIT   | razonSocialONombre   |
      | <NIT> | <razonSocialONombre> |
    Y el usuario da clic en el boton filtar grupo empresarial
    Y el usuario ingresa datos en los campos de filtro
      | NIT   | razonSocialONombre   |
      | <NIT> | <razonSocialONombre> |

    Ejemplos:
      | NIT         | razonSocialONombre |
      | 156328974-5 |                    |

  @CP4708
  Esquema del escenario: Verificar que se pueda filtrar por Nombre del grupo empresarial
    Y El usuario diligencia el campo de filtro con el Nombre de grupo empresarial existente
      | razonSocialONombre   |
      | <razonSocialONombre> |
    Y el usuario da clic en el boton filtar grupo empresarial
    Entonces el sistema valida el nombre ingresado y muestra los grupos empresariales con ese nombre asociado

    Ejemplos:
      | razonSocialONombre |
      | MATRIX             |


  @CP4706
  Esquema del escenario: Verificar que se pueda filtrar ingresando el NIT y Nombre
    Y el usuario diligencia los campos de filtro
      | NIT   | razonSocialONombre   |
      | <NIT> | <razonSocialONombre> |
    Y el usuario da clic en el boton filtar grupo empresarial
    Entonces el sistema valida los datos ingresados y muestra el grupo empresarial con esos datos asociados
      | NIT   |
      | <NIT> |
    Ejemplos:
      | NIT         | razonSocialONombre      |
      | 283278505-9 | MoonLight Solutions fb3 |

  @CP5833
  Esquema del escenario: Verificar boton limpiar
    Y el usuario diligencia los campos de filtro
      | NIT   | razonSocialONombre   |
      | <NIT> | <razonSocialONombre> |
    Y El usuario selecciona el boton limpiar ge
    Entonces el sistema limpia todos los campos diligenciados grupo empresarial

    Ejemplos:
      | Descripción                 | NIT  | razonSocialONombre |
      | Limpiar campos NIT y Nombre | 1256 | GELSA              |
      | Limpiar campo NIT           | 1256 |                    |
      | Limpiar campo Nombre        |      | juggg              |

  @CP11732
  Escenario: Validar que los registro enlistados en la tabla de registro, se ordenen de manera ascendente conforme a su fecha de creación
    Dado Caso manual


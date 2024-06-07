# language: es

@HU3
Característica: Validar filtro de busqueda de gestión distribuidor
  COMO administrador
  QUIERO poder filtrar una busqueda por NIT o Nombre
  PARA poder ver los detalles del registro asociado

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GestiónDistribuidor


  @CP6870
  Escenario: Verificar que se enlisten todos los distribuidores creados al accionar el botón Consultar
    Y el usuario da clic en el boton Consultar gestion distribuidor

    Entonces el sistema muestra todos los distribuidores creados enlistados en una tabla con su respectiva informacion

  @CP7007
  Esquema del escenario: Verificar mensaje al accionar el botón Filtrar y no tener registros de distribuidores
    Y el ususario ingresa datos no existentes en los campos de filtro
      | NIT   | nombre   |
      | <NIT> | <nombre> |
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Y valida que exista la barra de alerta con el mensaje No se encontraron resultados que coincidan con los criterios de búsqueda
    Ejemplos:
      | Descripción                      | NIT         | nombre   |
      | ingresando un NIT inexistente    | 986945236-1 |          |
      | ingresando un Nombre inexistente |             | llllllll |
      | ingresando ambos campos          | 584478541-9 | gels     |


  @CP6889
  Esquema del escenario: Verificar que se pueda filtrar por NIT de Distribuidor
    Y El usuario diligencia el campo de filtro con un NIT existente
      | NIT   |
      | <NIT> |
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Entonces el sistema muestra en filtros gestion distribuidor el campo NIT con <NIT>
    Ejemplos:
      | NIT         |
      | 900624957-6 |


  @CP6912
  Esquema del escenario: Verificar que se pueda filtrar por Nombre de Distribuidor
    Y El usuario diligencia el campo de filtro con un Nombre de distribuidor existente
      | nombre   |
      | <nombre> |
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Entonces el sistema muestra en filtros gestion distribuidor el campo NOMBRE DISTRIBUIDOR con <nombre>
    Ejemplos:
      | nombre         |
      | Sun City S A S |


  @CP6931
  Esquema del escenario: Verificar que se pueda filtrar ingresando el NIT y Nombre
    Y el ususario diliegncia los campos de filtro
      | NIT   | nombre   |
      | <NIT> | <nombre> |
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Entonces el sistema muestra en filtros gestion distribuidor el campo NIT con <NIT>
    Entonces el sistema muestra en filtros gestion distribuidor el campo NOMBRE DISTRIBUIDOR con <nombre>
    Ejemplos:
      | NIT           | nombre               |
      | 56232841559-4 | Rifa El Pueblo S A S |


  @CP7005
  Esquema del escenario: Verificar boton limpiar
    Y el ususario diliegncia los campos de filtro
      | NIT   | nombre   |
      | <NIT> | <nombre> |
    Y El usuario selecciona el boton limpiar
    Entonces el sistema limpia todos los campos diligenciados
    Ejemplos:
      | NIT   | nombre         |
      | 12    | Prueba Empresa |
      | 11601 | GO             |

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
    Cuando ingresa a la ruta Administración_Multinivel_GestiónEmpresas

  @CP5819
  Escenario: Validar Botón Consultar
    Y el usuario da clic en el boton consultar
    Entonces el sistema muestra una tabla con las empresas registradas
      | NIT | NOMBRE EMPRESA | PAÍS | DIRECCIÓN | MONEDA | TIPOS DE PAGO | COMERCIALIZADOR | DISTRIBUIDOR | ACCIONES |
      | NIT | NOMBRE EMPRESA | PAÍS | DIRECCIÓN | MONEDA | TIPOS DE PAGO | COMERCIALIZADOR | DISTRIBUIDOR | ACCIONES |

  @CP5821
  Esquema del escenario: Validar consulta con registro no existente
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT   | nombreOCodigo   | pais   | comercializador   | distribuidor   |
      | <NIT> | <nombreOCodigo> | <pais> | <comercializador> | <distribuidor> |
    Y el usuario da clic en el boton consultar
    Entonces el sistema muestra el mensaje No se encontraron resultados que coincidan con los criterios de búsqueda
    Ejemplos:
      | Descripción                                   | NIT         | nombreOCodigo | pais      | comercializador | distribuidor |
      | Al filtrar con un dato de NIT no existente    | 107896329-1 |               | ARGENTINA | SI              | NO           |
      | Al filtrar con un dato de Nombre no existente |             | GELSASS       | COLOMBIA  | NO              | SI           |

  @CP5798
  Esquema del escenario: Verificar que se pueda filtrar por NIT
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT   |
      | <NIT> |
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida el NIT ingresado y muestra la empresa con ese NIT asociado
      | NIT   |
      | <NIT> |
    Ejemplos:
      | NIT          |
      | 9016199974-8 |

  @CP5799
  Esquema del escenario: Verificar que se pueda filtrar por Nombre de la Empresa
    Y el usuario diligencia los campos del formulario para filtrar
      | nombreOCodigo   |
      | <nombreOCodigo> |
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida el nombre ingresado y muestra las empresas con ese nombre asociado
      | nombreOCodigo   |
      | <nombreOCodigo> |
    Ejemplos:
      | nombreOCodigo          |
      | Bingos Antioquia S A S |

  @CP5800
  Esquema del escenario: Verificar que se pueda filtrar por el Pais
    Y el usuario diligencia los campos del formulario para filtrar
      | pais   |
      | <pais> |
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida el pais seleccionado y muestra las empresas con ese pais asociado
      | pais   |
      | <pais> |
    Ejemplos:
      | pais  |
      | RUSIA |

  @CP5801
  Escenario: Verificar que se pueda filtrar por la opcion comercializador
    Y El usuario selecciona la opcion Si de la lista
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida la opcion seleccionada y muestra las empresas que aplican como comercializador

  @CP5803
  Escenario: Verificar que se pueda filtrar por la opcion No del campo comercializador
    Y El usuario selecciona la opcion No de las lista
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida la opcion seleccionada y muestra las empresas que no aplican como comercializador

  @CP5816
  Escenario: Verificar que se pueda filtrar por la opcion Si del campo Distribuidor
    Y El usuario selecciona la opcion Si
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida la opcion seleccionada y muestra las empresas que aplican como Distribuidor

  @CP5817
  Escenario: Verificar que se pueda filtrar por la opcion No del campo Distribuidor
    Y El usuario selecciona la opcion No
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida la opcion seleccionada y muestra las empresas que no aplican como Distribuidor

  @CP582155
  Esquema del escenario: Verificar que se permita realizar una busqueda de empresa combinando los diferentes campos de filtro
    Y el usuario diligencia los campos del formulario para filtrar
      | NIT   | nombreOCodigo   | pais   | comercializador   | distribuidor   |
      | <NIT> | <nombreOCodigo> | <pais> | <comercializador> | <distribuidor> |
    Y el usuario da clic en el boton consultar
    Entonces el sistema valida los datos ingresados y muestra la empresa con esos datos asociados
      | NIT   | nombreOCodigo   | pais   |
      | <NIT> | <nombreOCodigo> | <pais> |
    Ejemplos:
      | Descripción                 | NIT          | nombreOCodigo                  | pais     | comercializador | distribuidor |
      | Al filtrar con varios datos | 253698126-1  | EmpresaCundinamarca            | COLOMBIA | NO              | SI           |
      | Al filtrar con varios datos | 5557555555-8 | Gildardo Echeverri F Y Cia S A | COLOMBIA | SI              | NO           |

  @CP5820
  Esquema del escenario: Verificar boton limpiar
    Y El usuario diligencia los campos de filtro de Gestión Empresa
      | NIT   | nombreOCodigo   | pais   | comercializador   | distribuidor   |
      | <NIT> | <nombreOCodigo> | <pais> | <comercializador> | <distribuidor> |
    Y El usuario selecciona el boton limpiar
    Entonces el sistema limpia todos los campos diligenciados
    Ejemplos:
      | NIT      | nombreOCodigo | pais  | comercializador | distribuidor |
      | 12568569 | kjkd          | RUSIA | NO              | SI           |




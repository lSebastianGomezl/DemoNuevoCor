# language: es

@HU3CREAREMPRESA
Característica: Validar el modulo Crear empresa
  COMO administrador
  QUIERO poder crear una empresa con ciertas características
  PARA poder administrarlas

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GestiónEmpresas
    Y de clic en la opcion Crear Empresa+

  @CP5822
  Escenario: Validar ingreso al formulario
    Entonces el sistema muestra el formulario con el titulo crear empresa

  @CP5824
  Escenario: Validar boton Salir del formulario Crear empresa.
    Y el usuario da clic en el boton Salir en el formulario
    Y da clic en Si
    Entonces el sistema regresa a la pantala de filtro ge

  @CP5984
  Escenario: Validar crear empresa con algunos campos vacíos
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT         | razonSocialONombre | pais  | departamento     | ciudad | direccion | correoElectronico | telefono | dominio            | moneda | tipoDePago |
      | Grupo Quebec     | 556869458-2 |                    | RUSIA | DISTRITO FEDERAL | MOSCU  |           |                   |          | http://www.jsa.com | USD    | CHEQUE     |
    Y el usuario valida el botón guardar deshabilitado

  @CP5826
  Esquema del escenario: Validar mensaje al ingresar datos incorrectos al crear empresa.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial   | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   | moneda   | tipoDePago   |
      | <grupoEmpresarial> | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> | <moneda> | <tipoDePago> |
    Entonces el usuario valida el botón guardar deshabilitado
    Ejemplos:
      | grupoEmpresarial | NIT    | razonSocialONombre | pais  | departamento     | ciudad | direccion       | correoElectronico | telefono        | dominio            | moneda | tipoDePago |
      | Grupo Quebec     | 556811 | APUESTAS           | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 22d #8-56 | apuest            | +(57)3125896358 | http://www.jsa.com | USD    | CHEQUE     |


  @CP5823
  Escenario: Validar la creación de nuevos registros de Empresas
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion         | correoElectronico | telefono        | dominio                   | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | Avenida 88 sur 44 | soldelsur@aso.com | +(57)3005741236 | https://www.soldelsur.com | USD    | EFECTIVO   |
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el usuario valida el mensaje con El registro se guardó con éxito


  @CP858321111
  Esquema del escenario: Validar que se permita crear una empresa sin que aplique como comercializador ni distribuidor
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial   | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   | moneda   | tipoDePago   |
      | <grupoEmpresarial> | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> | <moneda> | <tipoDePago> |
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion        | correoElectronico   | telefono        | dominio                   | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 80d #58-56 | apuestaya@somos.com | +(57)3125896358 | https://WWW.APUESTAYA.COM | USD    | CHEQUE     |

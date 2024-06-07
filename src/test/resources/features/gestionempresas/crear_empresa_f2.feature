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

  @CP8583
  Esquema del escenario: Crear empresa con switch "Aplica como comercializador" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial   | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   | moneda   | tipoDePago   |
      | <grupoEmpresarial> | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> | <moneda> | <tipoDePago> |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion        | correoElectronico     | telefono        | dominio                   | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | carrera 40 #8-56 | apuestapues@somos.com | +(57)3115196358 | https://WWW.APUESTALE.COM | USD    | TARJETA    |

  @CP8584
  Esquema del escenario: Crear empresa con switch "Aplica como distribuidor" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial   | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   | moneda   | tipoDePago   |
      | <grupoEmpresarial> | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> | <moneda> | <tipoDePago> |
    Y activa el switch Aplica como comercializador
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion          | correoElectronico       | telefono        | dominio                    | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | cARRERA 70A #89-56 | suchancesito@chance.com | +(57)3225896358 | https://www.chancesito.com | EUR    | CHEQUE     |

  @CP8585
  Esquema del escenario: Verificar que se permita crear una empresa aplicando como comercializador y distribuidor
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial   | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   | moneda   | tipoDePago   |
      | <grupoEmpresarial> | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> | <moneda> | <tipoDePago> |
    Y activa el switch Aplica como distribuidor
    Y activa el switch Aplica como comercializador
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |


  @CP11735
  Escenario: Validar que solo de enlisten los registros activos en la lista desplegable de "Grupo empresarial"
    Entonces ingresa a la ruta multinivel - Gestion Empresarial
    Y el usuario da clic en el boton filtar grupo empresarial
    Entonces el sistema almacena las empresas buscadas
    Y el usuario ingresa a la ruta Multinivel Gestion Empresa
    Y de clic en la opcion Crear Empresa+
    Entonces el usuario da clic en Select Grupo Empresarial
    Y el sistema muestra las empresas activas en Gestion Empresas

  @CP11729
  Escenario: Validar que el registro de empresa marcada como comercializador se muestre correctamente en el módulo de comercializadores.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais  | departamento     | ciudad | direccion       | correoElectronico         | telefono        | dominio                         | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 23 #13-55 | apuestasrapidas@gmail.com | +(57)3115648963 | https://www.apuestasrapidas.com | USD    | EFECTIVO   |
    Y activa el switch Aplica como comercializador
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Y el usuario ingresa a la ruta Multinivel Gestion Comercializador
    Y diligencia el filtro NIT
      | inputNit |
      | guardado |
    Y el usuario da click en el boton Filtrar
    Entonces el sistema trae el el registro que coincida guardado


  @CP11730
  Escenario: Validar que el registro de empresa marcada como distribuidor se muestre correctamente en el módulo de Distribuidores.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT          | razonSocialONombre   | pais  | departamento     | ciudad | direccion       | correoElectronico       | telefono          | dominio                      | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 89 #13-55 | apuestamagjon@gmail.com | +(57)3125648963 | https://www.apuestasacto.com | USD    | EFECTIVO   |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Y el usuario ingresa a la ruta Multinivel Gestion Distribuidores
    Y El usuario diligencia el campo de filtro con un NIT existente
      | NIT          |
      | guardado |
    Y el usuario da clic en el boton Consultar gestion distribuidor
    Entonces el sistema trae el el registro distribuidor que coincida guardado



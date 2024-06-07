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


  @CP16648
  Escenario: Validar que solo se enlisten los registros activos en los campos desplegados
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Y el usuario da clic en parametrización Costa de Marfil
    Y el usuario da clic en el boton Consultar Jerarquias
    Entonces el sistema guarda las regiones buscadas
    Y el usuario ingresa a la ruta Multinivel Gestion Empresa
    Y de clic en la opcion Crear Empresa+
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT         | razonSocialONombre       | pais            | departamento | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | 996878730-4 | APUESTAS Y SUERTE UNIDAS | COSTA DE MARFIL | BAFING       | DALOA  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |
    Entonces el usuario da clic en Select Departamento Gestion Empresas
    Y el sistema muestra las regiones activas en Gestion Comercializador

  @CP23365
  Escenario: Crear empresa con switch "Responsable de IVA" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion             | correoElectronico     | telefono      | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | distrito comercial 23 | correo@pruebaauto.com | +(57)31245687 | https://pruebaauto.com | USD    | CHEQUE     |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y activa el switch Responsable de IVA
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP23366
  Escenario: Crear empresa con switch "Obligado a facturar" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion             | correoElectronico     | telefono      | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | distrito comercial 23 | correo@pruebaauto.com | +(57)31245687 | https://pruebaauto.com | USD    | CHEQUE     |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y activa el switch Obligado a facturar
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP23367
  Escenario: Crear empresa con switch "Regimen Simple" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion             | correoElectronico     | telefono      | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | distrito comercial 23 | correo@pruebaauto.com | +(57)31245687 | https://pruebaauto.com | USD    | CHEQUE     |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y activa el switch Regimen Simple
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP23368
  Escenario: empresa con switch "Entidad del estado" Activado.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion             | correoElectronico     | telefono      | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | distrito comercial 23 | correo@pruebaauto.com | +(57)31245687 | https://pruebaauto.com | USD    | CHEQUE     |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y activa el switch Entidad del estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP23369
  Escenario: Crear empresa con todos los switch Activado y el campo fecha rut y asignar usuario.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion             | correoElectronico     | telefono      | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | distrito comercial 23 | correo@pruebaauto.com | +(57)31245687 | https://pruebaauto.com | USD    | CHEQUE     |
    Y el usuario ingresa los datos para asignar en crear empresa
      | fecha      | tipoDocumento        | documento  |
      | 12/05/2024 | Cédula de ciudadanía | 1003952901 |
    Y activa el switch Aplica como distribuidor
    Y activa switch Estado
    Y activa el switch Responsable de IVA
    Y activa el switch Aplica como comercializador
    Y activa el switch Obligado a facturar
    Y activa el switch Regimen Simple
    Y activa el switch Entidad del estado
    Y activa switch Estado de asignar
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito





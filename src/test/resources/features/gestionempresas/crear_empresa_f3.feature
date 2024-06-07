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


  @CP8773
  Escenario: Validar ingreso de Caracteres
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT                       | razonSocialONombre                                                                                   | pais  | departamento     | ciudad | direccion                                                                                               | correoElectronico                                            | telefono                                                     | dominio                | moneda | tipoDePago |
      | Grupo Quebec     | 1234567890123456789123456 | 1234567890123456789123456123456789012345678912345612345678901234567891234561234567890123456789123456 | RUSIA | DISTRITO FEDERAL | MOSCU  | 1234567890123456789123456123456789012345678912345612345678901234567891234561234567890123456789123456123 | 123456789012345678912344567891234561234567890123456789123456 | 123456789012345678912344567891234561234567890123456789123456 | www.apsuerteunidas.com | USD    | EFECTIVO   |
    Entonces el usuario valida las caracteristicas de los campos gestion empresa


  @CP10157
  Escenario: Validar mensaje al intentar crear un registro con un NIT ya existente en el sistema
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT         | razonSocialONombre | pais  | departamento     | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | 996878730-4 | aleatorio          | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo Este NIT ya se encuentra creado para otra Empresa

  @CP14061
  Escenario: Validar mensaje al intentar crear un registro con una Razón social ya existente en el sistema
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre       | pais  | departamento     | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | APUESTAS Y SUERTE UNIDAS | RUSIA | DISTRITO FEDERAL | MOSCU  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |
    Y activa switch Estado
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo Esta Razón Social ya se encuentra creada para otra Empresa


  @CP14074
  Escenario: Validar que se permita asignar un Usuario y un Rol en el proceso de creación de la Empresa.
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT       | razonSocialONombre | pais            | departamento | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | aleatorio | aleatorio          | COSTA DE MARFIL | BAFING       | DALOA  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |
    Y activa switch Estado
    Y activa el switch Aplica como distribuidor
    Y el usuario ingresa los datos para asignar en crear empresa
      | tipoDocumento        | documento  |
      | Cédula de ciudadanía | 1003952901 |
    Y activa switch Estado de asignar
    Y le da click al boton Crear empresa
    Y da click en Si
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito

  @CP16646
  Escenario: Validar que solo se enlisten los países activos en el menú despegable "País"
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Entonces el sistema guarda los paises buscados
    Y el usuario ingresa a la ruta Multinivel Gestion Empresa
    Y de clic en la opcion Crear Empresa+
    Entonces el usuario da clic en select pais gestion empresas
    Y el sistema muestra los paises activos en Gestion Comercializador


  @CP16647
  Esquema del escenario: Validar despliegue automático de la división política configurada al seleccionar el país
    Y el usuario ingresa los datos para crear empresa
      | grupoEmpresarial | NIT         | razonSocialONombre       | pais   | departamento     | ciudad | direccion       | correoElectronico               | telefono       | dominio                        | moneda | tipoDePago |
      | Grupo Quebec     | 996878730-4 | APUESTAS Y SUERTE UNIDAS | <pais> | DISTRITO FEDERAL | MOSCU  | calle 87 #13-55 | apuesta_suerte_unidas@gmail.com | +(57)564896358 | https://www.apsuerteunidas.com | USD    | EFECTIVO   |
    Y el usuario valida los campos desplegados gestion empresas de <pais>
    Ejemplos:
      | Descripción | pais  |
      | Paises      | RUSIA |

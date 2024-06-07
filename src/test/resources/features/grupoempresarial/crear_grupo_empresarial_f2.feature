# language: es

@HU3CREAREMPRESA
Característica: Validar formulario crear grupo empresarial
  COMO administrador
  QUIERO poder crear un grupo empresarial con ciertas características
  PARA poder administrarlas

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial
    Y de clic en la opcion Crear Grupo Empresarial+

  @CP14059
  Esquema del escenario: Mensaje de error creando un registro con razon social existente
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y activa el switch Estado
    Y le da click al boton Crear grupo empresarial
    Y el usuario da clic en Si en la ventana de confirmación
    Entonces el sistema muestra un mensaje de error indicando que el NIT ya existe <msjError>

    Ejemplos:
      | NIT    | razonSocialONombre | pais  | departamento     | ciudad | direccion                                     | correoElectronico | telefono | dominio | msjError                                                             |
      | valido | existente          | RUSIA | DISTRITO FEDERAL | MOSCU  | Av. Calle 26 No. 69D – 91 Torre 2 Oficina 905 | valido            | valido   |         | Esta Razón Social ya se encuentra creada para otro Grupo Empresarial |

  @CP16567
  Escenario: Validar que solo se enlisten los países activos en el menú despegable "País"
    Dado el usuario da clic en gestion comercial
    Y el usuario da clic en gestion politica
    Y el usuario da clic en consultar gestion politica
    Cuando el usuario guarda los paises activos
    Pero regresa grupo empresarial
    Y de clic en la opcion Crear Grupo Empresarial+
    Y el usuario da clic en el select de pais grupo empresarial
    Entonces valida que los paises listados sean los guardados de gestion politica

  @CP16663
  Esquema del escenario: Validar botón "No" de la ventana de confirmación para la creación de un grupo empresarial
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y activa el switch Estado
    Y le da click al boton Crear grupo empresarial
    Y el usuario da click en no de la ventana de confirmacion
    Entonces valida que siga en el formulario de crear grupo empresarial

    Ejemplos:
      | NIT    | razonSocialONombre | pais  | departamento     | ciudad | direccion                                     | correoElectronico | telefono | dominio | msjDeExito                                                             |
      | valido | Juego seguro       | RUSIA | DISTRITO FEDERAL | MOSCU  | Av. Calle 26 No. 69D – 91 Torre 2 Oficina 905 | valido            | valido   | valido  | Se ha creado exitosamente el registro con el código 199 - Juego seguro |

  @CP16976 @CP16977
  Esquema del escenario: Verificar que se permita crear un Grupo empresarial al completar todo los datos requeridos
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y activa el switch Estado
    Y el usuario da click en salir
    Entonces el usuario valida en la ventana de confirmación <mensaje>
    Y Valida que los botenes si y no estén presentes
    Y el usuario da click en no de la ventana de confirmacion
    Y valida que siga en el formulario de crear grupo empresarial
    Ejemplos:
      | NIT    | razonSocialONombre | pais  | departamento     | ciudad | direccion                                     | correoElectronico | telefono | dominio | mensaje                                                   |
      | valido | valido             | RUSIA | DISTRITO FEDERAL | MOSCU  | Av. Calle 26 No. 69D – 91 Torre 2 Oficina 905 | valido            | valido   | valido  | ¿Está seguro de que desea volver sin guardar los cambios? |

  @CP16568
  Esquema del escenario: Validar despliegue automático de la división política configurada al seleccionar el país
    Y el usuario diligencia el formulario de grupo empresarial
      | NIT   | razonSocialONombre   | pais   | departamento   | ciudad   | direccion   | correoElectronico   | telefono   | dominio   |
      | <NIT> | <razonSocialONombre> | <pais> | <departamento> | <ciudad> | <direccion> | <correoElectronico> | <telefono> | <dominio> |
    Y el usuario valida los campos desplegados de <pais>
    Ejemplos:
      | NIT | razonSocialONombre | pais           | departamento | ciudad | direccion | correoElectronico | telefono | dominio |
      |     |                    | COLOMBIA       |              |        |           |                   |          |         |
      |     |                    | ARGENTINA      |              |        |           |                   |          |         |
      |     |                    | ESTADOS UNIDOS |              |        |           |                   |          |         |


  @CP16578
  Escenario: Validar que solo se enlisten los registros activos en los campos desplegados
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Y el usuario da clic en parametrización Colombia
    Y el usuario da clic en el boton Consultar Jerarquias
    Entonces el sistema guarda las regiones buscadas
    Y el usuario ingresa a la ruta Multinivel Grupo empresarial
    Y de clic en la opcion Crear Grupo Empresarial+
    Y el usuario diligencia el formulario de grupo empresarial
      | pais     |
      | COLOMBIA |
    Entonces el usuario da clic en Select de Región Grupo empresarial
    Y el sistema muestra las regiones activas en Gestion Comercializador

    #Este mensaje deberá estar como cambio del 23/05/2024
#Autor:johana.giraldo@konexinnovation.com.co
  #language: es

@HUFILTROCOMERCIALIZADOR
Característica: Verificar que como administrador pueda filtrar los comercializadores creados
  COMO administrador
  QUIERO poder filtrar los comercializadores creados.
  PARA buscar un registro que necesite

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_Gestion Comercializador

  @CP5764
  Escenario: Validar la funcionalidad del botón filtrar.
    Y el usuario da click en el boton Filtrar
    Entonces el sistema muestra una tabla con las comercializadoras
      | tdAsociadoA          | tdNIT | tdCodigo               | tdPais | tdDireccion | tdDominio | tdEstado | tdAcciones |
      | ASOCIADO A (EMPRESA) | NIT   | NOMBRE COMERCIALIZADOR | PAÍS   | DIRECCIÓN   | DOMINIO   | ESTADO   | ACCIONES   |

  @CP5766
  Escenario: Validar filtrar por NIT registrado.
    Y diligencia el filtro NIT
      | inputNit     |
      | 9011821576-7 |
    Y el usuario da click en el boton Filtrar
    Entonces el sistema trae el el registro que coincida 9011821576-7

  @CP5768
  Escenario: Validar filtrar por nombre empresa existente.
    Y diligencia el filtro nombre comercializador
      | inputNombreComercializador |
      | Tokio Games S A S          |
    Y el usuario da click en el boton Filtrar
    Entonces el sistema muestra el el registro que coincida con el nombre Tokio Games S A S

  @CP5769
  Escenario:Validar combinación de filtros.
    Y diligencia el filtro NIT
      | inputNit     |
      | 9011821576-7 |
    Y diligencia el filtro nombre comercializador
      | inputNombreComercializador       |
      | Rifas Orito S A S En Liquidacion |
    Y el usuario da click en el boton Filtrar
    Entonces el sistema trae los registros que coincidan con lo buscado en 9011821576-7 y Rifas Orito S A S En Liquidacion

  @CP5767
  Esquema del escenario:Validar filtrar por NIT o Nombre empresa no registrado.
    Y diligencia el filtro NIT
      | inputNit   |
      | <inputNit> |
    Y diligencia el filtro nombre comercializador
      | inputNombreComercializador   |
      | <inputNombreComercializador> |
    Y el usuario da click en el boton Filtrar
    Entonces el sistema muestra mensaje erroneo
      | msjError   |
      | <msjError> |
    Ejemplos:
      | Descripcion                            | inputNit    | inputNombreComercializador | msjError                                                                 |
      | NIT no existente                       | 101000000-1 |                            | No se encontraron resultados que coincidan con los criterios de búsqueda |
      | Nombre no existente                    |             | SASSS                      | No se encontraron resultados que coincidan con los criterios de búsqueda |
      | NIT existente y nombre no existente    | 856974253-4 | GELSA                      | No se encontraron resultados que coincidan con los criterios de búsqueda |
      | NIT no existente y nombre existente    | 101000000-1 | LOTERIA ROJA               | No se encontraron resultados que coincidan con los criterios de búsqueda |
      | NIT no existente y nombre no existente | 118963100-1 | SASJJ                      | No se encontraron resultados que coincidan con los criterios de búsqueda |

  @CP5765
  Escenario:Validar la funcionalidad del botón Limpiar.
    Y diligencia el filtro NIT
      | inputNit |
      | 655      |
    Y diligencia el filtro nombre comercializador
      | inputNombreComercializador |
      | GELSA                      |
    Entonces el usuario da clic en el botón Limpiar

#Autor:johana.giraldo@konexinnovation.com.co
  #language: es

@HUCREARCOMERCIALIZADOR
Característica: Verificar que como administrador pueda ingresar al formulario de crear comercializador
  COMO administrador
  QUIERO poder visualizar el formulario  de gestionar comercializador.
  PARA crear un comercializador

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_Gestion Comercializador
    Y el usuario da clic en el botón Crear Comercializador+


  @CP14062
  Esquema del escenario: Validar mensaje al intentar crear un registro con una Razón social ya existente en el sistema
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema debe mostrar el mensaje respectivo Esta Razón Social ya se encuentra creada para otro Comercializador
    Ejemplos:
      | asociaraempresa | NIT         | razonsocialoEmpresa | pais     | region | departamento | ciudad | direccion        | correoelectronico         | telefono        | dominio                        |
      | GO              | 458697789-4 | Tokio Games S A S   | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Calle 80 # 55-33 | aguachica_comer@gmail.com | +(57)3218481402 | http://www.comer_aguachica.com |

  @CP5781
  Esquema del escenario: Validar caracteristicas campos formulario crear comercializador
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Entonces el usuario valida las caracteristicas de los campos
    Ejemplos:
      | asociaraempresa | NIT                       | razonsocialoEmpresa                                                | pais     | region | departamento | ciudad | direccion                                                | correoelectronico                                                  | telefono                 | dominio                                                                                                                                                                                                                                                                                                                                                         |
      | GO              | 45855839-4                | Inversiones Luna Col                                               | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Calle 77 # 55-33                                         | inverlunacol@gmail.com                                             | +(57)3138581502          | http://www.comercializadoralunacol.com                                                                                                                                                                                                                                                                                                                          |
      | GO              | 12345678910111213141516-7 | Prueba automatizada para el campo razón social para validar alerta | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Prueba automatizada para el campo dirección para validar | validando50caracteresenestecampoparalapruebaautomatizada@gmail.com | +(57)3045386489111265478 | http://Prueba automatizada para el campo dirección para validar las alertas Prueba automatizada para el campo dirección para validar las alertas Prueba automatizada para el campo dirección para validar las alertas Prueba automatizada para el campo dirección para validar las alertas Prueba automatizada para el campo dirección para validar las alertas |

  @CP16649
  Escenario: Validar que solo se enlisten los países activos en el menú despegable "País"
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Entonces el sistema guarda los paises buscados
    Y el usuario ingresa a la ruta Multinivel Gestion Comercializador
    Y el usuario da clic en el botón Crear Comercializador+
    Entonces el usuario da clic en Select de País
    Y el sistema muestra los paises activos en Gestion Comercializador

  @CP16650
  Esquema del escenario: Validar despliegue automático de la división política configurada al seleccionar el país
    Y diligencie los campos del formulario
      | pais   |
      | <pais> |
    Y el usuario valida los campos desplegados de <pais>
    Ejemplos:
      | Descripción                | pais           |
      | Paises con campos variados | COLOMBIA       |
      | Paises con campos variados | ARGENTINA      |
      | Paises con campos variados | ESTADOS UNIDOS |

  @CP16651
  Escenario: Validar que solo se enlisten los registros activos en los campos desplegados
    Entonces ingresa a la ruta Gestion Comercial - Gestion Politica
    Dado el usuario da clic en el boton Consultar Gestion Politica
    Y el usuario da clic en parametrización Colombia
    Y el usuario da clic en el boton Consultar Jerarquias
    Entonces el sistema guarda las regiones buscadas
    Y el usuario ingresa a la ruta Multinivel Gestion Comercializador
    Y el usuario da clic en el botón Crear Comercializador+
    Y diligencie los campos del formulario
      | pais     |
      | COLOMBIA |
    Entonces el usuario da clic en Select de Región
    Y el sistema muestra las regiones activas en Gestion Comercializador


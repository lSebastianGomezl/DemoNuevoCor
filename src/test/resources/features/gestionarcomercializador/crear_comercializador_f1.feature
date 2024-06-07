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

  @CP5763
  Escenario:Validar elementos del formulario de Gestión Comercializador.
    Entonces el sistema muestra el formulario de Gestión Comercializador
    Y el sistema muestra el botón Guardar
    Y el sistema muestra el botón Salir

  @CP5762
  Esquema del escenario: Validar el flujo básico al crear un comercializador.
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | asociaraempresa      | NIT       | razonsocialoEmpresa | pais     | region | departamento | ciudad | direccion       | correoelectronico       | telefono       | dominio                   |
      | AgileSphere Tech yq3 | aleatorio | aleatorio           | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Cr 71 # 91 - 25 | comermontes@yopmail.com | +(57)612887412 | http://www.comontesas.com |

  @CP5762CANCELARFLUJO
  Escenario: Validar el flujo básico al crear un comercializador.
    Y diligencie los campos del formulario
      | asociaraempresa | NIT          | razonsocialoEmpresa | pais     | region | departamento | ciudad       | direccion          | correoelectronico | telefono        | dominio               |
      | GO              | 9809878730-3 | Prueba              | COLOMBIA | CARIBE | ATLANTICO    | BARRANQUILLA | Carrera 54 # 48-12 | prueba@mail.com   | +(57)3218481402 | http://www.prueba.com |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Cancelar
    Entonces el sistema muestra el titulo del modulo Crear Comercializador

  @CP10160
  Esquema del escenario: Validar mensaje al intentar crear un registro con un NIT ya existente en el sistema
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema debe mostrar el mensaje respectivo Este NIT ya se encuentra creado para otro Comercializador
    Ejemplos:
      | asociaraempresa | NIT         | razonsocialoEmpresa | pais     | region | departamento | ciudad | direccion        | correoelectronico         | telefono        | dominio                        |
      | GO              | 458697529-4 | aleatorio           | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Calle 80 # 55-33 | aguachica_comer@gmail.com | +(57)3218481402 | http://www.comer_aguachica.com |

  @CP16293
  Escenario: Validar ventana de confirmación Crear comercializador
    Y diligencie los campos del formulario
      | asociaraempresa | NIT         | razonsocialoEmpresa | pais     | region | departamento | ciudad       | direccion          | correoelectronico | telefono        | dominio               |
      | GO              | 980987630-3 | Prueba              | COLOMBIA | CARIBE | ATLANTICO    | BARRANQUILLA | Carrera 54 # 48-12 | prueba@mail.com   | +(57)3218481402 | http://www.prueba.com |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el sistema muestra la ventana de confirmacion de crear comercializador
    Y el sistema muestra el botón Aceptar
    Y el sistema muestra el botón Cancelar

  @CP16294
  Esquema del escenario: Validar ventana de confirmación Crear comercializador Confirmar "Si"
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el sistema muestra la ventana de confirmacion de crear comercializador
    Y el sistema muestra el botón Aceptar
    Y el sistema muestra el botón Cancelar
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema debe mostrar el mensaje respectivo El registro se guardó con éxito
    Ejemplos:
      | asociaraempresa | NIT       | razonsocialoEmpresa | pais     | region | departamento | ciudad | direccion        | correoelectronico      | telefono        | dominio                                |
      | GO              | aleatorio | aleatorio           | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Calle 77 # 55-33 | inverlunacol@gmail.com | +(57)3138581502 | http://www.comercializadoralunacol.com |

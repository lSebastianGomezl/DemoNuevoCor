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


  @CP16295
  Escenario: Validar ventana de confirmación Crear comercializador Confirmar "No"
    Y diligencie los campos del formulario
      | asociaraempresa | NIT         | razonsocialoEmpresa | pais     | region | departamento | ciudad       | direccion          | correoelectronico | telefono        | dominio               |
      | GO              | 980987630-3 | Prueba              | COLOMBIA | CARIBE | ATLANTICO    | BARRANQUILLA | Carrera 54 # 48-12 | prueba@mail.com   | +(57)3218481402 | http://www.prueba.com |
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el sistema muestra la ventana de confirmacion de crear comercializador
    Y el sistema muestra el botón Aceptar
    Y el sistema muestra el botón Cancelar
    Y el usuario da clic en el boton Cancelar
    Entonces el sistema muestra el titulo del modulo Crear Comercializador

  @CP11737
  Escenario: Validar que solo de enlisten los registros activos en la lista desplegable de "Empresa"
    Cuando ingresa a la ruta Multinivel Gestión Empresas
    Dado el usuario da clic en el boton Consultar Gestión Empresas
    Entonces el sistema guarda las empresas buscadas
    Y el usuario ingresa a la ruta Multinivel Gestion Comercializador
    Y el usuario da clic en el botón Crear Comercializador+
    Entonces el usuario da clic en Select de Asociar Empresa
    Y el sistema muestra las empresas activas en Gestion Comercializador

  @CP5779
  Escenario: Validar botón salir al Crear
    Entonces el sistema muestra el formulario de Gestión Comercializador
    Y el usuario da clic en Salir
    Y el usuario da clic en el boton Cancelar
    Entonces el sistema muestra el titulo del modulo Crear Comercializador
    Y el usuario da clic en Salir
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema muestra el titulo del modulo Gestión Comercializador

  @CP7992
  Escenario: botón "Guardar" inhabilitado hasta completar todos los campos requeridos
    Cuando el botón guardar esté inhabilitado
    Y diligencie los campos del formulario
      | asociaraempresa | NIT         | razonsocialoEmpresa | pais     | region | departamento | ciudad       | direccion          | correoelectronico | telefono        | dominio               |
      | GO              | 980987630-3 | Prueba              | COLOMBIA | CARIBE | ATLANTICO    | BARRANQUILLA | Carrera 54 # 48-12 | prueba@mail.com   | +(57)3218481402 | http://www.prueba.com |
    Entonces el botón guardar se habilita
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Cancelar

  @CP7993
  Esquema del escenario: Validar mensaje de alerta al ingresar datos erróneos en campos.
    Y diligencie los campos del formulario
      | asociaraempresa   | NIT   | razonsocialoEmpresa   | pais   | region   | departamento   | ciudad   | direccion   | correoelectronico   | telefono   | dominio   |
      | <asociaraempresa> | <NIT> | <razonsocialoEmpresa> | <pais> | <region> | <departamento> | <ciudad> | <direccion> | <correoelectronico> | <telefono> | <dominio> |
    Entonces el usuario valida las alertas de los campos
    Ejemplos:
      | asociaraempresa | NIT        | razonsocialoEmpresa                                                | pais     | region | departamento | ciudad | direccion                                                | correoelectronico      | telefono        | dominio                                |
      | GO              | 45855839-4 | Inversiones Luna Col                                               | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Calle 77 # 55-33                                         | inverlunacol@gmail.com | +(57)3138581502 | http://www.comercializadoralunacol.com |
      | GO              | 123456789  | Prueba automatizada para el campo razón social para validar alerta | COLOMBIA | ANDINA | CUNDINAMARCA | ALBÁN  | Prueba automatizada para el campo dirección para validar | inverlunacolgmail      | 3138581502      | www.comercializadoralunacol.com        |


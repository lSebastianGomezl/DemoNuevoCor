#Autor:sebastian.zapata@konexinnovation.com.co
  #language: es

Característica: Verificar que como administrador realizar acciones en gestión comercializador
  COMO administrador
  QUIERO poder realizar acciones los comercializadores creados.
  PARA validar su funcionalidad

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_Gestion Comercializador

  @CP16987
  Escenario: Validar ventana de confirmación al seleccionar el icono de activar/inactivar
    Y diligencia el filtro NIT
      | inputNit     |
      | 9011821576-7 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el sistema muestra la ventana de confirmacion de activar

  @CP5773ACTIVARBTNSI
  Escenario:Validar la funcionalidad del icono para activar comercializador.
    Y diligencia el filtro NIT
      | inputNit     |
      | 5545555555-8 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el usuario da clic en Si cambiar estado
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito

  @CP5773ACTIVARBTNNO
  Escenario:Validar la funcionalidad del icono para no activar comercializador.
    Y diligencia el filtro NIT
      | inputNit    |
      | 589641235-9 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el usuario da clic en No cambiar estado
    Entonces El sistema debe mostrar el contenido del submódulo. Se visualizará el título Gestión Comercializador

  @CP5774INACTIVARBTNSI
  Escenario:Validar la funcionalidad del icono para inactivar comercializador.
    Y diligencia el filtro NIT
      | inputNit    |
      | 900539130-9 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el usuario da clic en Si cambiar estado
    Entonces el sistema debe mostrar el mensaje respectivo El estado se cambió con éxito


  @CP5774INACTIVARBTNNO
  Escenario:Validar la funcionalidad del icono para inactivar comercializador.
    Y diligencia el filtro NIT
      | inputNit    |
      | 900539130-9 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el usuario da clic en No cambiar estado
    Entonces El sistema debe mostrar el contenido del submódulo. Se visualizará el título Gestión Comercializador

  @CP5775EDITARBTNSI
  Escenario:Validar icono de editar un registro.
    Y diligencia el filtro NIT
      | inputNit    |
      | 900424768-2 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en editar
    Y el usuario modifca datos del registro
      | direccion          | correoelectronico                  | telefono        | dominio                         |
      | CARRERA 12 # 97 44 | contacto.empresa@gisanpedro.com.co | +(57)6013904441 | https://www.informacolombia.com |
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Aceptar
    Entonces el sistema debe mostrar el mensaje respectivo El registro se actualizó con éxito

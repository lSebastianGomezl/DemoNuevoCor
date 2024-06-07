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


  @CP5775EDITARBTNNO
  Escenario:Validar icono no editar un registro.
    Y diligencia el filtro NIT
      | inputNit    |
      | 900424768-2 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en editar
    Y el usuario modifca datos del registro
      | direccion          | correoelectronico                  | telefono        | dominio                                                                                  |
      | CARRERA 12 # 97 44 | contacto.empresa@gisanpedro.com.co | +(57)6013904441 | https://www.informacolombia.com/directorio-empresas/informacion-empresa/gi-san-pedro-sas |
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da clic en el boton Cancelar
    Entonces el sistema muestra el titulo del modulo Editar Comercializador

  @CP5778
  Escenario:Validar la funcionalidad del botón salir de la opción editar.
    Y diligencia el filtro NIT
      | inputNit    |
      | 900424768-2 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en editar
    Y el usuario da clic en Salir
    Y el usuario da clic en Si en la ventana de confirmación
    Entonces el sistema muestra el titulo del modulo Gestión Comercializador
    Entonces el sistema se redirige a la pantalla de filtros y muestra el nit 900424768-2

  @CP5776
  Escenario: Validar el no poder editar NIT
    Y diligencia el filtro NIT
      | inputNit    |
      | 458697529-4 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en editar
    Entonces el sistema no permite editar el campo NIT

  @CP10246
  Escenario: Validar mensaje de error al intentar inactivar un comercializador con distribuidor activo asociado.
    Y diligencia el filtro NIT
      | inputNit     |
      | 9011821576-7 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en cambiar estado
    Y el usuario da clic en Si cambiar estado
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Distribuidores asociados.

  @CP10247
  Escenario: Validar mensaje al intentar inactivar un comercializador con distribuidor asociado a través de la acción editar.
    Y diligencia el filtro NIT
      | inputNit     |
      | 9011821576-7 |
    Y el usuario da click en el boton Filtrar
    Y el usuario da clic en editar
    Y cambia el estado
    Y el usuario da clic en el botón guardar crear comercializadora
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Distribuidores asociados.
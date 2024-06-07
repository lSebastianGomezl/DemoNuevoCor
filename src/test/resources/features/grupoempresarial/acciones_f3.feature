# language: es

@HUACCIONESGRUPOEMPRESARIAL
Característica: Validar que se pueda realizar acciones como editar o inactivar/activar un grupo empresarial
  COMO administrador
  QUIERO poder realizar la busqueda de una empresa por una carcteristica especifica
  PARA poder editarla y activar/inactivar

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial


  @CP16668
  Escenario: Validar ventana de confirmación al accionar el botón guardar de la pantalla de edición
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y el usuario da clic en el boton filtar grupo empresarial
    Y selecciona el icono de editar en el apartado de acciones ge
    Y realiza las modificaciones en los campos que desee y presiona el boton editar Grupo empresarial
      | razonSocialONombre   | direccion  | correoElectronico                  | telefono      | dominio                    |
      | Edicion razon social | Dg. 91 #69 | matriz_grupo_empresarial@gmail.com | +(57)30000000 | https://www.grupomatrix.co |
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro que desea actualizar el grupo empresarial?
    Y valida que exista el boton ACEPTAR
    Y valida que exista el boton CANCELAR

  @CP16669
  Escenario: Validar botón "No" de la ventana de confirmación para la edición de datos de un grupo empresarial
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y el usuario da clic en el boton filtar grupo empresarial
    Y selecciona el icono de editar en el apartado de acciones ge
    Y realiza las modificaciones en los campos que desee y presiona el boton editar Grupo empresarial
      | razonSocialONombre   | direccion  | correoElectronico                  | telefono      | dominio                    |
      | Edicion razon social | Dg. 91 #69 | matriz_grupo_empresarial@gmail.com | +(57)30000000 | https://www.grupomatrix.co |
    Entonces el usuario da click en no de la ventana de confirmacion
    Entonces el sistema muestra la pantalla principal de Editar Grupo Empresarial

  @CP16670
  Escenario: Validar ventana de confirmación al accionar el botón "Salir" de la pantalla de editar grupo empresarial
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y el usuario da clic en el boton filtar grupo empresarial
    Y selecciona el icono de editar en el apartado de acciones ge
    Y el usuario da clic en el boton salir ge
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de que desea volver sin guardar los cambios?
    Y valida que exista el boton ACEPTAR
    Y valida que exista el boton CANCELAR

  @CP16671
  Escenario: Validar botón "No" de la ventana de confirmación para salir de la pantalla de editar grupo empresarial
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 119234512-6 |
    Y le da clic en el boton filtar
    Y el usuario da clic en el boton filtar grupo empresarial
    Y selecciona el icono de editar en el apartado de acciones ge
    Y el usuario da clic en el boton salir ge
    Entonces el usuario valida en la ventana de confirmación ¿Está seguro de que desea volver sin guardar los cambios?
    Y el usuario da click en no de la ventana de confirmacion
    Entonces el sistema muestra la pantalla principal de Editar Grupo Empresarial


  @CP107174
  Escenario: Validar mensaje de error al intentar inactivar un grupo empresarial con empresas activas asociadas.
    Dado Este caso de prueba no aplica

  @CP10183
  Escenario: Validar mensaje al intentar inactivar un grupo empresarial con empresas asociadas a través la acción editar.
    Y El usuario diligencia el campo de filtro con un NIT existente grupo empresarial
      | NIT         |
      | 830037843-3 |
    Y le da clic en el boton filtar
    Y selecciona el icono de editar en el apartado de acciones ge
    Y el usuario inactiva el switch Estado y da clic en editar grupo empresarial
    Y el usuario da click en si de la ventana de confirmacion
    Entonces el sistema debe mostrar el mensaje respectivo No se puede inactivar debido a que existen Empresas asociadas.
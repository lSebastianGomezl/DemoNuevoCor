 #language: es

 @HUPANTALLAINICIAL
 Característica: Verificar que como administrador pueda visualizar la pantalla de inicio de grupo empresarial
   COMO administrador
   QUIERO poder visualizar la pantalla de inicio de gestión empresa
   PARA ver la pantalla inicial del módulo

   Antecedentes:
     Dado que el usuario se loguee en el sistema
       | tipoDocumento | usuario | contrasenna |
       | tipoDocumento | usuario | contrasenna |
     Cuando ingresa a la ruta Administración_Multinivel_GrupoEmpresarial


   @CP4515
   Escenario: Verificar el ingreso a la pantalla de inicio de Grupo empresarial
     Entonces el sistema muestra la pantalla inicial de grupo empresarial

   @CP7589PanelFitro @CP14040
   Escenario: Verificar que se oculte y se despliegue el panel de filtro de busqueda
     Y le da clic en el boton filtar
     Entonces el sistema muestra una tabla con las columnas
       | NIT | PAÍS | NOMBRE GRUPO EMPRESARIAL | TELÉFONO | CORREO | ESTADO | ACCIONES |
       | NIT | PAÍS | NOMBRE GRUPO EMPRESARIAL | TELÉFONO | CORREO | ESTADO | ACCIONES |

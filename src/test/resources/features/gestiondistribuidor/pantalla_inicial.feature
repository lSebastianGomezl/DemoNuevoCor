 #language: es

 @HU1PANTALLAINICIAL
 Característica: Verificar que como administrador pueda visualizar la pantalla de inicio de gestión distribuidor
   COMO administrador
   QUIERO poder ingresar a la pantalla de inicio de gestión distribuidor
   PARA poder ver la pantalla inicial del módulo


   Antecedentes:
     Dado que el usuario se loguee en el sistema
       | tipoDocumento | usuario | contrasenna |
       | tipoDocumento | usuario | contrasenna |
     Cuando ingresa a la ruta Administración_Multinivel_GestiónDistribuidor

   @CP6122
   Escenario: Verificar que se muestre la pantalla de inicial de gestión distribuidor
     Entonces el sistema muestra la pantalla inicial de gestión distribuidor


   @CP7593
   Escenario: Verificar  panel de filtro de busqueda
     Entonces valida que exista la barra de alerta con el mensaje Haga clic en el botón consultar para cargar toda la información
     Y valida los que existan los elementos de gestion distribuidor


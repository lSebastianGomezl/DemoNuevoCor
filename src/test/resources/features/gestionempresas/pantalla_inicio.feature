 #language: es

 @HU1
 Característica: Verificar que como administrador pueda visualizar la pantalla de inicio de gestión empresa
   COMO administrador
   QUIERO poder visualizar la pantalla de inicio de gestión empresa
   PARA ver la pantalla inicial del módulo

   Antecedentes:
     Dado que el usuario se loguee en el sistema
       | tipoDocumento | usuario | contrasenna |
       | tipoDocumento | usuario | contrasenna |
     Cuando ingresa a la ruta Administración_Multinivel_GestiónEmpresas

   @CP5795
   Escenario: Validar ruta de acceso a Gestión Empresas en la Web BackOffice
     Entonces el sistema muestra la pantalla inicial de gestión empresas

   @CP7683
   Escenario: Validar los componentes de la interfaz de la pantalla inicial de Gestión empresas
     Entonces el sistema debe mostrar los elementos de Gestión Empresas
     Y el usuario valida el botón limpiar
     Y el usuario valida el botón consultar
     Entonces el usuario valida el mensaje de busqueda Haga clic en el botón consultar para cargar toda la información
#Autor:johana.giraldo@konexinnovation.com.co
  #language: es

@HUPANTALLAINICIAL
Característica: Verificar que como administrador pueda visualizar la pantalla de inicio de gestionar comercializador.
  COMO administrador
  QUIERO poder visualizar la pantalla de inicio de gestionar comercializador.
  PARA ver la pantalla inicial del módulo

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | tipoDocumento | usuario | contrasenna |
      | tipoDocumento | usuario | contrasenna |
    Cuando ingresa a la ruta Administración_Multinivel_Gestion Comercializador

  @CP5758
  Escenario: Verificar los componentes de la pantalla de inicio de gestionar comercilaizador
    Entonces El sistema debe mostrar el contenido del submódulo. Se visualizará el título Gestión Comercializador


  @CP5771
  Escenario: Validar que al ingresar al modulo de Gestion Comercializador mensaje correspondiente para relizar la busqueda de informacion
    Entonces El sistema muestra el siguiente mensaje  Haga clic en el botón consultar para cargar toda la información

  @CP16357
  Escenario: Validar que el modulo de Gestion Comercializador cuente con todos  los componentes botones
    Entonces El sistema muestra la pantalla de inicio de Gestión Comercializador con los botones Limpiar, Consultar , Crear Comercializador para consultar  los campos NIT y Nombre o código distribuidor
      | btnFiltrar | btnCrearComercializador | btnLimpiar |
      | Consultar  | Crear Comercializador   | Limpiar    |



Feature: Agregar, verificar y eliminar registros en demoqa
  Yo como automatizador de pruebas de Sophos
  Necesito acceder a la pagina web de https://demoqa.com/
  Para agregar, verificar y eliminar registros

  Scenario: Agregar registros

    Given Cristian quiere ir a la pagina de url
    When Agregar un nuevo registro con datos de usuario y usuario nuevo
    Then Se valida que el usuario se cree exitosamente

#Autor srenteriamontoya@gmail.com
@Punto1
  Feature: Evaluar elements
    Yo como automatizador de pruebas
    Necesito ingresar a la pagina
    Para validar algunas funcionalidades

  Scenario: Ingresar a Elements
    Given "Actor" Desea navegar a la pagina "https://demoqa.com/"
    When Crear un nuevo registro en Web tables
    Then Valida que se creo el registro "Santiago"



#Autor srenteriamontoya@gmail.com
@Punto1
  Feature: Evaluar elements
    Yo como automatizador de pruebas
    Necesito ingresar a la pagina
    Para validar algunas funcionalidades

  Scenario: Ingresar a Elements
    Given "Actor" Desea navegar a la pagina "https://demoqa.com/"
    When Crear un nuevo registro en Web tables
   #| First_Name | Santiago          |
   # //| Last_Name  | Renteria          |
    #//| Email      | san.ren@gmail.com |
    #//| Age        | 30                |
    #//| Salary     | 1000              |
    #//| Department | QA                |
    Then Valida que se creo el registro "Santiago"



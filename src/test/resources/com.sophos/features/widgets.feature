#Autor: srenteriamontoya@gmai.com
@Punto2
  Feature: Funcionalidades de ventana widgets
    Yo como automatizador de pruebas
    Necesito ingresar a la pagina
    Para validar algunas funcionalidades

  Background: Ingresar a la pagina
    Given "Actor" Desea navegar a la pagina "https://demoqa.com/"

  Scenario: Probar funcionalidades de widgets
    When Seleccionar fecha "12/29/2022" y seleccionar hora y fecha "December 29, 2022 6:30 PM"

#Autor: srenteriamontoya@gmail.com
@Punto3
Feature: Funcionalidades de ventana alerts, frame and windows
  Yo como automatizador de pruebas
  Necesito ingresar a la pagina
  Para validar algunas funcionalidades

  Background: Ingresar a la pagina
    Given "Actor" Desea navegar a la pagina "https://demoqa.com/"

  Scenario: Probar funcionalidades de alerts, time and windows
    When Probar las alertas y agregar el nombre "Santiago"
    Then Valida que se ingreso el texto "Santiago"
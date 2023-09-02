# encoding: iso-8859-1
Feature: Login demoblaze
  Como usuario quiero loguearme en la aplicacion

  @Login
  Scenario: Realizar login demoblaze
    Given que "usuario" ingreso a la pagina
    When ingreso las credenciales de acceso
    Then valido el correcto acceso






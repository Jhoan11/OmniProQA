# encoding: iso-8859-1
Feature: Registro demoblaze
  Como usuario quiero realizar compra en la aplicacion demoblaze

  @Registro
  Scenario: Realizar compra demoblaze
    Given que "usuario" está en el home de la página
    When registro las credenciales de acceso
    Then valido el correcto registro
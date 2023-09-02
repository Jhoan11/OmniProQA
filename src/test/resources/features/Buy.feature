# encoding: iso-8859-1
Feature: Compra demoblaze
  Como usuario quiero realizar compra en la aplicacion demoblaze

  @Login
  Scenario: Realizar compra demoblaze
    Given que "usuario" está en el home de la página
    When agrega un producto al carrito
    Then valido que se haga la compra correctamente
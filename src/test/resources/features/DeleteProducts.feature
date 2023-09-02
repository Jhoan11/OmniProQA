# encoding: iso-8859-1
Feature: Eliminar productos del carrito
  Como usuario quiero eliminar productos del carrito en el aplicativo Demoblaze

  @EliminarProductos
  Scenario: Eliminar productos del carrito
    Given que "usuario" ingreso a la pagina como logueado
    When agrego y elimino productos del carrito
    Then valido la eliminación de productos

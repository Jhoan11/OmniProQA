# encoding: iso-8859-1
Feature: Navegar por categorias
  Como usuario navegar por categorias y agregar producto

  @ProductCategories
  Scenario: Navegar por categorias
    Given que "usuario" ingreso a la pagina como no registrado
    When navego por las categorias del home
    Then valido el correcto acceso
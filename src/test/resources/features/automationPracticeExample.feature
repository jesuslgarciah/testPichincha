Feature: compra de articulos

  Scenario: Realizar una compra de 2 articulos
    Given quiero iniciar sesion en la tienda
      And quiero realizar una compra de dos articulos
    When agregue los 2 articulos al carrito
    Then podre realizar el proceso de compra
Feature: Order Tests
  Incluye los tests que se ejecutarán en relación a los pedidos

  @smokeTest
  Scenario: Un mensaje de error correcto es proporcionado  cuando el orden no existe
    Given La API está disponible
    When Busco un pedido con el identificador '15787678'
    Then las respuestas contendrán el valor 'Order not found'para el campo'message'

  @smokeTest
  Scenario: Los usuarios pueden crear un pedido
    Given La API está disponible
    When Creo un pedido de mascota con el identificador '58'
    Then La respuesta del pedido tiene '200' response code
    And La respuesta del pedido contiene la información correcta

  @smokeTest
  Scenario: Los usuarios pueden buscar pedidos según id
    Given el pedido existe para una mascota
    When busco el pedido según identificador
    Then el pedido completo es devuelto

  @smokeTest
  Scenario: Los usuarios pueden pedir mascotas disponibles
    Given el gato está'available'
    Then Puedo pedir un gato
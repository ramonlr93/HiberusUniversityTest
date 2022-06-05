

Feature: Pet Tests
  Incluye los tests que se ejecutarán en relación a las mascotas

  @smokeTest
  Scenario: Los usuarios pueden añadir mascotas
    Given La API está disponible
    When Añado una mascota al sistema
    Then la peticion máscota tiene '200' response code
    And la respuesta de la mascota contiene la informacion correcta


  @smokeTest
  Scenario: Los usuarios pueden borrar mascotas
    Given la mascota existe
    When Borro la mascota
    And entonces busco mascota por su identificador
    Then las respuestas contendrán el valor 'Pet not found'para el campo'message'

  @smokeTest
  Scenario: Los usuarios pueden añadir mascotas con varias etiquetas
    Given La API está disponible
    Then Puedo añadir una mascota con muchas etiquetas

  @smokeTest
  Scenario: Los usuarios pueden añadir mascotas sin etiquetas
    Given La API está disponible
    Then Puedo insertar una mascota sin etiquetas

  @smokeTest
  Scenario: Los ids son autogenerados cuando no se proporcionan para una mscota
    Given La API está disponible
    When Añado una mascota al sistema sin identificador
    Then Un id es autogenerado para la mascota

  @smokeTest
  Scenario: Inserto una mascota con información incorrecta y devuelve un 400
    Given La API está disponible
    When Añado una mascota y la información es incorrecta '{'
    Then la peticion máscota tiene '400' response code
    Then las respuestas contendrán el valor 'bad input'para el campo'message'
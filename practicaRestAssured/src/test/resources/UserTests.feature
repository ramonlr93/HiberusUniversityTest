Feature: User Tests
  Incluye los tests que se ejecutarán en relación a los usuarios

@smokeTest
Scenario: Los usuarios se pueden buscar por su username
    Given Un usuario valido existe
    When Busco un usuario por su username
    Then el usuario es localizado



@smokeTest
Scenario: Un usuario puede iniciar sesión
    Given La API está disponible
    When Intento iniciar sesion
    Then Verifico inicio sesion

@smokeTest
Scenario: Un usuario puede cerrar sesión
    Given La API está disponible
    Then Verifico cierre sesion

@smokeTest
Scenario: Puedo crear un usuario
    When envio peticion crear usuario
    Then verifico usuario creado

@smokeTest
Scenario: Puedo borrar un usuario
    When envio peticion borrar usuario
    Then verifico usuario borrado


@smokeTest
Scenario: Puedo actualizar un usuario
    When envio peticion actualizar usuario
    Then verifico actualizado
    



$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderTests.feature");
formatter.feature({
  "line": 1,
  "name": "Order Tests",
  "description": "Incluye los tests que se ejecutarán en relación a los pedidos",
  "id": "order-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Un mensaje de error correcto es proporcionado  cuando el orden no existe",
  "description": "",
  "id": "order-tests;un-mensaje-de-error-correcto-es-proporcionado--cuando-el-orden-no-existe",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Busco un pedido con el identificador \u002715787678\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "las respuestas contendrán el valor \u0027Order not found\u0027para el campo\u0027message\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 7073556100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15787678",
      "offset": 38
    }
  ],
  "location": "OrderEndpointStepDefinitions.busco_un_pedido_con_el_identificador(String)"
});
formatter.result({
  "duration": 694769700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Order not found",
      "offset": 36
    },
    {
      "val": "message",
      "offset": 66
    }
  ],
  "location": "CommonDefinitions.muestro_las_definiciones_correctas(String,String)"
});
formatter.result({
  "duration": 2713187900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Los usuarios pueden crear un pedido",
  "description": "",
  "id": "order-tests;los-usuarios-pueden-crear-un-pedido",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Creo un pedido de mascota con el identificador \u002758\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "La respuesta del pedido tiene \u0027200\u0027 response code",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "La respuesta del pedido contiene la información correcta",
  "keyword": "And "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 766429800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "58",
      "offset": 48
    }
  ],
  "location": "OrderEndpointStepDefinitions.creo_un_pedido_de_mascota_con_el_identificador(Integer)"
});
formatter.result({
  "duration": 692021300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 31
    }
  ],
  "location": "OrderEndpointStepDefinitions.la_respuesta_del_pedido_tiene(Integer)"
});
formatter.result({
  "duration": 3355100,
  "status": "passed"
});
formatter.match({
  "location": "OrderEndpointStepDefinitions.la_respuesta_del_pedido_tiene_la_informacion_correcta()"
});
formatter.result({
  "duration": 17683600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Los usuarios pueden buscar pedidos según id",
  "description": "",
  "id": "order-tests;los-usuarios-pueden-buscar-pedidos-según-id",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "el pedido existe para una mascota",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "busco el pedido según identificador",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "el pedido completo es devuelto",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderEndpointStepDefinitions.el_pedido_existe_para_una_mascota()"
});
formatter.result({
  "duration": 682723200,
  "status": "passed"
});
formatter.match({
  "location": "OrderEndpointStepDefinitions.busco_pedido_segun_identificador()"
});
formatter.result({
  "duration": 590508500,
  "status": "passed"
});
formatter.match({
  "location": "OrderEndpointStepDefinitions.el_pedido_completo_es_devuelto()"
});
formatter.result({
  "duration": 59938200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Los usuarios pueden pedir mascotas disponibles",
  "description": "",
  "id": "order-tests;los-usuarios-pueden-pedir-mascotas-disponibles",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "el gato está\u0027available\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Puedo pedir un gato",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "available",
      "offset": 13
    }
  ],
  "location": "PetEndpointStepDefinitions.el_gato_esta(String)"
});
formatter.result({
  "duration": 627587300,
  "status": "passed"
});
formatter.match({
  "location": "OrderEndpointStepDefinitions.puedo_pedir_un_gato()"
});
formatter.result({
  "duration": 614445000,
  "status": "passed"
});
formatter.uri("PetTests.feature");
formatter.feature({
  "line": 3,
  "name": "Pet Tests",
  "description": "Incluye los tests que se ejecutarán en relación a las mascotas",
  "id": "pet-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Los usuarios pueden añadir mascotas",
  "description": "",
  "id": "pet-tests;los-usuarios-pueden-añadir-mascotas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Añado una mascota al sistema",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "la peticion máscota tiene \u0027200\u0027 response code",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "la respuesta de la mascota contiene la informacion correcta",
  "keyword": "And "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 785758900,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.inserto_mascota_en_el_sistema()"
});
formatter.result({
  "duration": 648995100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 27
    }
  ],
  "location": "PetEndpointStepDefinitions.la_peticion_mascota_tiene_el_status(Integer)"
});
formatter.result({
  "duration": 170300,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.la_informacion_de_la_mascota_contiene_la_informacion_correcta()"
});
formatter.result({
  "duration": 40437100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Los usuarios pueden borrar mascotas",
  "description": "",
  "id": "pet-tests;los-usuarios-pueden-borrar-mascotas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "la mascota existe",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Borro la mascota",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "entonces busco mascota por su identificador",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "las respuestas contendrán el valor \u0027Pet not found\u0027para el campo\u0027message\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PetEndpointStepDefinitions.la_mascota_existe()"
});
formatter.result({
  "duration": 631712300,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.borro_la_mascota()"
});
formatter.result({
  "duration": 578291000,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.entonces_busco_mascota_por_su_identificador()"
});
formatter.result({
  "duration": 644621900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pet not found",
      "offset": 36
    },
    {
      "val": "message",
      "offset": 64
    }
  ],
  "location": "CommonDefinitions.muestro_las_definiciones_correctas(String,String)"
});
formatter.result({
  "duration": 47966200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Los usuarios pueden añadir mascotas con varias etiquetas",
  "description": "",
  "id": "pet-tests;los-usuarios-pueden-añadir-mascotas-con-varias-etiquetas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Puedo añadir una mascota con muchas etiquetas",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 923737900,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.puedo_insertar_mascota_con_varias_etiquetas()"
});
formatter.result({
  "duration": 731093800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Los usuarios pueden añadir mascotas sin etiquetas",
  "description": "",
  "id": "pet-tests;los-usuarios-pueden-añadir-mascotas-sin-etiquetas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Puedo insertar una mascota sin etiquetas",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 722981300,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.puedo_insertar_una_mascota_sin_etiquetas()"
});
formatter.result({
  "duration": 635863400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Los ids son autogenerados cuando no se proporcionan para una mscota",
  "description": "",
  "id": "pet-tests;los-ids-son-autogenerados-cuando-no-se-proporcionan-para-una-mscota",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Añado una mascota al sistema sin identificador",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Un id es autogenerado para la mascota",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 742168900,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.inserto_mascota_sin_identificador()"
});
formatter.result({
  "duration": 596117300,
  "status": "passed"
});
formatter.match({
  "location": "PetEndpointStepDefinitions.un_id_es_autogenerado_para_la_mascota()"
});
formatter.result({
  "duration": 19937900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Inserto una mascota con información incorrecta y devuelve un 400",
  "description": "",
  "id": "pet-tests;inserto-una-mascota-con-información-incorrecta-y-devuelve-un-400",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Añado una mascota y la información es incorrecta \u0027{\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "la peticion máscota tiene \u0027400\u0027 response code",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "las respuestas contendrán el valor \u0027bad input\u0027para el campo\u0027message\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 672996400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{",
      "offset": 50
    }
  ],
  "location": "PetEndpointStepDefinitions.inserto_mascota_y_info_es_incorrecta(String)"
});
formatter.result({
  "duration": 600394800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 27
    }
  ],
  "location": "PetEndpointStepDefinitions.la_peticion_mascota_tiene_el_status(Integer)"
});
formatter.result({
  "duration": 149100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bad input",
      "offset": 36
    },
    {
      "val": "message",
      "offset": 60
    }
  ],
  "location": "CommonDefinitions.muestro_las_definiciones_correctas(String,String)"
});
formatter.result({
  "duration": 15694500,
  "status": "passed"
});
formatter.uri("UserTests.feature");
formatter.feature({
  "line": 1,
  "name": "User Tests",
  "description": "Incluye los tests que se ejecutarán en relación a los usuarios",
  "id": "user-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Los usuarios se pueden buscar por su username",
  "description": "",
  "id": "user-tests;los-usuarios-se-pueden-buscar-por-su-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Un usuario valido existe",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Busco un usuario por su username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "el usuario es localizado",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEndpointStepDefinitions.un_usuario_valido_existe()"
});
formatter.result({
  "duration": 676096300,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.busco_un_usuario_por_su_username()"
});
formatter.result({
  "duration": 647546300,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.el_usuario_es_localizado()"
});
formatter.result({
  "duration": 27145600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Un usuario puede iniciar sesión",
  "description": "",
  "id": "user-tests;un-usuario-puede-iniciar-sesión",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Intento iniciar sesion",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verifico inicio sesion",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 676002500,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.intento_inicio_sesion()"
});
formatter.result({
  "duration": 671991100,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.verifico_inicio_sesion()"
});
formatter.result({
  "duration": 14179000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Un usuario puede cerrar sesión",
  "description": "",
  "id": "user-tests;un-usuario-puede-cerrar-sesión",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "La API está disponible",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Verifico cierre sesion",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonDefinitions.la_api_esta_disponible()"
});
formatter.result({
  "duration": 763837400,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.verifico_cierre_sesion()"
});
formatter.result({
  "duration": 594097100,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Puedo crear un usuario",
  "description": "",
  "id": "user-tests;puedo-crear-un-usuario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "envio peticion crear usuario",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "verifico usuario creado",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEndpointStepDefinitions.envio_peticion_crear_usuario()"
});
formatter.result({
  "duration": 580488500,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.verifico_usuario_creado()"
});
formatter.result({
  "duration": 104800,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Puedo borrar un usuario",
  "description": "",
  "id": "user-tests;puedo-borrar-un-usuario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "envio peticion borrar usuario",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "verifico usuario borrado",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEndpointStepDefinitions.envio_peticion_borrar_usuario()"
});
formatter.result({
  "duration": 649329000,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.verifico_usuario_borrado()"
});
formatter.result({
  "duration": 55400,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Puedo actualizar un usuario",
  "description": "",
  "id": "user-tests;puedo-actualizar-un-usuario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "envio peticion actualizar usuario",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "verifico actualizado",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEndpointStepDefinitions.envio_peticion_actualizar_usuario()"
});
formatter.result({
  "duration": 590508000,
  "status": "passed"
});
formatter.match({
  "location": "UserEndpointStepDefinitions.verifico_actualizado()"
});
formatter.result({
  "duration": 115200,
  "status": "passed"
});
});;
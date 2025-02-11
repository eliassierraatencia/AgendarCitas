#language:en

Feature: Yo como usuario quiero probar el escenario de agendar cita el sitio CURA Healthcare Service

  @Registro
  Scenario Outline: Agendar cita medica exitosa en el sitio
    Given el actor ingresa a la url del sitio CURA Healthcare Service
      | url   |
      | <url> |
    When el actor se autentica con la siguiente informacion
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And ingresa la información requerida para agendar la cita
      | comentario   |
      | <comentario> |
    Then valida que la cita se agendo de manera exitosa
      | mensajeExitoso   |
      | <mensajeExitoso> |
    Examples:
      | url                                      | usuario  | contrasena         | comentario         | mensajeExitoso           |
      | https://katalon-demo-cura.herokuapp.com/ | John Doe | ThisIsNotAPassword | Cita con pediatria | Appointment Confirmation |
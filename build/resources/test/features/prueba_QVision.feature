Feature: realizar el proceso de compra completo

  Scenario Outline: ana inicia se registra en la pagina y realiza una compra exitosamente
    Given megan se registra en la pagina con sus datos basicos nombre "<nombre>" apellido "<apellido>" y telefono "<telefono>" y su email "<email>"
    When realiza una compra exitosamente
    Then debe de generar un comprobante de compra

    Examples:
    |nombre       |apellido |telefono   |  email           |
    |Luis Fernando|Mercado  | 3185548721| correo@correo.com|
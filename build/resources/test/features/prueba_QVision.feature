Feature: realizar el proceso de compra completo


  Scenario Outline: luis se registra en la pagina y realiza una compra exitosamente y envia el comprobante de pago
    Given luis se registra en la pagina con sus datos basicos
      | nombre      | <nombre>     |
      | apellido    | <apellido>    |
      | telefono    | <telefono>    |
      | email       | <email>       |
      | contraseña  | <contraseña>  |
      | compañia    | <compañia>    |
      | direccion   | <direccion>   |
      | ciudad      | <ciudad>      |
      | codigoPost  | <codigoPost>  |
    When realiza una compra exitosamente
    And descarga el recibo de compra
    And envia el comprobante de pago
    |usurio        |  <usuarioMail>  |
    |contraseñaMail| <contraseñaMail>|
    |receiver      | <receiver>      |
    |reason        | <reason>        |
    |bodyMessage   | <bodyMessage>   |
    Then el correo debio ser enviado

    Examples:
    |nombre       |apellido |telefono   |  email                             |contraseña | compañia |direccion | ciudad  |codigoPost|usuarioMail                   |contraseñaMail  |receiver                       |reason                |bodyMessage                               |
    |Luis Fernando|Mercado  | 3185548721| correo@correovalido.com|123456luis | Qvision  | Calazans |Medellin   |  50035  |usuariopruebaqvision@gmail.com           |123456789Qvision|usuariopruebaqvision@gmail.com | comprobante de compra| esta la factura con el valor de la compra|
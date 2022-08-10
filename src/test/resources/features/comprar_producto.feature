##Autor: John Alexander Espinal Gómez - jaespinalg02@gmail.com

  Feature: Se requiere realizar la ruta critica de compra de un producto aleatorio desde el login hasta el pago exitoso en la pagina

    Scenario: yo como usuario requiero ingresar a la pagina automationpractice e ingresar con usuario registrado y realizar la compra exitosa de un vestido
      Given el usuario ingresa a la pagina donde se loguea con un usuario registrado
      | usuario                   |  contrasena  |
      | john.espinal@sofka.com.co |  Alex123456* |
      When el usuario agrega al carro un procducto realizando toda la pasarela de pago
      Then el usuario ve mensaje de pago exitoso
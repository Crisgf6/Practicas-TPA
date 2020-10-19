# Practica1-TPA
Practica 1 Técnicas de Programación Avanzada

En esta practica, he desarrollado un codigo que simula una web de gestion de hoteles (similar a Trivago por ejemplo), con diferentes opciones para el usuario.

El usuario interactua con la base de datos atraves de un menu de 6 opciones (incluida la de 'Salir') y que le permiten manipular el programa a su gusto.

El programa incluye 3 clases:

            ·Hotel

            ·Habitación

            ·Reserva

Y el programa main. En cuanto a la relacion entre las clases Habitacion y Reserva, encontramos una relacion de herencia en la que la clase Reserva, hereda los atributos y los metodos de la clase habitación.
Cada clase con sus metodos publicos y privados (por seguridad y para que el usuario no pueda manipular ciertos aspectos del programa) y sus correspondientes métodos.

*Funcionaliodad*

En cuanto al programa, el usuario navega por un menu de 6 opciones, hasta que pulsa la opcion numero 6 (marcada como la opcion 'Salir'). Implementado con un While.
El programa permite al usuario:

    ·Añadir un hotel a la base de datos
    
    ·Hacer una consulta de los hoteles disponibles con sus respectiva información
    
    ·Hacer una reserva en uno de los hoteles
    
    ·Cancelar una reserva
    
    ·Escribir una reseña sobre un hotel
    
Separados los casos por un *switch*, e implementados usando una variedad de bucles y distintas herramientas de programacion.

Para evitar la redundancia de datos en la base de datos del programa, he decidido simular una clave primaria usando el dni de los usuarios. Es decir, en el programa no he permitidos que hayan dos reservas con el mismo dni en el mismo hotel. Este aspecto queda plasmado en la opcion reservar habitacion, ya que una vez introducidos los datos, si el programa detecta que hay una reserva con el mismo dni en el mismo hotel, saltará un error y no procedera a meter la reserva en el vector de reserva, y por ende, hacer la reserva que solicita el usuario.

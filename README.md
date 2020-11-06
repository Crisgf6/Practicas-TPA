# Practica2-Técnicas de Programación Avanzada
Practica 1 Técnicas de Programación Avanzada

En esta practica, he desarrollado un codigo que simula una web de gestion de hoteles (similar a Trivago por ejemplo), con diferentes opciones para el usuario.

El usuario interactua con la base de datos atraves de un menu de 5 opciones (incluida la de 'Salir') y que le permiten manipular el programa a su gusto.

El programa incluye 3 clases:

            ·Hotel

            ·Habitación

            ·Reserva

Y el programa main. En cuanto a la relacion entre las clases Habitacion y Reserva, encontramos una relacion de herencia en la que la clase Reserva, hereda los atributos y los metodos de la clase habitación.
Cada clase con sus metodos publicos y privados (por seguridad y para que el usuario no pueda manipular ciertos aspectos del programa) y sus correspondientes métodos.

*Funcionaliodad*

En cuanto al programa, el usuario navega por un menu de 5 opciones, hasta que pulsa la opcion numero 5 (marcada como la opcion 'Salir'). Implementado con un While.
El programa permite al usuario:

    ·Añadir un hotel a la base de datos
    
    ·Hacer una consulta de los hoteles disponibles con sus respectiva información
    
    ·Hacer una reserva en uno de los hoteles
    
    ·Escribir una reseña sobre un hotel
    
Separados los casos por un *switch*, e implementados usando una variedad de bucles y distintas herramientas de programacion.

En la clase Hotel, a la hora de implementar el método inicializarHotel, he tenido que crear una instancia de la clase para poder devolver los datos que introduce el usuiario a la función main, para que puedan ser procesados en la misma.

También he creado un método en la clase Hotel que muestra los datos mas relevantes para un consumidor, de todos los hoteles de la base de datos.

Para el atributo 'numero' de la clase habitación, he decido implementar un randomizador de números, siendo el límite 200, para simular el método de distribución de habitaciones de los hoteles. Siendo este por ejemplo '122', en el que el '1' marca el primer piso, y el '22' la habitación en el pasillo.

A la hora de implementar el método inicializarHotel, he decidido inicializar el atributo reseña = "", para dar la opción al usuario de introducirla manualmente mediante una opción aparte de la aplicación/programa. Con el fin de darle un poco más de realismo a la práctica.

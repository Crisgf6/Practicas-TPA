<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/eclipse.png" width="200" height="auto">

# Practica4-Técnicas de Programación Avanzada

En esta práctica, he desarrollado el codigo de la practica anterior para conseguir un programa mas completo, que implemente mas métodos y funcionalidades y que cubra algunos defectos del codigo anterior. Por supuesto sieguiendo las pautas y el guion que se me facilito para esta practica.
  
*Desarrollo de la practica*

**Lectura/escritura en fichero**: He decidido implementar una funcionalidad nueva en la aplicacion que permite al usuario imprimir un informe con los datos de los hoteles y sus nombres listados. Esto lo he implementado de la siguiemte manera:

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/entradaSalida.PNG" width="600" height="auto">

Mediante un bucle, recorro el vector de hoteles llamando a la función que muestra sus correspondientes datos, y los imprimo en el fichero de texto. Una vez cerrado el fichero, lo escaneo y imprimo por pantalla su contenido. Esto es unicamente para comprbar la correcta funcionalidad del método.

**Genericos**: Para complementar la entrada/salida de ficheros, he creado una clase *Lista* con tipos genericos basada en un vector, que lo que hace es ir alistando valores (en este caso los nombres de los hoteles) que finalmente serán impresos en el ficheero de texto 

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/genericos.PNG" width="auto" height="auto">

**Crypto en Java**: Para este apartado, he visto algunos ejemplos del uso de la libreria *Crypto* en java pero he decidido hacer una implementación completa por mi propia cuenta. He implementado una interfaz crypto para simular la encriptación y desencriptación de datos. La clase *Criptografía* que implementa la interfaz tiene dos métodos. Encriptar y desencriptar.

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/crypto1.PNG" width="auto" height="auto">

Ambos métodos reciben como parámetros un array de tipo *Byte* [-127 - 128] y encripta los valores correspondientes. Para esta práctica, he decidido que la *key* sea que para los valores pares, se sume 1, y para los impares, se reste 1. De la misma manera funciona el método *desencriptar* pero, haciendo la operación inversa en cada caso. Esto ha quedado plasmado en la práctica con la funcionalidad que se le ofrece al usuario de recuperar su contraseña. 

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/crypto2.PNG" width="auto" height="auto">

El usuario introduce su email, y se le muestra su correspondiente contraseña encriptada y sin encriptar. Creo una instancia de la clase criptografía ya que si no, habría que hacer los métodos encriptar y desencriptar estáticos.

He ampliado la cobertura de los tests y he implementado uno que comprueba el correcto funcionamiento de todo el aspecto criptográfico del programa.

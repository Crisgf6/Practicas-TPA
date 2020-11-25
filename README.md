<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/eclipse.png" width="200" height="auto">

# Practica3-Técnicas de Programación Avanzada

En esta práctica, he desarrollado el codigo de la practica anterior para conseguir un programa mas completo, que implemente mas métodos y funcionalidades y que cubra algunos defectos del codigo anterior. Por supuesto sieguiendo las pautas y el guion que se me facilito para esta practica.

*Cosas que han sido corregidas*
  
   ·Clase Hotel: En la practica anterior, el vector de hoteles generado para albergar todos los distintos hoteles que se van creando a lo largo de la ejecucion del programa, estaba inicializado en la clase **Hotel**. Esto no suponia ningun error a nivel de ejecucion como tal. Sin embargo, Es un error conceptual ya que no tiene sentido crear un hotel con hoteles dentro. Lo que he hecho en esta practica es inicializar ese vector en el programa **main**, y en las funciones en las que se requiere ese vector, pasarlo como parametro.
   
   ·Resource Bundle: En la práctica anterior, implementé los **Resource Bundles** para la internacionalización, pero resulto ser una manera muy poco práctica. Esto se debe a que en el programa anterior, creaba una variable y le asignaba el **.getString()** correspondiente que era lo que hacia la busqueda en los **bundles**. A priori esto no parecía un problema ya que en mi programa, no hay tantas cadenas que deben ser traducidas. Sin embargo, en un programa que haya 1k+ cadenas (por ejemplo), no es viable crear esas **X** variables para cada cadena que hay que crear para hacer la busqueda en el **bundle**. En esta práctica, lo que he hecho ha sido crear una clase **Recursos**, que tiene como atributo **private Locale l;** y que se instancia una vez el usuario ha seleccionado el idioma. La clase implementa un método que recibe una cadena, y devuelve la cadena asociada del **resource bundle** especificado por el usuario. Por lo que a la hora de imprimir una cadena en cualquier otro método, lo unico que hay que hacer es llamar a dicha función pasandole la cadena a traducir.
   
   <img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/Recursos.PNG" width="auto" height="auto">
  
*Desarrollo de la practica*

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/diagramaClases.PNG" width="auto" height="auto">

·Este diagrama de clases representa la gerarquía de clases que se encuentra en el codigo de la practica. Tal y como se aprecia, la clase **Habitacion** es una **super clase**, **Reserva** es una **sub clase** de esta super clase. Es decir, que la extiende. heredando así sus atributos y métodos. Por otra parte, hay una relación de agregación entre **Hotel*+ y **Reserva**. En este caso, el diagrama describe que un hotel puede tener, o no, varias reservas mientras que una reserva no puede no tener hotel. De hecho, debe tener uno, y solo un, hotel. En este diagrama se muestran las clases que componen el programa y sus atributos y métodos públicos (+) y privados (-).

·En esta práctica he implementado una interfaz, y el funcionamiento que le he dado es el siguiente.

<img src="https://github.com/Crisgf6/Practica1-TPA/blob/main/assets/interfaz.PNG" width="auto" height="auto">

La clase buscador, que tiene como atributo un vector de strings, implementa un método que recibe como parámetro una clave, y la función es devolver **true** o **false** en función de si el vector de strings contiene o no esa clave. De esta manera se puedverificar si existe **X** reserva, o si existe **X** hotel. El programa muestra por pantalla un mensaje el cual he contolado con el operador *?*.

·En la práctica anterior, a la hora de inicializar el hotel, el atributo **reseña** siempre se inicializaba como una cadena vacia, y ya posteriormente se le asignaba una reseña especificada por el usuario. Lo que he hecho en esta paráctica para que quedase mas estético ha sido sobrecargar el método constructor de la clase hotel para que hubiese un constructor que no inicializase la variable reseña.

·Para el uso de la clase *Math*, he creado un nuevo atributo para la clase hotel que se llama valor. Este se calcula en el método *inicializarHotel()* como el *precioNoche* elevado a 4.

·En esta práctica, he incorporado los test de *Junit*. Estos son metodos que te permiten probar el funcionamiento de las clases y de los métodos de tu programa. He tratado de incorporar distintos tipos de funcionalidades como **assertEquals**, **assertNotSame**, **assertTrue** y **assertNotNull**. Asimismo, he implementado un test que verifica el comportamiento de la interfaz.

Por ultimo, hago incapie en el hecho de que hay veces que combiene mejorar el interfaz o cambiar ciertos aspectos del programa en vez de seguir con el desarrollo. Esto lo he visto plasmado a lo largo de estas 3 practicas. En todas he tenido que dedicarle algo de tiempo en mejorar un aspecto del programa que no era adecuado. Lo que he mencionado antes del notable cambio en los *resource bundles* o en el detalle de los vectores son un claro ejemplo de esto. Si esta situación la llevamos a la empresa, siempre hay pequeños aspectos que hemos de cambiar y corregir cuando son faciles de detectar antes de seguir con el desarrollo y hacer un codigo mucho mas extenso. Esto hará que el codgo sea mas eficiente.

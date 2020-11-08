https://raw.githubusercontent.com/Crisgf6/Practica1-TPA/master/assets/codigoIdioma.png

# Practica2-Técnicas de Programación Avanzada

En esta práctica, he desarrollado el codigo de la practica anterior para conseguir un programa mas completo, que implemente mas métodos y funcionalidades y que cubra algunos defectos del codigo anterior. Por supuesto sieguiendo las pautas y el guion que se me facilito para esta practica.

*Cosas que han sido corregidas*
  
   ·Clase Main: En la practica anterior, la clase main implementaba la mayoria de los metodos del programa y eso hacia que el codigo de dicha clase fuera muy           extenso y dificil de leer y seguir. En esta segunda practica, he inicializado los vectores **hoteles** y **reservas** en la clase hotel, y esto me ha permitido difinir los metodos (antes definidos en el main) en esta clase. Dejando asi una clase main mas legible y concisa.
  
   ·Redundancia: En la practica anterior, no tuve ningun control sobre la redundancia de los datos. Es decir, un mismo cliente podia hacer varias reservas en el mismo hotel. En esta practica, para poder crear el metodo Cancelar Reserva, he decidido simular una clave primaria con los atributos de reserva hotel y dni para poder identificar la reserva y no permitir que un mismo cliente haga mas de una reserva en el mismo hotel.
  
*Desarrollo de la practica*

La internacionalizacion del programa es uno de los aspectos nuevos que incorpora el codigo (quizas de los que mas resalta). Decidi poner el ingles como segundo idioma. Es decir, en la ejecucion de la aplicacion, el usuario tiene la posibilidad de navegar por el menu en un idioma preseleccionado que personaliza el menu. Para conseguir esto, he hecho uso de los **resource bundles** de Eclipse, que permite definir una libreria (por asi decirlo). En mi programa, cree un **resource bundle** para albergar las palabras clave en español y otro para las palabras en ingles. Partiendo de esos dos ficheros, en el main, doy la opcion de seleccionar el idioma, y haciendo uso de Locale, creo una variable acorde a lo seleccionado por el usuario que es la que buscara las palabras clave en el fichero adecuado. Esto me ha permitido, si nos fijamos, sustiruir todas las cadenas en los **System.out.print()** por la variable que facilita Locale. Para asi imprimir la cadena en funcion del idioma especificado por el usuario.

Para profundizar en las funcionalidades de la aplicacion, he creado una clase usuario en la que he diseñado distintos metodos. Cuando el usuario selecciona la opcion '1' del menu principal, se le redirecciona a un menu seccundario con unas opciones concretas. 

    ·Iniciar sesion: El usuario intruduce su email y contraseña e inicia sesion en la aplicacion.
    
    ·Mostrar usuarios: Opcion que muestra todos los usuarios registrados y su ultimo inicio de sesion 
    (implementado haciendo uso de LocalDate)
    
    ·Salir: Opcion que redirecciona al usuario al menu principal.

Tambien me ha parecido curioso y esteticamente atractivo hacer uso de **Swing**. En la opcion '7' (salir de la aplicacion), en vez de acabar el programa de forma inmediata, se despliega un menu interativo de confirmacion que simplemente ofrece una opcion de confirmacion al usuario para salir o permanecer en la aplicacion. 

El programa principal incorpora una nueva funcionalidad. **Cancelar Reserva** es un metodo que permite al usuario cancelar su reserva. El usuario introduce su dni y el hotel donde se encuentra la reserva que desea cancelar ya que son los atributos que componen la clave primaria simulada que he mencionado antes. Primeramente, el programa recorre el vector de hoteles y comprueba que el nombre de hotel que ha introducido el usuario corresponde con el de algun hotel del vector. Es decir, que se comprueba que el hotel exista. Una vez hecha esta comprobacion, se recorre el vector de reservas para localizar la reserva que coincida con el hotel y el dni del usuario para poder eliminarla (cancalerla) del vector. De esta manera, si la reserva no existe se mostrara un mensaje por pantalla.

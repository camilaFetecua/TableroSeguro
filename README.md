#  TALLER SEGURIDAD EN APLICACIONES WEB Y WEBSOCKETS

## Taller ARSW 2021-i / 8 JuLio del 2021

  El objetivo de este taller es que partiendo de la aplicación web del tablero interactivo debe construir una aplicación web segura y que sea segura a a nivel de websockets.

    a. Para asegurar la parte web debe usar autenticación basada en passwords y conexiones seguras sobre https.

    b. Implemente un protocolo de seguridad para websockets.

# Prerrequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
  Para verificar que esten instalados los programas puede usar los suguientes comandos
  
   + mvn --version
    
   + git --version
    
   + java --version
       
# Ejecucion del proyecto

  Para empezar debemos clonar el repositorio con el siguiente comando:

    git clone https://github.com/camilaFetecua/TableroSeguro.git
  
  Para ejecutar el proyecto debemos ejecutar el siguiente comando 
   
     mvn package
    
   Despues de ejecutar el anterior comando se debe ejecutar el siguiente comando para ejecutar el programa 
    
    java -cp "target/classes;target/dependency/*" co.edu.escuelaing.interactivebalckboardlife.BBAppStarter
    
         
# Diagrama de clases  

![Imagen]()

  Para este proyecto utilizamos:
  + **React.Component:** Para dubujar el tablero.
  + **Editor:** Para el nombre del dibujante.
  + **Canvas:** Permite al usuario dibujar y verel dibujo de otro usuario.
  + **WSBBChannel:** Es el canal que realiza la comunicacion con el back y envia los dibujado por el 
  usuario para poder verlo en el otro tablero.
  + **WBAppController:** Es la clase que principal donde se corre la aplicacion y todas las demas dependencias.
  + **BBEndpoint:** Clase encargada de recibir los mensajes y enviarlos para que sean dibujados.
  + **BBConfiguration:** Clase que exporta datos. 
  
 # Pruebas 
 
 Para pruebas utilizamos el despliegue en Heroku ingresando al siguiente link https://tablero-seguroarsw2021i.herokuapp.com/
  
 
 


# Tecnologias Utilizadas

+ Heroku
+ Springboot
+ React
+ P5.js
+ Maven
+ Java

# Licencia

  Para consultar la Licencia del proyecto haga [click aqui]()
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 

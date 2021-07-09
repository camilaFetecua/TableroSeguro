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
   
     java -cp "target/classes;target/dependency/*" co.edu.escuelaing.InteractiveBlackBoardLife.BBAppStarter
    
         
# Diagrama de clases  

![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Diagrama%20de%20clases.JPG)

  Para este proyecto utilizamos:
  
  
 # Pruebas 
 
 Para pruebas utilizamos el despliegue en Heroku ingresando al siguiente link https://tablero-seguroarsw2021i.herokuapp.com/
 
   Encontraremos un saludo y un link para ingresar
 
   ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba1.JPG)
   
   Al ingresar al link encontramos el login ,donde prondremos el usuario(user) y la contraseña(password) y damos clic en el boton de Sign In 
   
   ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba2.JPG)
   
   Al ingresar encontramos el nombre del usuario y el espacio del tablero para iniciar con el dibujo. 
   
  ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba6.JPG)
  
  Repetimos los pasos para el siguiente usuario , pero esta vez con el usuario(user2) y la contraseña(password2)
  
   ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba3.JPG)
   
  Podemos observar que nos abre otro espacion con nuestro nombre y el tablero para hacer el dibujo 
  
  ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba5.JPG)
  
  Y podemos observar que podemos ver el dibujo del otro usuario en la otra pantalla 
  
   ![Imagen](https://github.com/camilaFetecua/TableroSeguro/blob/master/Imagenes/Prueba7.JPG)
  

# Tecnologias Utilizadas

+ Heroku
+ Springboot
+ React
+ P5.js
+ Maven
+ Java

# Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/TableroSeguro/blob/master/LICENSE.md)
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 

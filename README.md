# Juego Picas y famas 
## Taller ARSW 2021-i / 21 Junio del 2021

  

# Prerequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
  Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    +java --version
       
# Ejecucion del proyecto

  Para empezar debemos clonar el repositorio con el siguiente comando:

     git clone https://github.com/camilaFetecua/Picas-y-Famas-.git

  
  Debemos ir al directorio raiz y se debe ejecutar el comando:
 
       mvn package
  
   
  Para ejecutar el proyecto se debe utilizar el siguiente comando 

   java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arsw.PicasYFamas
     
 
      
# Diagrama de clases  


![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/Diagrama%20de%20clases.PNG)

  Para este proyecto usamos solo una clase PicasYFamasApplication, donde implementamos el juego. 
  
 # Pruebas 
 
 Para pruebas usamos la aplicacion intentando adivina un numero aleatorio que nos da el sistema 
 
 ![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/Juego.PNG)

Entonces empamos a escribir un numero para empezar a adivinar en este caso pusimos el 5 y nos arrojo una pista, que es que tiene una fama
 
 ![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/pista1.PNG)
 
De segundas pusimos el numero 0 , y no nos arrojo ninguna pista que es que tiene una pica

 ![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/piesta2.PNG)

Y asi sucesivamente pusimos el numero 50 , hasta que llegamos al numero 5047 con todas las pistas y nos arroja el mensaje de que adivinamos el numero.

 ![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/pista3.PNG)
 ![Imagen](https://github.com/camilaFetecua/Picas-y-Famas-/blob/master/Imagenes/pista4.PNG)
 
# Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/ServidorConcurrente/blob/master/LICENSE.md)
  
  
# Autor 
  **Maria Camila Fetecua Garcia**  LOCS/HORA 180/6= 30 LOCS/Hora 


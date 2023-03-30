package treesenraya;
/**

La clase Jugador representa a un jugador del juego "Tres en Raya".

Contiene los atributos nombre y simbolo.
*/
public class Jugador {

/**

Nombre del jugador.
*/
private String nombre;
/**

Simbolo que representa al jugador en el juego (X o O).
*/
private char simbolo;
/**

Constructor de la clase Jugador.
@param nombre Nombre del jugador.
@param simbolo Simbolo que representa al jugador en el juego (X o O).
*/
public Jugador(String nombre, char simbolo) {
this.nombre = nombre;
this.simbolo = simbolo;
}
/**

Retorna el nombre del jugador.
@return Nombre del jugador.
*/
public String getNombre() {
return nombre;
}
/**

Establece el nombre del jugador.
@param nombre Nombre del jugador.
*/
public void setNombre(String nombre) {
this.nombre = nombre;
}
/**

Retorna el simbolo del jugador.
@return Simbolo que representa al jugador en el juego (X o O).
*/
public char getSimbolo() {
return simbolo;
}
/**

Establece el simbolo del jugador.
@param simbolo Simbolo que representa al jugador en el juego (X o O).
*/
public void setSimbolo(char simbolo) {
this.simbolo = simbolo;
}
}

package treesenraya;
/**

La clase Celda representa una celda en un juego de tres en raya.

Cada celda tiene un valor (representado por un car que son X y O), una fila, una columna y un estado de ocupación.
*/
public class Celda {

private char valor;
private int fila;
private int columna;
public boolean ocupada;

/**

Constructor por defecto que inicializa el valor de la celda como un espacio en blanco y su estado de ocupación como falso.
*/
public Celda() {
this.valor = ' ';
this.ocupada = false;
}
/**

Devuelve el valor de la celda.
@return el valor de la celda como un carácter.
*/
public char getValor() {
return valor;
}
/**

Establece el valor de la celda.
@param valor el valor de la celda como un carácter.
*/
public void setValor(char valor) {
this.valor = valor;
}
/**

Devuelve la fila de la celda.
@return la fila de la celda como un entero.
*/
public int getFila() {
return fila;
}
/**

Establece la fila de la celda.
@param fila la fila de la celda como un entero.
*/
public void setFila(int fila) {
this.fila = fila;
}
/**

Devuelve la columna de la celda.
@return la columna de la celda como un entero.
*/
public int getColumna() {
return columna;
}
/**

Establece la columna de la celda.
@param columna la columna de la celda como un entero.
*/
public void setColumna(int columna) {
this.columna = columna;
}
/**

Devuelve el estado de ocupación de la celda.
@return true si la celda está ocupada, false si no lo está.
*/
public boolean isOcupada() {
return ocupada=true;
}
/**

Establece el estado de ocupación de la celda.
@param ocupada el estado de ocupación de la celda como un booleano.
*/
public void setOcupada(boolean ocupada) {
this.ocupada = ocupada;
}
}

/**
La clase "tablero" representa el tablero del juego "tres en raya". Contiene una lista de celdas que representan cada posición del tablero.
*/
package treesenraya;
import java.util.ArrayList;


public class tablero {
	
	/**
	 * Lista de celdas que representan cada posición del tablero.
	 */
	ArrayList<Celda> tablero = new ArrayList<Celda>();

	/**
	 * Booleano que indica si se debe apagar el juego.
	 */
	boolean apagar = false;

	/**
	 * Constructor de la clase. Inicializa el tablero con 9 celdas vacías.
	 */
	public tablero() {
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
		tablero.add(new Celda());
	}

	/**
	 * Método que devuelve el tablero.
	 * @return ArrayList de Celdas que representan cada posición del tablero.
	 */
	public ArrayList<Celda> getTablero() {
		return tablero;
	}

	/**
	 * Método que establece el tablero.
	 * @param tablero ArrayList de Celdas que representan cada posición del tablero.
	 */
	public void setTablero(ArrayList<Celda> tablero) {
		this.tablero = tablero;
	}

	/**
	 * Método que devuelve el valor de la variable "apagar".
	 * @return Booleano que indica si se debe apagar el juego.
	 */
	public boolean isApagar() {
		return apagar;
	}

	/**
	 * Método que establece el valor de la variable "apagar".
	 * @param apagar Booleano que indica si se debe apagar el juego.
	 */
	public void setApagar(boolean apagar) {
		this.apagar = apagar;
	}

	/**
	 * Método que agrega un símbolo en una casilla del tablero.
	 * @param lugar La posición de la casilla en la que se agregará el símbolo.
	 * @param simbolo El símbolo que se agregará en la casilla.
	 */
	public void meter(int lugar, char simbolo) {
		tablero.set(lugar, tablero.get(lugar)).setValor(simbolo);
	}

	/**
	 * Método que verifica si el tablero está lleno, es decir, si todas las casillas están ocupadas.
	 * @return Un valor booleano que indica si el tablero está lleno.
	 */
	public boolean tablerolleno() {
		boolean lleno = true;
		for (int i = 0; i < tablero.size(); i++) {
			if (tablero.get(i) == null) {
				lleno = false;
			}
		}
		return lleno;
	}

	/**

	Método que comprueba si un símbolo ha ganado en el tablero.
	@param simbolo El símbolo a comprobar (X o O).
	@return true si el símbolo ha ganado, false en caso contrario.
	*/
	public boolean comprobar(char simbolo) {
		boolean ganador=false;
		if(Comprobarfila(simbolo) || Comprobarcolumna(simbolo) || Comprobardiagonales(simbolo)) {
			System.out.println("Has ganado " + simbolo);
			ganador=true;
		}
		return ganador;
	}
	/**
	Método que comprueba si un número introducido está dentro del rango permitido.
	@param numero El número a comprobar.
	@return true si el número está fuera del rango, false en caso contrario.
	*/
	public boolean numeroerroneo(int numero) {
		boolean erroneo=false;
		if (numero < 0 || numero > 8) {
			System.out.println("No puedes introducir ese numero , introduce uno valido del 0-8");
			erroneo=true;
		}

		return erroneo;
	}
	
	/**
	Metodo que devuelve una cadena con el estado actual del tablero.
	@return el tablero.
	*/

	public String toString() {
		String imprimir = "";
		for (int i = 0; i <9; i++) {
			imprimir += tablero.get(i).getValor() + "";
			if(i== 2 || i==5 || i==8) {
				imprimir+="\n";
			}else {
			imprimir+="|";
			}
			
		}
		return imprimir;
	}

	public int size() {
		
		return tablero.size();
	}
	/**

	Método que comprueba si una casilla está ocupada por una ficha.
	@param posicion La posición de la casilla a comprobar.
	@return true si la casilla está ocupada, false en caso contrario.
	*/
	public boolean casillaOcupada(int posicion) {
	     boolean ocupada =false;
		if (tablero.get(posicion).getValor() == 'X' || tablero.get(posicion).getValor() == 'O' ) {
			System.out.println("Introduce una posicion que no este ocupada");
			ocupada=true;
		}
		return ocupada ;
	}
	/**

	Método que comprueba si hay una fila completa del mismo símbolo en el tablero.
	@param simbolo El simbolo a comprobar (X o O en este caso ya que lo seleccionamos anteriormente).
	@return true si hay una fila completa, false en caso contrario.
	*/
	public boolean Comprobarfila(char simbolo) {
		boolean comprobar=false;
		for (int i = 0; i <7; i+=3) {
			if(tablero.get(i).getValor() == simbolo && tablero.get(i+1).getValor() == simbolo && tablero.get(i+2).getValor() == simbolo) {
				comprobar =true;
				System.out.println("fila");
			}
			
		}
		return comprobar;
	}
	/**
	Metodo que comprueba si hay una columna completa del mismo símbolo en el tablero.
	@param simbolo El símbolo a comprobar (X o O en este caso ya que lo seleccionamos anteriormente).
	@return true si hay una columna completa, false en caso contrario.
	*/
		public boolean Comprobarcolumna(char simbolo) {
			boolean comprobar=false;
			for (int i = 0; i <3; i++) {
				if(tablero.get(i).getValor() == simbolo && tablero.get(i+3).getValor() == simbolo && tablero.get((i+3)+3).getValor() == simbolo) {
					comprobar =true;
					
					
				}
				
			}
			return comprobar;
			
	}
		/**

		Método que comprueba si hay una diagonal completa del mismo símbolo en el tablero.
		@param simbolo El simbolo a comprobar (X o O en este caso ya que lo seleccionamos anteriormente).
		@return true si hay una diagonal completa, false en caso contrario.
		*/
		public boolean Comprobardiagonales(char simbolo) {
			boolean comprobar=false;
			for (int i = 0; i <9; i++) {
				if(i==0) {
					if(tablero.get(i).getValor() == simbolo && tablero.get(i+4).getValor() == simbolo && tablero.get((i+4)+4).getValor() == simbolo) {
						comprobar =true;
						
				}
				}
					
				}
			if(tablero.get(2).getValor() == simbolo && tablero.get(4).getValor() == simbolo
					&& tablero.get(6).getValor() == simbolo) {
				comprobar=true;
				
			}
				return comprobar;
				
			}
			
		
		}



	
	



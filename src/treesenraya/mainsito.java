package treesenraya;
/*
 * Este es el main donde se inicializa el juego (tres en raya).
 * @author Javier Ferrer Diaz.
 *  Documentacion por parte de JAvier Ferrer Diaz y Diego Gualda De Marco.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
	public class mainsito {
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";
		public static void main(String[] args) {
			boolean jugarDeNuevo = true;
			while (jugarDeNuevo) {
				System.out.println(" 😱" + " TIC TAC TOE " +" 😱 "+ "\n");
				
				int aux = 0;
				tablero tbl = new tablero();
				Jugador j1 = new Jugador("Diego", 'X');
				Jugador j2 = new Jugador("Javier", 'O');
				Scanner sc = new Scanner(System.in);
				
				
				for (int i = 0; i <9; i++) {
					aux++;
					System.out.println(ANSI_WHITE +tbl.toString());
					if (tbl.apagar == true) {
						break;
						
					}
					char turno ;
					
					if (i % 2 == 0) {
						System.err.println(ANSI_GREEN +"Turno del Jugador1" + "\033[0m" + "\n");
						turno = j1.getSimbolo();
					} else {
						System.out.println(ANSI_YELLOW+"Turno del Jugador2" + "\n");
						turno = j2.getSimbolo();
					}
					
					int posi = -1;
					
					boolean valid = false;
					while (!valid){
						System.out.println("Dime donde te la meto (Numeros del 0-8) ");
						try {
							posi = sc.nextInt();
							valid = true;
						}
						catch(InputMismatchException ex){
							System.err.println("TUS MUERTOS");
							sc.next();
						}
					}
					
					while(tbl.numeroerroneo(posi)) {
						posi = sc.nextInt();
					}
					
					while(tbl.casillaOcupada(posi)) {
						posi = sc.nextInt();
					}
					
					
					
					
					if(aux==9 && tbl.comprobar(turno)) {
						System.out.println("Empate");
						System.out.println(tbl.toString());
						tbl.apagar=true;
						break;
					}
					
					
					tbl.meter(posi, turno);
					
					if(tbl.comprobar(turno)==true) {
						System.out.println(tbl.toString());
						break;
					}
					System.out.println(aux);
					
					
				}
				System.out.println("¿Quieres jugar de nuevo? (S/N)");
				String respuesta = sc.next();
				if (respuesta.equalsIgnoreCase("N")) {
					jugarDeNuevo = false;
				}
			}

		}
	}


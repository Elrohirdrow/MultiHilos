package supermercado;

/* Cajero.java
 * 
 * Comentario
 * ----------
 * Clase que representa los cajeros del supermercado. Se encarga de atender a los clientes de la cola.
 * 
 * 
 * Propiedades
 * -----------
 * 	idCajero: 		Básica 		- Entero			- De clase 			- Consultable
 * 
 * Funcionalidades
 * ---------------
 * 
 * Consideraciones
 * ---------------
 * 
 * Restricciones
 * -------------
 * 
 * 
 * Interfaz de clase
 * *---------------*
 * int getIdCajero()
 * 
 */

public class Cajero {
	Cola c;
	
	//Constructor
	public Cajero(Cola c) {
		this.c = c;
	}
	
	/* void run()
	 * 
	 * Comentario: Se ejecuta un hilo de la clase Cajero.
	 * Precondicion: Nada
	 * Entrada: Nada
	 * Salida: Nada
	 * Postcondición: El hilo Cajero pasa a ejecucion. Un cliente es eliminado de la cola. 
	 * 
	 */
	public void run() {
		while (true) {
			c.sacarClienteEnCola();
		}
	}
}

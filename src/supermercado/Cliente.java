package supermercado;

/* Cliente.java
 * 
 * Comentario
 * ----------
 * Clase que representa los clientes del supermercado. Se encarga de calcular el
 * tiempo de compra y pago así como de añadirse a la cola.
 * 
 * 
 * Propiedades
 * -----------
 * 	tiempoCompra: 	Derivada	- Entero 			- De instancia 		- Consultable
 * 	tiempoPago: 	Derivada 	- Entero			- De instancia 		- Consultable
 * 
 * Funcionalidades
 * ---------------
 * 	entero calculaTiempoCompra()
 * 	entero calculaTiempopago()
 * 
 * Consideraciones
 * ---------------
 * El tiempo de compra variará entre 5 y 60 minutos.
 * El tiempo de pago variará entre el tiempo de compra dividido por 60 y 10.
 * Todo se trabajará en milisegundos
 * 
 * Restricciones
 * -------------
 * 
 * 
 * Interfaz de clase
 * *---------------*
 * int getTiempoCompra()
 * int getTiempoPago()
 * private int calculaTiempoCompra()
 * private int calculaTiempoPago()
 * 
 */

import java.util.Random;

public class Cliente {
	private int tiempoCompra, tiempoPago;
	private Cola c;
	
	//Constructor
	public Cliente(Cola c) { 
		tiempoCompra = calculaTiempoCompra();
		tiempoPago = calculaTiempoPago(tiempoCompra);
		this.c = c;
	}
	
	//Get
	public int getTiempoCompra() {
		return tiempoCompra;
	}

	public int getTiempoPago() {
		return tiempoPago;
	}
	
	/* private int calculaTiempoCompra()
	 * 
	 * Comentario: Genera un número entero para representar el tiempo de compra del cliente
	 * Precondición: Nada
	 * Entrada: Nada
	 * Salida: Número entero
	 * Postcondición: Se devuelve un entero asociado al nombre. Este representa el tiempo de compra
	 * 
	 */
	private int calculaTiempoCompra() {
		Random rnd = new Random();
		int tiempo;
		
		tiempo = rnd.nextInt(60 - 5) + 5;
		return tiempo;
	}
	
	/* private int calculaTiempoPago(int tiempoCompra)
	 * 
	 * Comentario: Calcula el tiempo de pago del cliente en función del tiempo de compra
	 * Precondición: Nada
	 * Entrada: Número entero (tiempo de compra del cliente)
	 * Salida: Número entero
	 * Postcondición: Se devuelve un entero asociado al nombre. Este representa el tiempo de pago 
	 * 
	 */
	private int calculaTiempoPago(int tiempoCompra) {
		Random rnd = new Random();
		int tiempo, divisor;
		divisor = rnd.nextInt(60 - 10) + 10;
		tiempo = tiempoCompra/divisor;
		
		return tiempo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cliente [tiempoCompra=" + tiempoCompra + ", tiempoPago=" + tiempoPago + "]";
	}
	
	/* void run()
	 * 
	 * Comentario: Ejecuta un hilo de la clase Cliente. Este cliente se añade a la cola,
	 * Precondicion: Nada
	 * Entrada: Nada
	 * Salida: Nada
	 * Postcondicion: El hilo es ejecutado. El cliente queda almacenado en la cola.
	 * 
	 */
	public void run() {
		while (true) {
			c.ponerClienteEnCola(this);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Hilo cliente no se ha dormido" + this);
				//e.printStackTrace();
			}
		}
	}
}

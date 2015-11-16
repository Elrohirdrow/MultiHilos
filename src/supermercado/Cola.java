package supermercado;

import java.util.ArrayList;

/* Cola.java
 * 
 * Comentario
 * ----------
 * Clase que representa la cola del supermercado. Se encarga de almacenar clientes. Los guarda hasta
 * el momento en que la clase Cajero los solicita.
 * 
 * 
 * Propiedades
 * -----------
 * 	colaCliente: 	Básica		- ArrayList<Cliente> 	- De instancia 		- Consultable y modificable
 * 
 * Funcionalidades
 * ---------------
 * 	nada ponerClienteEnCola()
 * 	nada sacarClienteEnCola()
 * 
 * Consideraciones
 * ---------------
 * !!!!!!!!!!!!!!!!!!!!!!!!PUEDE QUE EL SET-ARRAY SOBRE!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * Restricciones
 * -------------
 * 
 * 
 * Interfaz de clase
 * *---------------*
 * ArrayList<Cliente> getColaCliente()
 * void setColaCliente(ArrayList<Cliente> colaClientes)
 * void ponerClienteEnCola(Cliente cliente)
 * void sacarClienteEnCola()
 * 
 */

public class Cola {
	private ArrayList<Cliente> colaClientes;
	
	//Constructor por defecto
	public Cola() { 
		colaClientes = new ArrayList<Cliente>();
	}
	
	//Get
	public ArrayList<Cliente> getColaCliente() {
		return colaClientes;
	}
	
	//Set
	public void setColaCliente(ArrayList<Cliente> colaClientes) {
		this.colaClientes = colaClientes;
	}
	
	/* void ponerClienteEnCola(Cliente cliente)
	 * 
	 * Comentario: Dado un cliente lo añadirá a la cola
	 * Precondición: Nada
	 * Entrada: Un objeto tipo Cliente
	 * Salida: Nada
	 * Postcondición: El objeto Cliente queda almacenado en nuestra cola
	 * 
	 */
	public void ponerClienteEnCola(Cliente cliente) {
		//Prueba previa
		//System.out.println("Clientes en cola: " + colaClientes.size());
		if (cliente != null) {
			this.colaClientes.add(cliente);
		}		
		//Prueba para comprobar el número de clientes (Pasar esto a una clase aparte más tarde)
		//System.out.println("Se ha añadido un cliente, número de clientes en cola: " + colaClientes.size());
	}
	
	/* void sacarClienteEnCola()
	 * 
	 * Comentario: Se elimina el primer cliente de la cola
	 * Precondición: Nada
	 * Entrada: Nada
	 * Salida: Nada
	 * Postcondición: Se elimina el primer objeto Cliente de la cola y se avanza la cola
	 * 
	 */
	public void sacarClienteEnCola() {
		if (colaClientes.isEmpty() != true) {
			this.colaClientes.remove(0);
		}
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("El hilo cajero no se ha puesto en espera");
			//e.printStackTrace();
		}
	}
	
	/* int tamanoCola()
	 * 
	 * Comentario: Devuelve el tamaño de la cola.
	 * Precondicion Nada
	 * Entrada: Nada
	 * Salida: Un entero.
	 * Postcondicin: Se devuelve un entero asociado al nombre. Este número representa el tamaño actual de la cola.
	 * 
	 */
	public int tamanoCola() {		
		return colaClientes.size();
	}
}

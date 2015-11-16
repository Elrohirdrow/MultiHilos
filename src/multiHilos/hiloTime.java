package multiHilos;


public class hiloTime extends Thread {
	private String nombre;
	private Integer semaforo;

	//Constructor con parametros
	public hiloTime(String nombre, Integer semaforo) {
		this.nombre = nombre;
		this.semaforo = semaforo;
	}

	@Override
	public void run (){	   
		synchronized (semaforo) {
			try {
				if (semaforo > 0) {
					semaforo.wait();
				}
				semaforo++;
				System.out.println("Hola. Soy el hilo " + nombre);
				System.out.println();
				for(int cont=0;cont<100;cont++){
					System.out.println(cont + " - Me pido " + nombre + ".");
					System.out.println();
					System.out.println("¿Quién ha ganado?");
					System.out.println();
					if (cont % 2 == 0) {
						System.out.println("Gano yo.");
						System.out.println();
					} else  {
						System.out.println("Ganas tu.");
						System.out.println();
					}//fin_if
				}//fin_for
				System.out.println(nombre + " ha terminado su trabajo.");
				System.out.println();
				semaforo--;
				semaforo.notify();
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}//fin_synchronized
	}
}

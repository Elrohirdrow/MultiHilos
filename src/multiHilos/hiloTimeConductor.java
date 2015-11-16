package multiHilos;


public class hiloTimeConductor {
    public static void main(String[] args) {    
    	Integer semaforo = 0;
    	
        hiloTime hiloPares = new hiloTime("Pares", semaforo);
        hiloTime hiloNones = new hiloTime("Nones", semaforo);
        hiloPares.start();
        System.out.println("Pareeeeeeeeeeeeees!!!");
        System.out.println("Noneeeeeeeeeeeeees!!!");
        hiloNones.start();
    }
}
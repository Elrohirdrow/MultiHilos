package hilosBolsaLuisCorregido;

public class HiloCliente extends Thread {

    Bolsa bolsa;

    public HiloCliente(Bolsa b) {
        bolsa = b;
    }

    public void run() {
        while (true) {
            
            bolsa.addElemento();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }

}

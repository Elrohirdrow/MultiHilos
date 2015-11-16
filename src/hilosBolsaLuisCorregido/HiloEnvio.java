package hilosBolsaLuisCorregido;

public class HiloEnvio extends Thread {

    Bolsa bolsa;

    public HiloEnvio(Bolsa b) {
        bolsa = b;
    }

    public void run() {
        while (true) {
            
            bolsa.enviar();

        }
    }
}

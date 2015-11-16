package hilosBolsaLuisCorregido;

public class PruebaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        HiloCliente hc=new HiloCliente(bolsa);
        HiloEnvio he=new HiloEnvio(bolsa);
        hc.start();
        he.start();
    }

}

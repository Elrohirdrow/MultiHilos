package hilosBolsaLuisCorregido;

public class Bolsa {
    int elementos;
    public Bolsa(){
        elementos=0;
    }
    public synchronized void addElemento() {
        if(estaLLena()){
           notify();
        }
        else{
            elementos=elementos+1;
            System.out.println("Elemento añadido "+elementos);
        }
    }
    public boolean estaLLena(){
        boolean estaLlena;
        if(elementos==5){
            estaLlena=true;
        }
        else{
            estaLlena=false;
        }
        return estaLlena;
    }
    public synchronized void enviar() {
        System.out.println("lo ke sea");
        if(estaLLena()){
            System.out.println("Bolsa enviada");
            this.vaciar();
        }
        try {
            wait();
        } catch (InterruptedException ex) {
            
        }
        
            
    }
        
    
    public void vaciar(){
        elementos=0;
        System.out.println("Se ha vaciado la bolsa");
    }
}

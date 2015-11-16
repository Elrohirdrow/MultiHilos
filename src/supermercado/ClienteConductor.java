package supermercado;

public class ClienteConductor {

	public static void main(String[] args) {
		Cola c = new Cola();
		Cliente cliente1 = new Cliente(c);
		
		for (int i = 0; i < 50; i++) {
			cliente1 = new Cliente(c);
			System.out.println(cliente1);
		}
		
		System.out.println("Get tiempo de compra: " + cliente1.getTiempoCompra());
		System.out.println("Get tiempo de venta: " + cliente1.getTiempoPago());
	}
}

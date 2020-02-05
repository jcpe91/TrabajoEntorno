public class Principal {

	public static void main(String[] args) {
		ITarjetaMonedero monedero = new Tarjeta("13247453753", "29553065C", 1594, 200);
		ITarjetaDebito tarjeta = new Tarjeta("1324567985", "29556545T", 1326, 200000);

		// vamos al foster, nos cuesta 100€
		System.out.println("Pagando con tarjeta...");
		tarjeta.comprar(100, "29556545T");
		
		System.out.println("Importe Foster Hollywood 100€...");
		System.out.println("");
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
		System.out.println("Pagando con monedero...");
	}
}
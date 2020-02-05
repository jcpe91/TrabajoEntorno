public class Principal {

	public static void main(String[] args) {
		ITarjetaMonedero monedero = new Tarjeta("13247453753", "29553065C", 1594, 200);
		ITarjetaDebito tarjeta = new Tarjeta("1324567985", "29556545T", 1326, 200000);

		// prueba de compra con tarjeta debito 100€
		System.out.println("El saldo actual de tarjeta de Debito es: " + tarjeta.getSaldo());
		System.out.println("Pagando con tarjeta...");
		System.out.println("Importe Foster Hollywood 100€...");
		tarjeta.comprar(100, 1326);
		System.out.println("El saldo actual de tarjeta de Debito es: " + tarjeta.getSaldo()+"\n");
		
		// prueba de compra con tarjeta monedero 50€
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
		System.out.println("Pagando con monedero...");
		System.out.println("Mostrando el DNI del titular...");
		System.out.println("El dni del titular del monedero es: " + monedero.getDniTitular());
		System.out.println("Importe compra 50€..."+"\n");
		monedero.comprarMonedero(50, "29553065C");
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
	}
}
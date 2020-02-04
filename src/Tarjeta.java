public class Tarjeta implements ITarjetaMonedero, ITarjetaDebito {
	private String id;
	private String dniTitular;
	private int pin;
	private float saldo;
	
	public Tarjeta(String id, String dniTitular, int pin, float saldo) {
		setId(id);
		setDniTitular(dniTitular);
		setPin(pin);
		setSaldo(saldo);

	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;

	}
}

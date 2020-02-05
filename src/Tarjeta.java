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

	public void setId(String id) {
		this.id = id;

	}

	@Override
	public void retirarCajero(float importe, int pin) {
		if (this.pin == pin && importe > 0) {
			setSaldo(getSaldo() - importe);
		}

	}

	@Override
	public void comprar(float importe, int pin) {
		if (this.pin == pin && importe > 0) {
			setSaldo(getSaldo() - importe);
		}
	}
	

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	@Override
	public int getSaldo() {
		return (int) saldo;
	}

	@Override
	public void setPin(int num) {
		this.pin = num;

	}

}

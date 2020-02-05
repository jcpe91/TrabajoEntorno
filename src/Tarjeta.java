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

	private boolean cargo(float importe) {
		boolean resultado = false;
		if(importe>0) {
			resultado=true;
		}
		return resultado;
	}
	@Override
	public void retirarCajero(float importe, int pin) {
		if(this.pin==pin && importe >0) {
		setSaldo(getSaldo()-importe);
		}

	}

	@Override
	public void comprar(float importe, String dni) {
		if(this.dniTitular==dni && importe>0) {
			setSaldo(getSaldo()-importe);
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
		this.dniTitular=dniTitular;
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

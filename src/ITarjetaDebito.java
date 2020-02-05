
public interface ITarjetaDebito {
	public void comprar(float importe, int pin);

	public void retirarCajero(float importe, int pin);
	
	public String getId();
	
	public String getDniTitular();

	public int getSaldo();

	public void setPin(int pin);

}

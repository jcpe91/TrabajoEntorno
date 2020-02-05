
public interface ITarjetaMonedero {
	public void comprarMonedero(float importe, String dni);

	public String getId();

	public String getDniTitular();

	public int getSaldo();

	public void setPin(int num);

}


public interface ITarjetaMonedero {
	public void comprar(float importe, String dni);

	public String getId();

	public String getDniTitular();

	public int getSaldo();

	public void setPin(int num);

}

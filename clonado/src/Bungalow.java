
public class Bungalow extends Alojamiento{

	private int superficiePorche;
		
	

	public Bungalow(String codigo, int numPlazas, int suplemento, int superficiePorche) {
		super(codigo, numPlazas, suplemento);
		this.superficiePorche = superficiePorche;
	}

	// En los bungalows se suma el suplemento multiplicado por el número de plazas independientemente de los días que se hayan alquilado
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Superficie del porche:", superficiePorche);
	}
}

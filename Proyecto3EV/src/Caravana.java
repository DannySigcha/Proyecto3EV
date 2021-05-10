
public class Caravana extends Alojamiento{

	int pesoMaximo;

	

	public Caravana(String codigo, int numPlazas, int suplemento, int pesoMaximo) {
		super(codigo, numPlazas, suplemento);
		this.pesoMaximo = pesoMaximo;
	}

	// A las caravanas se les suma el suplemento multiplicado por el número de plazas y los días de alquiler
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas()*dias;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "PesoMaximo:",pesoMaximo);
	}
	
}

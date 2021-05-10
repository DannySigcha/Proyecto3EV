
public class Apartamento extends Alojamiento{

	private int gastosComunidad;
	
	

	public Apartamento(String codigo, int numPlazas, int gastosComunidad) {
		super(codigo, numPlazas, 0);
		this.gastosComunidad = gastosComunidad;
	}

	// En los apartamentos se calcula el suplemento por d�a
	// dividiendo la cuota mensual de los gastos de comunidad por 30 y multiplicarla por el n�mero de d�as que se han alquilado
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + (double)gastosComunidad*dias/30;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Gastos de comunidad:", gastosComunidad);
	}
}

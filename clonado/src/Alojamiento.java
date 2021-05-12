
public abstract class Alojamiento {
	private String codigo;
	private static final int PRECIO_POR_DIA = 50;
	private int numPlazas;
	private int suplemento;
	
	public Alojamiento(String codigo, int numPlazas, int suplemento) {
		super();
		this.codigo = codigo;
		this.numPlazas = numPlazas;
		this.suplemento = suplemento;
	}

	public abstract double  precioAPagar(int dias);
	
	public String getCodigo() {
		return codigo;
	}

	public static int getPrecioPorDia() {
		return PRECIO_POR_DIA;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public int getSuplemento() {
		return suplemento;
	}

	@Override
	public String toString() {
		return String.format("codigo: %-8s, precio por dia:%3d, plazas:%3d", codigo, PRECIO_POR_DIA, numPlazas);
	}
	
	
}

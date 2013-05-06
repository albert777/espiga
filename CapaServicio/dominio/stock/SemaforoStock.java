package stock;


public enum SemaforoStock {

	VERDE("�ptimo"),
	AMARILLO("Regular"),
	ROJO("Cr�tico");
	
	private String nombre;
	
	SemaforoStock(String nombre) {
		this.nombre = nombre;		
	}
	
	public String getNombre() {
		return nombre;
	}	
	
}

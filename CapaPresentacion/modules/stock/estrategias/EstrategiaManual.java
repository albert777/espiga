package stock.estrategias;

public class EstrategiaManual extends EstrategiaRenderer{

	@Override
	public void render() {
		super.addLine("Stock M�ximo", "stockMaximo");		
		super.addLine("Punto Reposici�n", "stockReposicion");
	}

	
}

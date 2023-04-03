package comunicacion;

public class Alfabeto extends Pictograma {
	private static String letras[];
	private String interpretacion;
	
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.setInterpretacion(interpretacion);
		
	}
	
	public Alfabeto() {
		this("", "");
	}
	
	public int cantidadLetras() {return letras.length;}
	public String interpretacion() {return this.interpretacion;}
	public String toString() {
		String r = "";
		for (String letra: letras) {
			r = r + letra + ", ";
		}
		String res = r.substring(0, r.length() - 2);
		return res;
	}
	

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String letras[]) {
		Alfabeto.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}

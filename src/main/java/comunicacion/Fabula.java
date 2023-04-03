package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setEnsenanza(ensenanza);
		this.setInterpretacion(interpretacion);
	}
	
	public Fabula() {
		this("", "", "", 0, "", "");
	}
	
	public String interpretacion() {return this.interpretacion;}
	public String toString() {
		String r = "";
		
		r += super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
		r += super.getPaginas() + "\n";
		r += this.getEnsenanza();
		
		return r;}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 1;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}

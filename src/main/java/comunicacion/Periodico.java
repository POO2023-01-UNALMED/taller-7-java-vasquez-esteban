package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, 
			String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setFecha(fecha);
		this.setPrimicia(primicia);
		this.setInterpretacion(interpretacion);
	}
	
	public Periodico() {
		this("", "", "", 0, "", "", "");
	}
	
	public String interpretacion() {return this.interpretacion;}
	public String toString() {
		String r = "";
		
		r += super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
		r += super.getPaginas() + "\n";
		r += this.getFecha() + "\n";
		r += this.getPrimicia();
		
		return r;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 10;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}

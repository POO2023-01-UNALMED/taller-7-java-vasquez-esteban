package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
			String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setCo_autor(co_autor);
		this.setEditorial(editorial);
		this.setEdicion(edicion);
		this.setInterpretacion(interpretacion);
	}
	
	public Libro() {
		this("", "", "", 0, "", "", "", "");
	}
	
	public String interpretacion() {return this.interpretacion;}
	public String toString() {
		String r = "";
		
		r += super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
		r += super.getPaginas() + "\n";
		r += this.getCo_autor() + "\n";
		r += this.getEditorial() + "\n";
		r += this.getEdicion();
		
		return r;
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 2;
	}

	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}

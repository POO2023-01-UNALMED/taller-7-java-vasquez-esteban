package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, 
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setIdea(idea);
		this.setConclusion(conclusion);
		this.setReferencias(referencias);
		this.setInterpretacion(interpretacion);
	}
	
	public Tesis() {
		this("", "", "", 0, "", "", "", "");
	}
	
	public String interpretacion() {return this.interpretacion;}
	public String toString() {
		String r = "\"";
		
		r += super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
		r += super.getPaginas() + "\n";
		r += this.getIdea() + "\n";
		r += Tesis.argumentos.length + "\n";
		r += this.getConclusion() + "\n";
		r += this.getReferencias() + "\n";
		r += this.interpretacion() + "\"\n";
		
		return r;
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 5;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}

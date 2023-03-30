package miprimerproyecto.EjemploObras;

public class Cuadro extends Obra{

	private int largo;
	private int alto;
	
	public Cuadro(String titulo, String autor, int largo, int alto) {
		
		super(titulo, autor);
		this.largo = largo;
		this.alto = alto;		
		
	}
	
	public String getAtributos() {
		return super.getAtributos() + "\n El cuadro mide "+ this.largo +"x"+this.alto;
	}
	
	
}

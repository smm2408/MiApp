package es.iesellago.model;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private char sexo;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.apellido = null;
		this.edad = 0;
	}
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = -1;
		this.sexo = '-';
	}
	public Persona(String nombre, String apellido, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Nombre: " +this.nombre+", apellido: "+this.apellido+", edad: "+this.edad+", sexo: "+this.sexo;
	}
}

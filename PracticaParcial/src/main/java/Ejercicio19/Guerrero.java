package Ejercicio19;

public class Guerrero extends Personaje {
	
	public Guerrero(String nombre) {
		super(nombre);
		this.arma = new Espada();
		this.armadura = new Acero();
		this.habilidad = "Cuerpo a Cuerpo";
	}
}

package Ejercicio19;

public class Arquero extends Personaje{
	
	public Arquero(String nombre) {
		super(nombre);
		this.arma = new Arco();
		this.armadura = new Cuero();
		this.habilidad = "Tiro de flecha";
	}
}

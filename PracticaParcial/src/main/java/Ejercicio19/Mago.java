package Ejercicio19;

public class Mago  extends Personaje{
	
	public Mago(String nombre) {
		super(nombre);
		this.arma = new Baston();
		this.armadura = new Cuero();
		this.habilidad = "Magia";
	}
}

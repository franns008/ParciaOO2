package Ejercicio19;

public abstract class Personaje  {
	protected  Arma arma;
	protected Armadura armadura;
	protected String nombre;
	protected int vida;
	protected String habilidad;
	
	
	public Personaje(String nombre) {
		this.nombre=nombre;
		this.vida=100;
	}
	
	public void atacarA(Personaje p) {
		p.defenderseContra(arma);
	}
	
	public void defenderseContra(Arma arma) {
		this.vida-=this.armadura.defenderseContraArma(arma);
	}
	
	public String vidaActual() {
		return "soy "+this.nombre+" y tengo "+this.vida+" de vida";
	}
}

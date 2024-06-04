package Ejercicio19;

public class CreadorMago extends FactoryPersonaje {
	
	
	public Personaje crearPersonaje(String nombre) {
		return new Mago(nombre);
	}
}

package Ejercicio19;

public class CreadorGuerrero extends FactoryPersonaje{
	
	public Personaje crearPersonaje(String nombre) {
		return new Guerrero(nombre);
	}
}

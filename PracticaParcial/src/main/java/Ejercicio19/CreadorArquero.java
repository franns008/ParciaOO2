package Ejercicio19;

public class CreadorArquero extends FactoryPersonaje{
	
	public Personaje crearPersonaje(String nombre) {
		return new Arquero(nombre);
	}
}

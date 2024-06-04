package Ejercicio19;

public class Espada implements Arma {
	public int pelearContra(Hierro h) {
		return 5;
	}
	public int pelearContra(Cuero c) {
		return 8;
	}
	public int pelearContra(Acero a) {
		return 3;
	}
}

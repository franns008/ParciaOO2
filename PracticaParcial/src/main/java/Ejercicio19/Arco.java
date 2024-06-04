package Ejercicio19;

public class Arco implements Arma {
	public int pelearContra(Hierro h) {
		return 3;
	}
	public int pelearContra(Cuero c) {
		return 5;
	}
	public int pelearContra(Acero a) {
		return 2;
	}
}

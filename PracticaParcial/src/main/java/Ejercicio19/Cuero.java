package Ejercicio19;

public class Cuero extends Armadura {
	public  int defenderseContraArma(Arma arma) {
		return arma.pelearContra(this);
	}
}

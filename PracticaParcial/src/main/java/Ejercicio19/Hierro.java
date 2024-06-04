package Ejercicio19;

public class Hierro extends Armadura {
	public  int defenderseContraArma(Arma arma) {
		return arma.pelearContra(this);
	}
}

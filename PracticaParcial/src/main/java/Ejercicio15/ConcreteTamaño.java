package Ejercicio15;

public class ConcreteTamaño extends Decorator{
	
	
	public ConcreteTamaño(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return this.componente.prettyPrint()+" tamaño:"
		+this.componente.getTamaño();
	}
}

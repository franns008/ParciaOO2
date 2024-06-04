package Ejercicio15;

public class ConcreteExtension extends Decorator {
	
	
	public ConcreteExtension(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return this.componente.prettyPrint()+" extension: "+this.componente.getExtension();
	}
}

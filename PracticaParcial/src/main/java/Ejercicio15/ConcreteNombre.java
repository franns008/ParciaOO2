package Ejercicio15;

public class ConcreteNombre extends Decorator{

	public ConcreteNombre(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return this.componente.prettyPrint()+" nombre: "+this.componente.getNombre();
	}
}

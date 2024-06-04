package Ejercicio15;

public class ConcreteFechaCreacion extends Decorator{

	public ConcreteFechaCreacion(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.componente.prettyPrint()+" fecha creacion: "+
		this.componente.getFechaCreacion();
	}
}

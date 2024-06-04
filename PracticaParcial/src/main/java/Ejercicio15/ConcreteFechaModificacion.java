package Ejercicio15;

public class ConcreteFechaModificacion extends Decorator{
	
	
	
	public ConcreteFechaModificacion(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return this.componente.prettyPrint()+" fecha modificacion: "+this.componente.getFechaModificacion();
	}
}

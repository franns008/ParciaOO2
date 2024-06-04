package Ejercicio15;

public class ConcretePermisos extends Decorator{

	public ConcretePermisos(FileOO2 componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		 return this.componente.prettyPrint() + " permisos: " +
         this.componente.getPermisos();
	}
}

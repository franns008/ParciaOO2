package Ejercicio11;

public class Estado {
	protected Proyecto proyecto;

	public Estado(Proyecto proyecto) {
		super();
		this.proyecto = proyecto;
	}
	
	public void cancelarProyecto() {
		this.proyecto.objetivo="cancelado";
	}
	
	public void modificarMargen(double margen) {
		
	}
	
	public void aprobar() {
		
	}
}

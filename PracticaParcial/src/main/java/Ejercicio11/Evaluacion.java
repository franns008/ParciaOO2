package Ejercicio11;

public class Evaluacion extends Estado {
	
	public Evaluacion(Proyecto proyecto) {
		super(proyecto);
		// TODO Auto-generated constructor stub
	}
	
	public void aprobar() {
		this.proyecto.estado=new Confirmado(this.proyecto);
	}
	
	public void modificarMargen(double margen) {
		if (margen>=0.11 && margen<=0.15) {
			this.proyecto.margenGanancia=margen;
		}
	}
	
}

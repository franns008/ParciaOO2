package Ejercicio11;

public class Construccion extends Estado{

	public Construccion(Proyecto proyecto) {
		super(proyecto);
		// TODO Auto-generated constructor stub
	}
	
	public void aprobar() {
		if(this.proyecto.precioProyecto()!=0) {
			this.proyecto.estado=new Evaluacion(this.proyecto);
		}else {
			throw new RuntimeException("El precio del proyecto no puede ser 0");
		}
	}
	
	public void modificarMargen(double margen) {
		if (margen>=0.08 && margen<=0.1) {
			this.proyecto.margenGanancia=margen;
		}
	}
}

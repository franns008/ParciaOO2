package Ejercicio15;

import java.time.LocalDate;
import java.util.List;

public abstract class Decorator implements FileOO2 {
	protected FileOO2 componente;

	public Decorator(FileOO2 componente) {
		super();
		this.componente = componente;
	}
	
	public String getNombre() {
		return this.componente.getNombre();
	}
	public String getExtension() {
		return this.componente.getExtension();
	}
	public LocalDate getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}
	public LocalDate getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}
	public int getTamaño() {
		return this.componente.getTamaño();
	}
	public String getPermisos(){
		return this.componente.getPermisos();
	}
	public abstract String prettyPrint();
}

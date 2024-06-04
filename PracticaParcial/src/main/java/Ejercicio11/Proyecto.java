package Ejercicio11;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	protected String nombre;
	protected LocalDate fechaIni;
	protected LocalDate fechaFin;
	protected String objetivo;
	protected int numIntegrantes;
	protected double margenGanancia;
	protected Estado estado;
	protected double precioPorIn;
	
	public Proyecto(String nombre,LocalDate fechaIni, 
			LocalDate fechaFin,String objetivo, int numIntegrantes,double precioBase) {
		super();
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.objetivo=objetivo;
		this.numIntegrantes = numIntegrantes;
		this.margenGanancia =0.07;
		this.precioPorIn=precioBase;
		this.estado = new Construccion(this);
	}
	
	public void aprobar() {
		this.estado.aprobar();
	}
	
	public Estado getEstado() {
		return estado;
	}

	public int diasDuracion() {
		return (int) ChronoUnit.DAYS.between(this.fechaIni,this.fechaFin);
	}
	
	public double costoProyecto() {
		return  this.numIntegrantes*this.diasDuracion()*this.precioPorIn;
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto();
	}
	
	
	public void modificarMargen(double margen) {
		this.estado.modificarMargen(margen);
	}
	
	public double precioProyecto() {
		return this.costoProyecto()+this.costoProyecto()*this.margenGanancia;
	}

	public String getObjetivo() {
		return objetivo;
	}
	
	
}

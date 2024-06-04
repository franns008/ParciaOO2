package Ejercicio15;
import java.util.*;
import java.time.LocalDate;

public class Archivo implements FileOO2{
	private int tamaño;
	private String nombre;
	private String extension;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public Archivo(String nombre, String extension,int tamaño,  LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		super();
		this.tamaño = tamaño;
		this.nombre = nombre;
		this.extension = extension;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	
	
	public int getTamaño() {
		return tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public String getPermisos() {
		return permisos;
	}
	
	public String prettyPrint() {
		return "";
	}
}

package Ejercicio15;

import java.time.LocalDate;
import java.util.List;

public interface FileOO2 {
	public String getNombre();
	public String getExtension();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public int getTamaño();
	public String getPermisos();
	public String prettyPrint();
	
}

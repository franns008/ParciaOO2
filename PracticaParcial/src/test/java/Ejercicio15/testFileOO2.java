package Ejercicio15;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testFileOO2 {
	private FileOO2 archivo;
	private FileOO2 nombre;
	private FileOO2	extension;
	private FileOO2 size;
	private FileOO2 dateCreated;
	private FileOO2 dateModified;
	private FileOO2 permissions;
	
	@BeforeEach
	public void setUp() {
		archivo = new Archivo("The Next Best American Record", ".mp3", 10, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
	}
	
	
	@Test
	public void testPrettyPrint() {
		this.nombre = new ConcreteNombre(archivo);
		this.extension = new ConcreteExtension(nombre);
		assertEquals(" nombre: The Next Best American Record extension: .mp3",this.extension.prettyPrint());
		this.dateCreated = new ConcreteFechaCreacion(extension);
		assertEquals(" nombre: The Next Best American Record extension: .mp3 fecha creacion: 2019-08-30",this.dateCreated.prettyPrint());
		this.permissions = new ConcretePermisos(archivo);
		this.nombre = new ConcreteNombre(permissions);
		this.extension = new ConcreteExtension(nombre);
		this.size = new ConcreteTamaño(extension);
		assertEquals(" permisos: rwxr-xr-x nombre: The Next Best American Record extension: .mp3 tamaño:10",this.size.prettyPrint());
		
	}
}

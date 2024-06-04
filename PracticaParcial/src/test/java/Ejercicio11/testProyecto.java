package Ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testProyecto {
	private Proyecto proyecto;
	private Proyecto proyectoPrecio0;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,1500);
		this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,0);
		this.proyecto.aprobar();
	}

	@Test
	public void testAprobarEtapa() {
	    assertTrue(this.proyecto.getEstado() instanceof Evaluacion);
		this.proyecto.aprobar();
		assertTrue(this.proyecto.getEstado() instanceof Confirmado);
		this.proyecto.aprobar();
		assertTrue(this.proyecto.getEstado() instanceof Confirmado);
		
		Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobar();});
	    assertEquals("El precio del proyecto no puede ser 0",exceptionPrecio0.getMessage());
	}
	
	@Test
	public void testCostoYPrecioDelProyecto() {
		assertEquals(45000,this.proyecto.costoProyecto());
		assertEquals(48150,this.proyecto.precioProyecto());
		
		assertEquals(0,this.proyectoPrecio0.costoProyecto());
		assertEquals(0,this.proyectoPrecio0.precioProyecto());
	}
	
	@Test
	public void testModificarMargenDeGanancias() {		
		this.proyecto.modificarMargen(0.10);
		assertEquals(48150,this.proyecto.precioProyecto());
		this.proyecto.modificarMargen(0.16);
		assertEquals(48150,this.proyecto.precioProyecto());
		this.proyecto.modificarMargen(0.11);
		assertEquals(49950,this.proyecto.precioProyecto());
		this.proyecto.modificarMargen(0.15);
		assertEquals(51750,this.proyecto.precioProyecto());
		
		this.proyecto.aprobar();
		this.proyecto.modificarMargen(0.10);
		assertEquals(51750,this.proyecto.precioProyecto());
	}
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals("cancelado",this.proyecto.getObjetivo());
		this.proyecto.cancelarProyecto();
		assertEquals("cancelado",this.proyecto.getObjetivo());
	}

}

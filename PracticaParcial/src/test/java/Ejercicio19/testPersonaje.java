package Ejercicio19;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class testPersonaje {
	
	private Personaje mago;
	private Personaje guerrero;
	private Personaje arquero;
	private CreadorMago creadorMago;
	private CreadorGuerrero creadorGuerrero;
	private CreadorArquero creadorArquero;
	
	@BeforeEach
	public void setUp() {
		creadorArquero = new CreadorArquero();
		arquero = creadorArquero.crearPersonaje("arquero");
		creadorGuerrero = new CreadorGuerrero();
		guerrero = creadorGuerrero.crearPersonaje("guerrero");
		creadorMago = new CreadorMago();
		mago = creadorMago.crearPersonaje("mago");
	}
	@Test
	void testCrearPersonaje() {
		assertEquals("soy mago y tengo 100 de vida",mago.vidaActual());
		assertEquals("soy guerrero y tengo 100 de vida",guerrero.vidaActual());
		assertEquals("soy arquero y tengo 100 de vida",arquero.vidaActual());
	}
	
	@Test
	void peleas() {
		guerrero.atacarA(mago);
		assertEquals("soy mago y tengo 92 de vida",mago.vidaActual());
		mago.atacarA(arquero);
		assertEquals("soy arquero y tengo 98 de vida",arquero.vidaActual());
		arquero.atacarA(guerrero);
		assertEquals("soy guerrero y tengo 98 de vida",guerrero.vidaActual());
	}
}

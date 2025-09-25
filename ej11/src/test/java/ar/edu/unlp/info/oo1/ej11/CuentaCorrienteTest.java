package ar.edu.unlp.info.oo1.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentacorriente;
	
	@BeforeEach
	public void setUp() {
		this.cuentacorriente = new CuentaCorriente();
	}
	
	@Test
	public void testConstructor() {
		assertEquals (0, this.cuentacorriente.getSaldo());
		assertEquals(0, this.cuentacorriente.getDecubierto());
	}
	
	@Test
	public void testSetYGetDescbierto(){
		this.cuentacorriente.setDecubierto(-50);
		assertEquals(-50, this.cuentacorriente.getDecubierto());
	}
	
	@Test
	public void testPuedeExtraer () {
		this.cuentacorriente.setDecubierto(-50);
		assertTrue(this.cuentacorriente.puedeExtraer(50),"No se pudo extraer");
		this.cuentacorriente.depositar(50);
		assertFalse(this.cuentacorriente.puedeExtraer(101),"Se pudo extraer");
	}
	
	
	//SOLO HAGO LOS TEST DE IMPLEMENTACIONES MIAS, NO LAS DADAS POR LA CATEDRA.(eso dice el enunciado)
}

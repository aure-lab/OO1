package ar.edu.unlp.info.oo1.ej11;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CajaDeAhorroTest {
	private CajaDeAhorro cajadeahorro;
	
	@BeforeEach
	public void setUp() {
		this.cajadeahorro = new CajaDeAhorro();
	}
	
	@Test 
	public void puedeExtreaerTest () {
		this.cajadeahorro.depositar(40);
		assertFalse(this.cajadeahorro.puedeExtraer(40),"Se pudo extraer");
		assertTrue(this.cajadeahorro.puedeExtraer(20));
	}
}

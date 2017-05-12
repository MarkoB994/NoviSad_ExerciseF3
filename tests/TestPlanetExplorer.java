import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_pocetnaPozicija() {
		//Arrenge
		Pozicija poz = new Pozicija(0,0,"N");
		//Act
		String izlaz = poz.toString();
		//Assert
		assertEquals("Provera startne pozicije", izlaz, "(0, 0, N");
	}
}

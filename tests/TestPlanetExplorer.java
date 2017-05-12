import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_pocetnaPozicija() {
		//Arrenge
		Pozicija poz = new Pozicija();
		//Act
		String izlaz = poz.trenutnaPozicija();
		//Assert
		assertEquals("Provera startne pozicije", izlaz, "(0, 0, N)");
	}
	
	@Test(expected = PlanetExplorerException.class)
	public void test_Pomeranja() throws PlanetExplorerException{
		//Arrange
		Pozicija poz = new Pozicija();
		poz.pomeranje("Z");
	}
	
	@Test
	public void test_okretanjaObrnuto() throws PlanetExplorerException{
		//Arrange
		Pozicija poz = new Pozicija();
		poz.pomeranje("l");
		poz.pomeranje("l");
		//Act
		String izlaz = poz.trenutnaPozicija();
		//Assert
		assertEquals("Provera startne pozicije", izlaz, "(0, 0, S)");
	}
	
	@Test
	public void test_okretanjaUsmeruKazalje() throws PlanetExplorerException{
		//Arrange
		Pozicija poz = new Pozicija();
		poz.pomeranje("r");
		poz.pomeranje("r");
		//Act
		String izlaz = poz.trenutnaPozicija();
		//Assert
		assertEquals("Provera startne pozicije", izlaz, "(0, 0, S)");
	}
}

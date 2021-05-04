package race;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarNameTest {

	private static CarName carName;
	
	@Test
	public void testContructor() {
		carName = new CarName();
		assertEquals("", carName.getCarName());
	}

	@Test
	public void testSetCarName() {
		carName = new CarName();
		carName.setCarName("TEST");
		assertEquals("TEST", carName.getCarName());
	}
}

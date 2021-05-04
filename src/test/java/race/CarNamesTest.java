package race;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarNamesTest {

	private static CarNames carNames;
	private final static String SPILIT_TYPE = ",";
	
	@Test
	public void testContructor() {
		
		String nameTest = "aaa,bbb,ccc";
		carNames = new CarNames(nameTest, SPILIT_TYPE);

		assertEquals("aaa", carNames.getCarNameList().get(0).getCarName());
		assertEquals("bbb", carNames.getCarNameList().get(1).getCarName());
		assertEquals("ccc", carNames.getCarNameList().get(2).getCarName());
	}

	
}

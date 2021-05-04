package race;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMovementTest {

	private static CarMovement carMovement;
	
	@Test
	public void testIsMove() {
		carMovement = new CarMovement();	
		assertEquals(Boolean.class, carMovement.isMove().getClass());
	}
	
	@Test
	public void testGetRandomNumber() {
		carMovement = new CarMovement();
		
		Integer result = carMovement.getRandomNumber();
		
		Integer resultTest = result / 10;
		
		assertEquals(0, resultTest);
	}
	
}

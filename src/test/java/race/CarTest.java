package race;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

	private static Car car;
	
	private final static Integer DEFAULT_MOVEMENT = 0;
	
	@Test
	public void moveTest() {
		CarMovement carMovement = new CarMovement();
		CarName carName = new CarName();
		carName.setCarName("aaa");
		car = new Car(DEFAULT_MOVEMENT, carName);
		car.move(carMovement);
		
		assertEquals(Integer.class, car.getPosition().getClass());	
	}
	
	@Test 
	public void isFinishTest() {
		CarName carName = new CarName();
		carName.setCarName("aaa");
		car = new Car(DEFAULT_MOVEMENT, carName);
		
		TryCount tryCount = new TryCount(5);
		
		assertEquals(Boolean.class, car.isFinish(tryCount).getClass());	
		
	}
	
	@Test
	public void testSetCarName() {
		CarName carName = new CarName();
		carName.setCarName("aaa");
		car = new Car(DEFAULT_MOVEMENT, null);
		car.setCarName(carName);
		assertEquals(CarName.class, car.getCarName().getClass());
	}
}

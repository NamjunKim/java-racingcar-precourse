package race;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
	private static Cars cars;
	private final static Integer DEFAULT_MOVEMENT = 0;

	@Test
	public void testContructor() {
		CarName carName = new CarName();
		carName.setCarName("aaa");
		Car car = new Car(DEFAULT_MOVEMENT, carName);
		List<Car> carList = new ArrayList<Car>();
		carList.add(car);
		cars = new Cars(carList);
		assertEquals(carList, cars.getCarList());
		
	}
}

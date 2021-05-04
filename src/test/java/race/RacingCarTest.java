package race;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {

	private static RacingCar racingCar;
	private final static String SPILIT_TYPE = ",";
    
    @Test
    public void setUpCarsTest() {
		String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	
    	assertEquals("aaa", cars.getCarList().get(0).getCarName().getCarName());
    	assertEquals("bbb", cars.getCarList().get(1).getCarName().getCarName());
    	assertEquals("ccc", cars.getCarList().get(2).getCarName().getCarName());
    	
    	assertEquals(0, cars.getCarList().get(0).getPosition());
    	assertEquals(0, cars.getCarList().get(1).getPosition());
    	assertEquals(0, cars.getCarList().get(2).getPosition());
    	
    }
    
    public static Boolean isFinishRacing (Cars cars, TryCount tryCount) {
    	for(Car car : cars.getCarList()) {
    		return car.isFinish(tryCount);
    	}
    	return false;
    }
    
    @Test
    public void isFinishRacingTest () {
    	
		String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	
    	TryCount tryCount = new TryCount(5);
    	assertEquals(Boolean.class, racingCar.isFinishRacing(cars, tryCount).getClass());
    }
    
    @Test
    public void carMovementTest() {
    	String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	
    	TryCount tryCount = new TryCount(5);
    	
    	racingCar.carMovement(cars, tryCount);
    }
    
    
    @Test
    public void showCarMovementTest() {
    	String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	CarMovement carMovement = new CarMovement();
    	cars.getCarList().get(0).move(carMovement);
    	
    	assertEquals(String.class, racingCar.showCarMovement(cars.getCarList().get(0)).getClass());
    }
    
    @Test
    public void getWinnigCarTest() {
    	String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	
    	TryCount tryCount = new TryCount(5);
    	
    	assertEquals(Car.class, racingCar.getWinnigCar(cars.getCarList().get(0), tryCount).getClass());
    	
    }
    
    @Test
    public void getShowWinnersTest() {
    	String nameTest = "aaa,bbb,ccc";
    	CarNames carNames = new CarNames(nameTest, SPILIT_TYPE);
    	Cars cars = racingCar.setUpCars(carNames);
    	
    	racingCar.showWinners(cars);
    	
    }
    
    @Test
    public void getWinnersTest() {
    	
    	assertEquals("winner", racingCar.getWinners("winner", ""));
    	assertEquals("carName", racingCar.getWinners("", "carName"));
    	assertEquals("winner,carName", racingCar.getWinners("winner", "carName"));
    	
    }
}

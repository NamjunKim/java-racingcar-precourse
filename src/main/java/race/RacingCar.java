package race;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCar {
	
	private final static String SPILIT_TYPE = ",";
	private final static Integer DEFAULT_MOVEMENT = 0;
	
	private static Cars cars;
	
    public static void main(String args[]) throws Exception {
    	
    	CarNames carNames = setUpCarName();
    	Cars cars = setUpCars(carNames);
    	TryCount tryCount = setUpTryCount();
    	System.out.println("\n실행 결과");
        playGame(cars, tryCount);	
    	
    }
    
    public static CarNames setUpCarName() {
    	
    	System.out.println("경주할 자동차 이름을 입력하세요.(이름 쉼표(,) 기준으로 구분)");
    	
    	Scanner inputNames = new Scanner(System.in);
    	return new CarNames(inputNames.nextLine(), SPILIT_TYPE) ;
    	
    }
    
    public static TryCount setUpTryCount() {
    	
    	System.out.println("시도할 회수는 몇회인가요?");
    	
    	Scanner inputCount = new Scanner(System.in);
    	
    	return new TryCount(inputCount.nextInt());
    }
    
    public static Cars setUpCars (CarNames carNames) {
    	
    	List<Car> carList = new ArrayList<Car>();
    	
    	for(CarName carName : carNames.getCarNameList()) {
    		carList.add(new Car(DEFAULT_MOVEMENT, carName));
    	}
    	
    	return new Cars(carList);
    }

    public static void playGame(Cars cars, TryCount tryCount) {
    	
    	while(!isFinishRacing (cars, tryCount)) {
    		carMovement(cars, tryCount);
    	}
    	
    	List<Car> winCarList = new ArrayList<Car>();
    	
    	for(Car car : cars.getCarList()) {
        	winCarList.add(getWinnigCar(car, tryCount));
    	}
    	Cars winCars = new Cars(winCarList);
    	showWinners(winCars);
    	
    }
    
    public static Boolean isFinishRacing (Cars cars, TryCount tryCount) {
    	for(Car car : cars.getCarList()) {
    		return car.isFinish(tryCount);
    	}
    	return false;
    }
    
    public static void carMovement(Cars cars, TryCount tryCount) {
    	for(Car car : cars.getCarList()) {
    		CarMovement carMovement = new CarMovement();
    		car.move(carMovement);
        	System.out.println(car.getCarName().getCarName() + ":" + showCarMovement(car));
    	}
    	System.out.println("");
    }
    
    public static String showCarMovement(Car car) {
    	
    	String result = "";
    	
    	for(int index = 0; index < car.getPosition(); index++) {
    		result = result + "-";
    	}
    	return result;
    }
    
    public static Car getWinnigCar (Car car, TryCount tryCount) {
    	if(car.isFinish(tryCount)) {
    		return car;
    	}
    	return new Car(DEFAULT_MOVEMENT, new CarName());
    }
    
    public static void showWinners(Cars cars) {
    	String winners = "";
    	for (Car car : cars.getCarList()) {
        	winners = getWinners(winners, car.getCarName().getCarName());
    	}
    	System.out.println(winners + "가 최종 우승했습니다.");
    }
    
    public static String getWinners(String winners, String carName) {
    	if("".equals(carName)) {
    		return winners;
    	}
    	if("".equals(winners)) {
    		return carName;
    	}
    	return winners + "," + carName;
    	
    }

}

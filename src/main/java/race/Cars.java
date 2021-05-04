package race;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	
	private List<Car> carList;
	
	public Cars(List<Car> carList) {
		this.carList = carList; 	
	}

	public List<Car> getCarList() {
		return this.carList;
	}
}

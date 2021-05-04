package race;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
	
	private List<CarName> carNameList;
	
	public CarNames(String names, String splitType) {
		String[] carNames = names.split(splitType);
		ArrayList<CarName> carNameList = new ArrayList<CarName>();
		
		for(int index = 0; index < carNames.length; index++) {
			CarName carName = new CarName();
			carName.setCarName(carNames[index]);
			carNameList.add(carName);
		}
		
		this.carNameList = carNameList; 	
	}

	public List<CarName> getCarNameList() {
		return this.carNameList;
	}
	
}

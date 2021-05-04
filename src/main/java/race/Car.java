package race;

public class Car {
	
	private Integer position;
	
	private CarName carName;
	
	public Car (int position, CarName carName) {
		this.position = position;
		this.carName = carName;
	}
	
	public void move(CarMovement carMovement) {
		if(carMovement.isMove()) {
			position++;
		}
	}
	
	public Boolean isFinish(TryCount tryCount) {
    	if(this.getPosition() == tryCount.getTryCount()) {
    		return true;
    	}
    	return false;
	}
	
	public Integer getPosition() {
		return position;
	}

	public CarName getCarName() {
		return carName;
	}

	public void setCarName(CarName carName) {
		this.carName = carName;
	}

	

}

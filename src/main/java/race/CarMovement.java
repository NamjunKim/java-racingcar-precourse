package race;

import java.util.Random;

public class CarMovement {
	
	private final static Integer MOVE_AVAILABLE_NUMBER = 4;
	
	public Boolean isMove() {
		//Integer num = getRandomNumber();
		//System.out.println("num : " + num);
		if(getRandomNumber() >= MOVE_AVAILABLE_NUMBER) {
			return true;
		}
		return false;
	}
	
	public Integer getRandomNumber() {
		Random random = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)
    	random.setSeed(System.currentTimeMillis()); //시드값 설정을 따로 할수도 있음
    	return random.nextInt(9);
	}

}

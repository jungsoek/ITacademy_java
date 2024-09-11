package ex02_bike;

public class FourWheelBike extends Bike {
	// 상속시 생성자 없으면 생기는 오류
	// 상속과 생성자에 관해 공부
	public FourWheelBike(String riderName) {
		super(riderName);
	}
	
	@Override
	public void info() {
		super.info();
	}
	
	public void addWheel() {
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
}

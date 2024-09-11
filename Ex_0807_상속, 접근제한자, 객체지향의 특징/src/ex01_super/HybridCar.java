package ex01_super;

public class HybridCar extends Car {
	int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge); 
		// 매개변수 gasGauge를 super를 통해 부모 클래스로 전달
		this.electricGauge = electricGauge;
	}
	
	// 메서드는 오버라이딩을 이용하여 잔여 가스와 잔여 전기량을 출력
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge(); // 부모클래스의 메서드 실행
		System.out.println("전기량 : " + electricGauge);
	}
}

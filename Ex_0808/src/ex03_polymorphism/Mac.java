package ex03_polymorphism;

public class Mac extends Computer {
	
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("아헹흫헹");
	}
	
	public void info() {
		System.out.println("인포인포");
	}
}

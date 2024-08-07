package ex02_modifier;

public class PublicB {
	public static void main(String[] args) {
		// PublicA의 객체를 생성하고 아무값이나 전달
		PublicA a = new PublicA(10);
		// new : 공간할당
		// 생성자 호출 : 객체 메모리 올림
		
		// printA()메서드를 호출하세요
		a.printA();
		
	}
}

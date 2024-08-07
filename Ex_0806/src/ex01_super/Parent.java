package ex01_super;

// 부모역할을 하는 클래스
public class Parent {
	// 모든 클래스는 생성자를 가진다.
	
	// 부모가 가진 필드
	public int money = 100000000;
	String str = "신촌"; // 부모의 부동산
	// 변수를 private으로 만들면 자식이 사용할 수 없다.
	
	public Parent(int n) {
		System.out.println("부모(Parent)클래스" + n);
	}
}

package ex01_super;

public class ExtendsMain {
	public static void main(String[] args) {
		// Child클래스는 Parent클래스를 상속받은 상태이므로
		// 부모로부터 상속받은 money, str등의 변수를 마음대로 가져다가
		// 사용할 수 있다.
		Child c1 = new Child(10);
		
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		// 상속관계라고 할지라도 부모클래스는 자식의 재산을 마음대로 가져다가
		// 사용할 수 없다.
		Parent p1 = new Parent(10);
		System.out.println(p1.money);
		System.out.println(p1.str);
		
		// c1이 Parent와 상속관계라면
		// instanceof 키워드를 통해서 true값을 얻을 수 있다.
		
		// c1과 Parent 클래스의 주소가 같습니까?
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식!!");
		}
	}
}

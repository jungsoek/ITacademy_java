package ex03_access;

import ex02_modifier.Parent;

public class NotChild extends Parent {
	void accessTest() {
		Parent p2 = new Parent();
//		p2.accessProtected();
		// 오류 -> Parent 클래스의 accessProtected() 메서드는
		// 접근제한자로 protected가 선언되었다.
		// protected로 선언된 필드 및 메서드는 같은 패키지 내에서만 상속이 가능하다.
	}
}


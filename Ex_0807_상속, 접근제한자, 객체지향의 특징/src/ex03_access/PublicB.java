package ex03_access;

import ex02_modifier.*; // modifier패키지의 모든 클래스를 import하겠다.

public class PublicB {
	public static void main(String[] args) {
		// default로 선언된 클래스는 다른 패키지에서 사용될 수 없다.
		DefaultC c = new DefaultC();
		// 필드가 public으로 선언되어있음에도 불구하고 객체 생성 자체가 안되기 때문에 사용할 수 없다.
		c.variableC = 20; 
	}
}

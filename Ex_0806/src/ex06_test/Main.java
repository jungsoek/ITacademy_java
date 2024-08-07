package ex06_test;

class Parent {
	int x = 100;
	
	Parent() {
		this(500);
	}
	
	Parent(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 4000;
	
	Child() {
		// 여기에는 사실 super()가 있었다.
		this(5000);
	}
	
	Child(int x) {
		this.x = x;
	}
}

public class Main {
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.getX()); // 답 : 500
		System.out.println(obj.x); // 답 : 5000
	}
}

package ex01_switch;

public class ex03_switch {
	public static void main(String[] args) {
		// break가 없다면 어떻게 될까??
		
		int num = 1;
		// 1. 비교값과 조건값의 타입은 일치해야 한다.
		// 2. 중복되는 조건값을 가질 수 없다.
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}

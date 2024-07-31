package ex04_if;

public class ex02_if_else {
	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num + "은 4보다 큽니다.\n");
		} else {
			System.out.println(num + "은 4보다 작습니다.\n");
		}
		// -----------------------------
		// 두개의 숫자 비교하기
		int a = 4;
		int b = 10;
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		} else {
			if(a == b) {
				System.out.println("a는 b와 같습니다.");
			} else {
				System.out.println("a는 b보다 같습니다.");
			}
		}
		
		// int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 11;
		boolean result = true;
		if(x > 10 && x < 20) {
			result = true;
			System.out.println(result); 
		} else {
			result = false;
			System.out.println(result); 
		}
		// char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		char ch = 'A';
		if(ch == 'x' || ch == 'X') {
			result = true;
			System.out.println(result); 
		} else {
			result = false;
			System.out.println(result); 
		}
		// char형 변수 ch2가 알파벳(대문자 또는 소문자)일 때 true인 조건식
		char ch2 = '@';
		if((int)ch2 >= 65 && (int)ch2 <= 97) {
			result = true;
			System.out.println((int)ch2);
			System.out.println(result);
		} else {
			result = false;
			System.out.println((int)ch2);
			System.out.println(result);
		}
		// 삼항연산자로 만들었던 X개의 농구공을 담기위한 박스의 개수 구하기
		// 를 조건문으로 만들기
		int countBall = 5;
		int amount = 23;
		int countBox;
		
		if(amount % countBall == 0) {
			countBox = amount / countBall;
			System.out.println(countBox);
		} else {
			countBox = (amount / countBall) + 1;
			System.out.println(countBox);
		}
	}
}

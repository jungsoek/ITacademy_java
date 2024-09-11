package ex02_method;

import java.util.Arrays;

public class MethodTest {
	// 배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	// 배열은 매개변수로 전달받는다.
	void maxFinder(int [] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println("최대값 : " + arr[arr.length-1]);
	}
	
	// 계산기 만들기
	// Main에서 숫자 두개랑, 산술연산자(문자열)를 전달받아서 
	// 계산을 해서 반환하는 getResult()메서드 작성하기
	public float getResult(float num1, float num2, String str) {
		float num3 = 0;
		switch(str) {
		case "+":
			num3 = num1 + num2;
			break;
		case "-":
			num3 = num1 - num2;
			break;
		case "*":
			num3 = num1 * num2;
			break;
		case "/":
			num3 = num1 / num2;
			break;
		default: System.out.println("연산 기호가 올바르지 않습니다.");
		}
		
		return num3;
	}
	
}

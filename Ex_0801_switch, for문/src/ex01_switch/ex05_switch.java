package ex01_switch;

import java.util.Scanner;

public class ex05_switch {
	public static void main(String[] args) {
		// 10이하의 숫자를 키보드에서 입력받는다.
		// 해당 숫자가 짝수인지 홀수인지 판별하여 출력하는
		// 코드를 switch로 작성해 주세요

		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 입력 : ");

		int num = scanner.nextInt();
		if (!(num >= 0 && num <= 10)) {
			System.out.println("숫자 재입력");
			num = scanner.nextInt();
		}
		switch (num % 2) {
		case 0 -> System.out.println("짝수");
		case 1 -> System.out.println("홀수");
		}
		
		// 키보드에서 달(month)를 입력받아
		// 해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요
		// 결과
		// X월은 X일까지 있습니다.
		System.out.println("달입력: ");
		int month = scanner.nextInt();
		switch(month) {
		case 1, 3, 5, 7, 9, 11 -> System.out.printf("%d월은 31일까지 있습니다.", month);
		case 4, 6, 8, 10, 12 -> System.out.printf("%d월은 30일까지 있습니다.", month);
		case 2 -> System.out.printf("%d월은 29일까지 있습니다.", month);
		}
		// --------------------------------------
		// 계산기 프로그램 만들기
		// 두 개의 정수를 입력받는다.
		// 산술연산자를 문자열에 담는다. ex) "+"
		// switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		System.out.println("정수1 입력");
		int num1 = scanner.nextInt();
		System.out.println("정수2 입력");
		int num2 = scanner.nextInt();
		System.out.println("산술연산자 입력");
		String op = scanner.next();
		
		switch(op) {
		case "+" -> System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		case "-" -> System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
		case "*" -> System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
		case "/" -> System.out.printf("%d / %d = %.3f", num1, num2, num1 / (float)num2);			
		}
	}
}

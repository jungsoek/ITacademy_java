package ex04_if;

import java.util.Scanner;

public class ex04_if_elseif {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
		// ----------------------------------
		// 나이를 키보드에서 입력받는다.
		// 20살 이상이면 성인입니다.
		// 14살 이상이면 청소년입니다.
		// 7살 이상이면 어린이입니다.
		// 그 이외에는 유아입니다.
		// 라고 출력하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이입력>");
		int age = scanner.nextInt();
			// 객체명.메서드명(); -> 해당 클래스에 있는 메서드의 호출
		
		if(age >=20) {
			System.out.println("성인");
		} else if(age >= 14) {
			System.out.println("청소년");
		} else if(age >=7) {
			System.out.println("어린이");
		} else {
			System.out.println("유아");
		}
		
		// ----------------------------------
		// 키보드에서 성적을 입력받는다.
		// 100-90점까지는 A
		// 89-80점까지는 B
		// 79-70 C
		// 69-60 D
		// 59-0 F
		// 출력하기 "점수는 X점이고 성적은 X입니다."
		
		System.out.println("성적입력>");
		int score = scanner.nextInt();
		char grade;
		if(score >= 90 && score <= 100) {
			grade = 'A';
			System.out.printf("%d, %c", score, grade);
		} else if(score >= 80 && score <= 89) {
			grade = 'B';
			System.out.printf("%d, %c", score, grade);
		} else if(score >= 70 && score <= 79) {
			grade = 'C';
			System.out.printf("%d, %c", score, grade);
		} else if(score >= 60 && score <= 69) {
			grade = 'D';
			System.out.printf("%d, %c", score, grade);
		} else if(score >= 0 && score <= 59) {
			grade = 'F';
			System.out.printf("%d, %c", score, grade);
		}
	}
}

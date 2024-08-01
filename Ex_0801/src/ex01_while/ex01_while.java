package ex01_while;

import java.util.Scanner;

public class ex01_while {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		
		while(n != -1) {
			System.out.println("정수 입력> ");
			n = scanner.nextInt();
			System.out.println("입력된 정수 : " + n);
		}
		
		// 각 자리수의 합 구하기
		// 정수형 변수 n이 있을때, 각 자리의 합을 더한 결과를 출력하세요.
		// n의 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력하세요.
		System.out.println("정수 입력 : ");
		int n_ = scanner.nextInt();
		int sum = 0;
		while(n_ > 0) {
			sum += n_ % 10;
			n_ = n_ / 10;
		}
		System.out.println("각 자리수의 합 : " + sum);
		
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수
		// 출력하기
		// 결과
		// 1, 5
		// 2, 4
		// 3, 3
		// 4, 2
		// 5, 1
		
		
	}
}

package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력> ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i  = 0; i < n; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
	}
}

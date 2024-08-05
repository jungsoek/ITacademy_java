package ex02_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4,5,1,2,9,10};
		mt.maxFinder(arr);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		
		System.out.println("연산 기호 입력 : ");
		String op = scanner.next();
		
	}
	
}

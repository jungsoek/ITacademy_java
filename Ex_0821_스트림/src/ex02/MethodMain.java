package ex02;

import java.util.Scanner;
import ex02.MethodTest;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4, 1, 2, 10, 7, 9, 5, 6, 3, 8};
		
		mt.maxFinder(arr);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1을 누르면 섭씨, 2를 누르면 화씨로 변경");
		
		int select = scan.nextInt();
		
		switch(select) {
		case 1:
			mt.fToc();
			break;
		case 2:
			mt.cTof();
		}
	}
}

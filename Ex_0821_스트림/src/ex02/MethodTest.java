package ex02;

import java.util.Scanner;

public class MethodTest {
	
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		System.out.println("최대값 : " + max);
	}

	public void fToc() {
		Scanner scan = new Scanner(System.in);
		
		double cel;
		double faher;
		
		System.out.println("섭씨 입력 : ");
		
		cel = scan.nextInt();
		
		faher = 1.8 * cel + 32;
		
		System.out.println("화씨로 변화된 온도 : " + faher + "입니다.");
	}
	
	public void cTof() {
		Scanner scan = new Scanner(System.in);
		
		double cel;
		double faher;
		
		System.out.println("화씨 입력 : ");
		
		faher = scan.nextInt();
		
		cel = (faher - 32) / 1.8;
		
		System.out.println("화씨로 변화된 온도 : " + cel + "입니다.");
	}
}

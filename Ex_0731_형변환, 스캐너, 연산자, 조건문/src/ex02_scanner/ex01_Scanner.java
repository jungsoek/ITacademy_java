package ex02_scanner;

import java.util.Scanner;

public class ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		// 제 이름은 XXX입니다.
		// 제 나이는 XX살입니다.
		// 제 주소는 XXX입니다.
		// 제 키는 XX.XXcm입니다.
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.println("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		scan.nextLine(); 
		System.out.println("주소를 입력하세요 : ");
		String address = scan.nextLine();
		
		System.out.println("키를 입력하세요 : ");
		float height = scan.nextFloat();
		
		System.out.printf("제 이름은 %s 입니다.\n", name);
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		System.out.printf("제 주소는 %s 입니다.\n", address);
		System.out.printf("제 키는 %.1fcm입니다.\n", height);
	}
}

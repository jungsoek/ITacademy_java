package ex01_for;

import java.util.Scanner;

public class ex02_for {
	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.print(1 + " ");
			}
		}
		System.out.println("");
		System.out.println("");
		// 1 2 3 4 
		// 1 2 3 4 
		// 1 2 3 4
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((j+1) + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12
		int count = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.printf("%02d ", ++count);
			}
			System.out.println("");
		}
		System.out.println("");
		
		// A B C D
		// E F G H
		// I J K L
		char ch = 'A';
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%c ", ch++);
			}
			System.out.println("");
		}
		System.out.println("");
		
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// 00 01 02 03 04
		// 10 11 12 13 14
		// 20 21 22 23 24
		// 30 31 32 33 34
		// 40 41 42 43 44
		// 50 51 52 53 54
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		// ...
		// 1 2 3 4 5 6 7 8 9 10
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++) {
				int num = i + j;
				if(num > 10) {
					num -= 10;
				}
				System.out.print(num + " ");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------------");
		
	}
}

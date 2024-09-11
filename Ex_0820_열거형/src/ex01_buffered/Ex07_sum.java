package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_sum {
	public static void main(String[] args) {
		// 문제
		// N개의 숫자가 공백없이 쓰여있다.
		// 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요.
		
		// 입력
		// N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		// 출력
		// 입력으로 주어진 숫자 N개의 합을 출력
		
		// 예시
		// 1				5				25				11
		// 1				54321			70000000000		10987654321
		// 결과				결과				결과				결과
		// 1				15				7				46
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("정수 입력");
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			
			// 입력받은 문자열을 미리 배열에 담아놓는다.
			String[] arr = br.readLine().split("");
			
			// 내가 입력받은 숫자만큼만 반복
			for(int i = 0; i < n; i++) {
				// 입력받은만큼만 더함
				sum += Integer.parseInt(arr[i]);
			}
			
			System.out.println("총합 : " + sum);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

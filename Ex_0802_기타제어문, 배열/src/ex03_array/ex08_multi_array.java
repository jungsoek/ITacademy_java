package ex03_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex08_multi_array {
	public static void main(String[] args) {
		// 다차원배열
		// 2차원 이상의 배열을 의미하며, 배열의 요소로
		// 또 다른 배열을 가지는것을 의미한다.
		// 2차원 배열은 배열의 요소로 1차원 배열을 가지고,
		// 3차원 배열은 배열의 요소로 2차원 배열을 갖는다.
		int arr[][] = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		
		// 2차원 배열의 생성
		// 자료형 [][] 배열명 = new 자료형 [크기][크기];
//		int [][] arr2 = {{1,2,3},{4,5,6}};
//		System.out.println(Arrays.deepToString(arr2));
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int [][] iArr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		// iArr[0][0] + ... + iArr[3][4]
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++ ) {
				sum += iArr[i][j];
			}
		}
		System.out.println("sum : " + sum);
		
		// 각각의 1차원 배열들이 갖고 있는 요소의 개수를 미리 정하지 않고
		// 만드는 것이 가능하다.
		int [][] iArr_ = new int[3][];
		int n = 0;
		
		for(int i = 0; i < iArr_.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.println((iArr[i][j] = n += 100) + " ");
			}
			System.out.println();
		}
	}
}

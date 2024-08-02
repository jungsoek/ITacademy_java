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
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[1][0] = 300;
		arr[1][1] = 400;
		arr[2][0] = 500;
		arr[2][1] = 600;
		
		// 2차원 배열의 생성
		// 자료형 [][] 배열명 = new 자료형 [크기][크기];
		int [][] arr2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(arr2));
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

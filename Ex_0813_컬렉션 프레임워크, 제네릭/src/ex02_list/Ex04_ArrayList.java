package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		// ArrayList의 데이터 얻기
		
		List<Integer> list = new ArrayList<>();
		
		// 1 ~ 30 사이의 난수 10개를 list에 추가해주세요.
		for(int i = 1; i <= 10; i++) {
			list.add((int)(Math.random()*30) + 1);
		}
		System.out.println(list);
		
		// List에 담긴 데이터 중 짝수만 출력
		System.out.println("짝수 : ");
		for(int i = 0; i < list.size(); i++) {
			// List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if(value % 2 == 0) {
				System.out.println(value + " ");
			}
		}
		
		// 향상된 for문을 통해 출력할 수도 있다.
		for(int value : list) {
			System.out.println("값 : " + value);
		}
	}
}

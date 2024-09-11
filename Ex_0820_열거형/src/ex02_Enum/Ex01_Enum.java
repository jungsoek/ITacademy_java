package ex02_Enum;

import java.util.Arrays;

public class Ex01_Enum {
	public static void main(String[] args) {
		// values() -> 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		for(Item item : items) {
			System.out.println("name : " + item.name());
		}
		
		Item i1 = Item.valueOf("START");
		System.out.println(i1);
		Item i2 = Item.START;
		System.out.println(i2);
		Item i3 = Item.STOP;
		// 열거형의 상수간의 비교는 ==을 사용한다.(상수끼리의 주소를 비교)
		System.out.println(i1 == i2);
		
		// 초과, 미만, 이상, 이하와 같은 비교연산자는 사용할 수 없다.
        // error > System.out.println(i1 >i3);
		// 기준객체.compareTo(비교객체);
		// 매개값을 주어진 객체를 비교해서 순번 차이를 반환
		// 기준객체가 비교객체보다 순번이 빠르다 -> 음수 반환
		// 기준객체가 비교객체보다 순번이 늦다 -> 양수
		
		System.out.println(i1.compareTo(i3));
		
		switch(i1) {
		// Item.START라고 쓸 수 없다.
		case START -> System.out.println("게임시작!");
		case STOP -> System.out.println("게임멈춤!");
		case EXIT -> System.out.println("게임종료!");
		}
		
		// 생성자가 
	}
}

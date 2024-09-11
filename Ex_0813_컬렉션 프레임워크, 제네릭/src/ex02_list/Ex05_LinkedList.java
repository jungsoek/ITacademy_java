package ex02_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		// ArrayList와 LinkedList의 성능 비교
		
		// ArrayList 선언
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// LinkedList 선언
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		long startTime = System.nanoTime();
		// ArrayList와 LinkedList에 1000000 데이터 추가하기
		for(int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		
		long duration = endTime - startTime;
		
		System.out.println("ArrayList 추기 시간 : " + duration);
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		
		System.out.println("LinkedList 추가 시간 : " + duration);
		
		/////////////////////////////////////////////////////////////
		
		// 특정위치에 삽입하는 시간을 비교
		// ArrayList
		// index로 이어져있음
		// 중간 삽입을 위해서는 뒤의 요소들을 뒤로 밀어야함
		// -> 요소의 갯수가 많으면 많을수록 시간이 오래 걸림
		// 삽입과 삭제가 자주 일어나지 않는곳에 사용
		// 삽입과 삭제 속도는 느리나 조회 속도가 index로 인해 빠름
		startTime = System.nanoTime();
		arrayList.add(99, 100);
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("ArrayList 삽입시간 : " + duration);
		
		// LinkedList
		// 데이터와 주소가 짝지어서 이어져있음
		// (index로 이어져있지 않음)
		// 중간 삽입을 위해서 뒤의 요소들을 뒤로 미룰 필요가 없음
		// (해당 주소의 데이터만 바꿔주면 되기 때문)
		// 삽입과 삭제가 빈번히 일어나는곳에 사용
		// 조회 속도가 느리나 삽입과 삭제 속도는 빠름
		startTime = System.nanoTime();
		linkedList.add(99, 100);
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("LinkedList 삽입시간 : " + duration);
		
		///////////////////////////////////////////////////////
		// 요소의 삭제시간 비교
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		
		System.out.println("ArrayList 지우기 : " + duration);
		
		// LinkedList
		startTime = System.nanoTime();
		for(int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		
		System.out.println("LinkedList 지우기 : " + duration);
	}
}

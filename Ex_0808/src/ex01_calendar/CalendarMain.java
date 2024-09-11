package ex01_calendar;

import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Calendar c = new DeskCalendar("검정", 12);
		c.info(); // 부모타입으로 변환해도 오버라이딩된 메서드가 호출된다.
		c.hanging();
		
		// 부모타입으로 변환한 자식객체는, 더이상 자식 클래스만의 멤버나
		// 메서드를 호출할 수 없다.
	}
}

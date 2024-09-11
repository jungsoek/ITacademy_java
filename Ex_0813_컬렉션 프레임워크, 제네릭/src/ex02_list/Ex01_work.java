package ex02_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc3
		// abc abc2 abc3
		
		// 리스트의 요소의 개수가 4개이면 프로그램 종료
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		while(true) {
			System.out.println("아이디 입력 > ");
			String id = scanner.next();
			
			// 리스트에 중복이 되는 아이디가 있는지 검증
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue;
				}
			}
			
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			
			list.add(id);
			System.out.println(list);
			System.out.println("-------------");
			if(list.size() == 4) {
				break;
			}
		}
		// 또는
		for(int i = 0; i < 4; i++) {
			System.out.println("아이디 입력 > ");
			list.add(scanner.next());
		}
		System.out.println(list);
	}
}

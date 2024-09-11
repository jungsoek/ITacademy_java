package ex02_list;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	public void personMgr() {
		int select;
		Person p = new Person();

		ArrayList<Person> personArr = new ArrayList<>();

		Outer: while (true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.println("항목 선택 : ");

			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("이름");
				p.setName(sc.next());
				System.out.println("나이");
				p.setAge(sc.nextInt());
				System.out.println("전화");
				p.setTel(sc.next());
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				break;
			case 2:
				System.out.println("삭제할 이름");
				String delName = sc.next();
				for (int i = 0; i < personArr.size(); i++) {
					if ((personArr.get(i).getName()).equals(delName)) {
						personArr.remove(i);
						System.out.println("삭제 완료");
					} else {
						System.out.println("해당 이름 없음");
					}
				}
				break;
			case 3:
				System.out.println("--- 전체 정보 ---");
				System.out.println("등록인원 " + personArr.size() + "명");
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println("이름 : " + personArr.get(i).getName());
					System.out.println("나이 : " + personArr.get(i).getAge());
					System.out.println("전화 : " + personArr.get(i).getTel());
					System.out.println("------------------------");
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				break Outer;
			}
		}
	}
}

package ex02_controle;

public class label {
	public static void main(String[] args) {
		// label : 특정 반복문에 이름표를 붙여
		// 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		// label은 항상 쌍으로 존재한다.
		// label의 이름은 자기가 원하는대로 사용이 가능하다.
		// label은 자신을 포함하고 있는 상위 개념에게만 달 수 있다.

		// 라벨을 이용하면 내가 원하는 반복문에 적용시킬 수 있다.
		happy: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					break happy;
				}
				System.out.println(j + " ");
			} // inner
			System.out.println();
		} // outer

		int n = 0;

		outer: while (true) {
			if (n >= 10) { // 이 부분은 무한반복 되는거 확인 후 가장 마지막에 추가
				break;
			}
			while (true) {
				n++;
				if (n % 3 == 0) {
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}

		n = 0;

		w: while (n < 10) {
			n++;

			switch (n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				// switch문에서 break는 반복문을 나가는게 아닌 switch문만 나가게 된다.
				break;
			case 2:
				System.out.println("switch문 2번 거쳐감");
				// switch문만 단독으로 사용을 할 때는 continue를 사용할 수 없다.
				continue;
			} // switch
			System.out.println(n);
		} // while
	}
}

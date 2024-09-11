package ex02_controle;

public class ex03_while_break_continue {
	public static void main(String[] args) {
		int n = 1;
		while(true) { // 무한반복. !true나 false는 불허
			System.out.println(n);
			n++;
			// n이 10보다 클 때 break로 while문을 빠져나오는 구문을 만들어보자
			if(n > 5) {
				break;
			}
		}
		
		n = 0;
		
		while(n < 10) {
			n++;
			
			if(n % 2 != 0) {
				// while문에서 continue를 만나면 조건식으로 이동
				continue;
			}
			
			System.out.println(n);
		}// while
	}
}

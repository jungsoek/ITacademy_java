package ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 20; i++) {
			if(!((i+1) % 3 == 0 || (i+1) % 2 == 0)) {
				sum += (i+1);
			}
			continue;
		}
		System.out.println(sum);
	}
}

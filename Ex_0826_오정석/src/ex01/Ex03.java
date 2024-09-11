package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		System.out.println("금액 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			System.out.println(coin[i] + "원 : " + res);
			money %= coin[i];
		}
	}
}

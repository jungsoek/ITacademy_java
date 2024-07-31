package ex03_operator;

import java.util.Scanner;

public class ex08_Operator {
	public static void main(String[] args) {
		// 과수원에서 배, 사과, 오렌지를 하루에 각각 5, 7, 5개씩 생산한다.
		// 1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		// 2. 시간당 총 생산량 구하기
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		float output = total / (float)24;
		
		System.out.println(total);
		System.out.println(output);
		
		// ---------------------------
		// 상자 하나에는 농구공이 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가?
		int countBall = 5;
		int amount = 23;
		
		// 삼항연산자
		// 박스의 개수 : 공의 개수가 5로 나누어 떨어지면 몫만큼 필요
		// 공의 개수가 5로 나눠 떨어지지 않으면 몫 + 1만큼 필요
		int countBox = amount % countBall == 0 ? amount / countBall : amount / countBall + 1;
		System.out.println(countBox);
		
		// ---------------------------
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기(합계 / 3.0)
		
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격
		// 아니면 불합격
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수입력");
		int kor = scanner.nextInt();
		int Eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		int totalScore = kor + Eng + math;
		float average = totalScore / (float)3;
		String result = (kor >= 40 && Eng >= 40 && math >= 40) && (average >= 60) ? "합격" : "불합격";
		
		System.out.println(totalScore);
		System.out.println(average);
		System.out.println(result);
	}
}

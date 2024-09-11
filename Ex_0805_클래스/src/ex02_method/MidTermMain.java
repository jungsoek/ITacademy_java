package ex02_method;

public class MidTermMain {
	public static void main(String[] args) {
		int[] stu1 = {89,90};
		int[] stu2 = {48,12};
		MidTerm mid = new MidTerm();
		
		int sumA = mid.score(stu1);
		int sumB = mid.score(stu2);
		
		if(sumA > sumB) {
			System.out.println("A학생의 성적이 B학생보다 좋습니다.");
		} else if(sumA < sumB) {
			System.out.println("B학생의 성적이 A학생보다 좋습니다.");
		} else {
			System.out.println("A학생의 성적과 B학생의 성적이 같습니다.");
		}
	}
}

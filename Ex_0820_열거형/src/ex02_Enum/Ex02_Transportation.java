package ex02_Enum;

public class Ex02_Transportation {
	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		String[] arr = {"A", "B", "C"};
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		for(Transportation tran : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n", tran.name(), tran.fare);
		}
	}
}

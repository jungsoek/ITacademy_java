package ex01_generic;

public class DataListExample {
	public static void main(String[] args) {
		// DataList 객체 생성하기 변수명은 list
		DataList<Integer> list = new DataList<Integer>();
		
		// 정수입력
		list.add(10);
		
		
		// 데이터 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			
			// 저장된 타입이 어떤타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
		
		// 데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("총합 : " + sum);
	}
}

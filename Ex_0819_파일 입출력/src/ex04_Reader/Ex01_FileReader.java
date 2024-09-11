package ex04_Reader;

import java.io.FileReader;

public class Ex01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		// 이미지, 음악, 동영상 전송할 때는 바이트기반의 스트림을 이용한것이 좋다.
		try {
			fr = new FileReader("D:\\web1900_ojs\\work/test.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
			}
		} catch (Exception e) {
			
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}

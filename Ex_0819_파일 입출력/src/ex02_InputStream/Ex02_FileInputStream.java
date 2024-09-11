package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web1900_ojs\\work\\test.txt";
		File f = new File(path); 
		
		// 파일의 크기만큼만 배열의 크기를 만들고 싶다.
		// f.length();
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				// 내용을 읽어와서 바이트배열 read에 저장
				fis.read(read);
				// 현재 byte[]배열 read에는 test.txt에서 읽어온 데이터들이 저장된다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내용을 읽어와서 바이트배열 read에 저장
		try {
			fis.read(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally
		// 현재 byte[]
	}
}

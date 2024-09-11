package ex04_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Ex02_FileReader {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			// 특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.
//			String path = "D:\\web1900_ojs\\work/reader.txt";
//			FileOutputStream fos = new FileOutputStream(path, true);
//			
//			fos.write('a');
//			fos.write('A');
//			
//			// reader.txt파일을 읽어서
//			// 알파벳 대문자와 소문자의 개수를 출력하세요.
//			File f = new File(path);
//			
//			byte[] read = new byte[(int)f.length()];
//			
//			if(f.exists()) {
//				try {
//					fis = new FileInputStream(f);
//					// 내용을 읽어와서 바이트배열 read에 저장
//					fis.read(read);
//					// 현재 byte[]배열 read에는 test.txt에서 읽어온 데이터들이 저장된다.
//					// 내용을 읽어와서 바이트배열 read에 저장
//					// 대문자 : X개
//					// 소문자 : X개
//					try {
//						fis.read(read);
//						for(int i = 0; i <= fis.read(read); i++) {
//							System.out.println(fis.read(read));
//						}
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		} // finally
		
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader("D:\\web1900_ojs\\work/reader.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
				System.out.print((char)code);
			}
			
			System.out.println("대문자 : " + upper + "개");
			System.out.println("대문자 : " + lower + "개");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		UserInfo userinfo = new UserInfo();
		List<UserInfo> list = new ArrayList<UserInfo>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String userID = sc.next();
			
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equals(userID)) {
					System.out.print("아이디가 중복됩니다. : ");
					userID = sc.next();
				}
				
				System.out.print("패스워드 입력 : ");
				int userPWD = sc.nextInt();
				
				userinfo.setId(userID);
				userinfo.setPwd(userPWD);
				
				list.add(userinfo);
				
				System.out.printf("아이디 생성 : %s", list.get(i).getId());
				System.out.printf("패스워드 입력 : %d", list.get(i).getPwd());
			}

		}
	}
}

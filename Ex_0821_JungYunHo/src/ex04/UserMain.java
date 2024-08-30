package ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserMain {
	public static void main(String[] args) throws Exception {

		ArrayList<UserInfo> User = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id = "";
		int pwd = 0;
		a : while (true) {
			UserInfo u = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			id = br.readLine();
			u.Id(id);
			
			System.out.print("패스워드 입력 : ");
			pwd = Integer.parseInt(br.readLine());
			u.Pwd(pwd);
			
			for (int i = 0; i < User.size(); i++) {
				if (id.equals(User.get(i).getId())) {
					System.out.println("아이듸가 중복됩니다.");	
					continue a;
				}
			}
			User.add(u);
			for(int i = 0; i < User.size(); i++) {
				System.out.println(User.get(i).getId());
				System.out.println(User.get(i).getPwd());
				System.out.println("-------------------");
			}
			
		}
	}
}

package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		
		
	
		
		String path = "D:\\web0900_jyh\\1.java/file.txt";
				
		File f = new File(path);
		
		byte[] b = new byte[(int) f.length()];
		
		FileInputStream fil = null;
		
		if(f.exists()) {
			try {
				fil = new FileInputStream(f);
				
				fil.read(b);
				//b 배열에 들어있는 모든 요소를 문자열로 바꿔서 넣음
				String ori = new String(b);
				
				System.out.println(ori);
				String rev = "";
				
				for(int i = ori.length()-1; i >= 0;i--) {
					rev += ori.charAt(i);
				}
				if(ori.equals(rev)) {
					System.out.println(ori + "는 회문입니다.");
				}else {
					System.out.println(ori + "는 회문이 아닙니다.");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block				
			}finally {
				try {
					fil.close();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
				}
			}
		}
		
	}
}

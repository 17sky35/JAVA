package ex01_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {
	public static void main(String[] args) {
		
		FileInputStream readFile = null;
		FileOutputStream writeFile = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			readFile = new FileInputStream("D:\\web0900_jyh\\1.java/wall.jpg");
			bis = new BufferedInputStream(readFile);
			writeFile = new FileOutputStream("D:\\web0900_jyh\\1.java/wall_copy3.jpg");
			bos = new BufferedOutputStream(writeFile);
			int code = 0;
			while((code = bis.read()) != -1) {
				bos.write(code);
			}
			System.out.println("복사 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bos != null) bos.close();
				if(writeFile != null) writeFile.close();
				if(bis != null) bis.close();
				if(readFile != null) readFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
	}
}

package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {
	public static void main(String[] args) {
		
		 FileReader fr = null;
		 String s = "";		 
		 int upper = 0;
		 int lower = 0;
		 try {
			
			 fr = new FileReader("D:\\web0900_jyh\\1.java/reader.txt");
			 int code = 0;
			 while((code = fr.read()) != -1) {
				 s += (char)code;
				 if (code >='a' && code <='z') {
					 lower++;
				 }else if(code >='A' && code <='Z'){
					 upper++;					 
				 }
				 
			 }
			 System.out.printf("%s\n대문자 : %d개\n소문자 : %d개\n",s,upper,lower);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
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

package ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInfo {	
	
	private String id;
	private int pwd;
	
	
	public UserInfo() {		
	}
	
	
	public void Id(String id) {
		this.id = id;
		
	}
	public void Pwd(int pwd) {
		this.pwd = pwd;
	}
	
	public String getId() {
		return id;
	}

	public int getPwd() {
		return pwd;
	}
}

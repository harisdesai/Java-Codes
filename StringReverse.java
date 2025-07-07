package com.assignment5;

import java.util.Scanner;

public class StringReverse {
	
private String str;
	
	public StringReverse() {
		
	}
	
	public StringReverse(String str) {
		this.setStr(str);
	}
	
	public void acceptData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		this.setStr(sc.next());
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void strRev() {
		StringBuilder strb = new StringBuilder(str);
		strb.reverse();
		String rstr = strb.toString();
		System.out.println("Reversed String :"+rstr);
	}

	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		sr.acceptData();
		sr.strRev();

	}

	

}

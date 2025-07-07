package com.assignment5;

import java.util.Scanner;

public class Palindrome {
	
	private String str;
	
	public Palindrome() {
		
	}
	
	public Palindrome(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void acceptData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		this.str = sc.next();
	}
	
	public void palindrome() {
		StringBuilder strb = new StringBuilder(str);
		strb.reverse();
		String rstr = strb.toString();
		if(str.equals(rstr)) {
			System.out.println("Is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pd = new Palindrome();
		pd.acceptData();
		pd.palindrome();
	}

}

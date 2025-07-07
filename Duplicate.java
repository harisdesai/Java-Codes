package com.assignment5;

import java.util.Scanner;

public class Duplicate {
	
	private String[] a;
	private String[] b;
	
	public Duplicate() {
		
	}

	public Duplicate(String[] arr1, String[] arr2) {
		this.a = arr1;
		this.b = arr2;
	}
	
	public String[] getA() {
		return a;
	}

	public void setA(String[] a) {
		this.a = a;
	}

	public String[] getB() {
		return b;
	}

	public void setB(String[] b) {
		this.b = b;
	}

	public void acceptData(int Arrlength1 ,int Arrlength2) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 a = new String[Arrlength1];
	     b = new String[Arrlength2];
		System.out.print("Enter the First string :");
		for(int i=0;i<Arrlength1;i++)
			this.a[i] = sc.next();
		System.out.print("Enter the Second string :");
		for(int i=0;i<Arrlength2;i++)
			this.b[i] = sc.next();
	}
	
	
	public void finddup(int Arrlength1 ,int Arrlength2) {
		for(int i=0;i<Arrlength1;i++) {
			for(int j=0;j<Arrlength2;j++) {
				if(a[i].equals(b[j])) {
					System.out.println("Duplicate element " +(i+1)+" :"+a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate dup = new Duplicate();
		System.out.println();
		dup.acceptData(5,5);
		dup.finddup(5, 5);
		}
		
	}


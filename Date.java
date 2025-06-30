/*Q1. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/


package com.assignment2;
import java.util.Scanner;
public class Date{
	private int month;
	private int day;
	private int year;
	
	public Date() {
		this(6,27,2025);
	}

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.printf("Date: %d/%d/%d",this.day,this.month,this.year);
	}
	
	public void setDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Day: ");
		this.day=sc.nextInt();
		System.out.print("Enter Month: ");
		this.month=sc.nextInt();
		System.out.print("Enter Year: ");
		this.year=sc.nextInt();
		sc.close();
	}
}

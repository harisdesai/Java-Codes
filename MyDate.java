package employeemanagement;
import java.util.Scanner;

public class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate() {
		this(0,0,0);
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate acceptDate() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day :");
		this.day = sc.nextInt();
		System.out.print("Enter the Month :");
		this.month = sc.nextInt();
		System.out.print("Enter the Year :");
		this.year = sc.nextInt();
		System.out.println();
		return new MyDate(this.day,this.month,this.year);
	}

	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	
}

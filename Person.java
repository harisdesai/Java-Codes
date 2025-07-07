package employeemanagement;

import java.util.Scanner;

public class Person  {
	String name;
	private MyDate dateofbirth = new MyDate();

	public Person(String name, MyDate dateofbirth) {
		this.name = name;
		this.dateofbirth = dateofbirth;
	}

	public Person() {
		this(null,new MyDate());
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(MyDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public void acceptData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name :");
		this.name = sc.nextLine();
		System.out.println();
		System.out.print("Enter the Date of Birth :");
		this.dateofbirth = dateofbirth.acceptDate();
	}


	@Override
	public String toString() {
		return " \n Name :" + name + "\n DateofBirth :" + dateofbirth;
	}

	
	
	
}

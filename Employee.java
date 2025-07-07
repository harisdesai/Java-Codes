package employeemanagement;

import java.util.Scanner;

public class Employee extends Person implements Comparable <Employee>{
	int id;
	String department;
	double salary;
	MyDate dateofjoining = new MyDate();
	
	public Employee() {
		this(0,null,0,new MyDate());
	}
	
	public Employee(int id, String department, double salary, MyDate dateofjoining) {
		super("Haris",new MyDate(01,01,2006));
		this.id = id;
		this.department = department;
		this.salary = salary;
		this.dateofjoining = dateofjoining;
	}
	
	public void acceptData() {
		super.acceptData();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ID :");
		this.id = sc.nextInt();
		System.out.println();
		System.out.print("Enter the Department :");
		this.department = sc.next();
		System.out.println();
		System.out.print("Enter the salary :");
		this.salary = sc.nextDouble();
		System.out.println();
		System.out.print("Enter the Date of Joining :");
		 this.dateofjoining = new MyDate().acceptDate();
		System.out.println();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public MyDate getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(MyDate dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	@Override
	public String toString() {
		return super.toString() +"\n Id :" + id + "\n Department :" + department + "\n Salary :" + salary + "\n DateOfJoining :" + dateofjoining + "";
	}


	@Override
	public int compareTo(Employee o) {
		if(this.getSalary()>o.getSalary()) {
			return 1;
		}
		else if(this.getSalary()==o.getSalary()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}

package tester;

import java.util.Arrays;
import java.util.Scanner;

import employeemanagement.*;

public class Testing {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees(Max 10*) :");
		int n = sc.nextInt();
		Employee[] employees = new Employee[n];
		int i = 0;
		employees[i++] = new Employee(111,"dep",10000,new MyDate(33,22,2024));
		employees[i++] = new Employee(222,"it",20000,new MyDate(33,22,2025));
		employees[i++] = new Employee(333,"ai",5000,new MyDate(33,22,2026));
		int choice = 1;
			while(choice!=7) {
				System.out.println();
				System.out.print("1. Add Employee\n");
				System.out.print("2. Display All Employees\n");
				System.out.print("3. Search Employee by ID\n");
				System.out.print("4. Display Employees joined in given Year\n");
				System.out.print("5. Find Employee with Maximum Salary\n");
				System.out.print("6. Find Employee with Minimum Salary\n");
				System.out.print("7. Exit the Application\n");
				System.out.println();
				System.out.print("Enter the Choice :");
				choice = sc.nextInt();
				
				switch(choice) {
					
					case 1:
						System.out.println();
						if(i<n) {
							employees[i] = new Employee();
							employees[i].acceptData();
							i++;
						}
						else {
							System.out.println("Maximun number of employees Reached");
						}
						break;
						
					case 2:
						System.out.println();
						for(int j = 0;j<i;j++) {
							System.out.println(employees[j].toString());
						}
						break;
						
					case 3:
						System.out.println();
						System.out.print("enter the Employee ID :");
						int emid = sc.nextInt();
						int flag=0;
						for(int j=0;j<i;j++) {
							if(employees[j].getId() == emid) {
								System.out.println(employees[j].toString());
								flag = 1;
							}
						}
						if(flag==0) {
							System.out.println("Id not found");
						}
						break;
						
					case 4:
						System.out.println();
						System.out.print("enter the Year :");
						int yr = sc.nextInt();
						int flag2=0;
						for(int j=0;j<i
								;j++) {
							if(employees[j].getDateofjoining().getYear()==yr) {
								System.out.println(employees[j].toString());
								flag2 = 1;
							}
						}
						if(flag2==0) {
							System.out.println("Id not found");
						}
						break;
						
					case 5:
						System.out.println();
						Arrays.sort(employees);
						System.out.println("Employee with maximum salary :");
						System.out.println(employees[employees.length-1]);
						break;
						
					case 6:
						System.out.println();
						Arrays.sort(employees);
						System.out.println("Employee with minimum salary :");
						System.out.println(employees[0]);
						break;
						
					case 7:
						System.out.println();
						System.out.println("Exiting........");
						return;
						
					default:
						System.out.println();
						System.out.println("Invalid Choice");
						break;
				}
			}
		
	}

}

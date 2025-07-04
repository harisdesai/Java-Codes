package com.vision;

import java.util.Scanner;

public class DailyDrivingCost {
	Scanner sc = new Scanner(System.in);
	private double miles;
	private double cost;
	private int parkingfee;
	private int toll;
	private double average;
	
	public DailyDrivingCost() {
		super();
	}

	public DailyDrivingCost(double miles, double cost, int parkingfee, int toll, double average) {
		this.miles = miles;
		this.cost = cost;
		this.parkingfee = parkingfee;
		this.toll = toll;
		this.average = average;
	}
	
	
	public void acceptData() {
		System.out.print("Enter Total miles driven :");
		miles=sc.nextDouble();
		System.out.print("Cost per gallon of gasoline :");
		cost=sc.nextDouble();
		System.out.print("Enter the average :");
		average=sc.nextDouble();
		System.out.print("Parking fees :");
		parkingfee=sc.nextInt();
		System.out.print("Tolls :");
		toll=sc.nextInt();
	}

	public double calculateCost() {
		double total_cost = 0;
		double gas_per_mile=(this.cost/this.average);
		total_cost=this.miles*gas_per_mile;
		total_cost = total_cost+this.parkingfee+this.toll;
		return total_cost;
	}
	
	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public double getMiles() {
		return miles;
	}



	public void setMiles(double miles) {
		this.miles = miles;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public int getParkingfee() {
		return parkingfee;
	}



	public void setParkingfee(int parkingfee) {
		this.parkingfee = parkingfee;
	}



	public int getToll() {
		return toll;
	}



	public void setToll(int toll) {
		this.toll = toll;
	}

}

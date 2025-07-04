package com.vision;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyDrivingCost d = new DailyDrivingCost();
		d.acceptData();
		double perdaycost=d.calculateCost();
		System.out.println("Daily driving cost :"+perdaycost);
	}

}

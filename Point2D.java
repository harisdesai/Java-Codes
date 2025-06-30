package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;
public class Point2D {
	
	private double x;
	private double y;
	
	public Point2D() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x cordinate: ");
		this.x = sc.nextDouble();
		System.out.print("Enter y cordinate: ");
		this.y = sc.nextDouble();
	}
	

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "Point : (" + x + " , "+ y +")";
	}
	
	public boolean isEqual(Point2D p) {
		return this.x==p.x && this.y==p.y;
	}
	
	public double calculateDistance(Point2D p) {
		double xfield = Math.pow(p.x-this.x, 2);
		double yfield = Math.pow(p.y-this.y, 2);
		return Math.sqrt(yfield+xfield);
	}
	

}

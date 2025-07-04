package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many no of points to plot :");
		int NoOfPoints = sc.nextInt();
		Point2D[] points=new Point2D[NoOfPoints];
		
		for(int i=0;i<NoOfPoints;i++) {
			System.out.print("Enter the Coordinates of points :"+ (i+1));
			
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			
			points[i]=new Point2D(x,y);
		}
		
		int choice = 1;
		while(!(choice==4)) {
			System.out.println();
			System.out.print("1. Display details of a specific point :\n");
			System.out.print("2. Display x, y co-ordinates of all points :\n");
			System.out.print("3. User i/p : 2 indices for the points , validate the indices :\n");
			System.out.print("4. Exit\n");
			System.out.println();
			System.out.print("Enter Choice :");
			choice = sc.nextInt();
			switch(choice) {
		
			case 1:
				System.out.println();
				System.out.print("Enter the index :");
				int index = sc.nextInt();
				if(index>NoOfPoints||index<0) {
					System.out.println("Invalid Index :");
			
				}
				else {
					System.out.println(points[index].getDetails());
				}
				break;
				
			case 2:
				System.out.println();
				for(Point2D p : points) {
					System.out.println(p.getDetails());
				}
				break;
				
			case 3:
				System.out.println();
				System.out.print("Enter index of start point and end point :");
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();
				
				if(p1>=0 && p2<NoOfPoints) {
					if(points[p1].isEqual(points[p2])) {
						System.out.print("P1 and P2 located at same position");
					}
					else {
						System.out.println("The Distance between P1 and P2 is: "+ points[p1].calculateDistance(points[p2]));
					}
				}
				break;
			
			}
		}
	}

}

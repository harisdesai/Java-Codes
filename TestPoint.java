package tester;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		p1.getDetails();
		Point2D p2 = new Point2D();
		p2.getDetails();
		
		if(p1.isEqual(p2)) {
			System.out.println("P1 and P2 located at same position");
		}
		else {
			System.out.println("The Distance between P1 and P2 is: "+ p1.calculateDistance(p2));
		}
	}

}

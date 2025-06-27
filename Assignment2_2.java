import java.util.Scanner;
public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter 2 Numbers: ");
		
		if(sc.hasNextDouble()) {
			double num1 = sc.nextDouble();
			
			if(sc.hasNextDouble()) {
				double num2 = sc.nextDouble();
				System.out.println("Numbers are double");
				System.out.println("The avg is "+(num1+num2)/2);
			}
			
		}
		sc.close();
	}

}
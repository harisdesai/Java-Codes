import java.util.Scanner;
public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("Given number: "+num);
		System.out.println("Binary Equivalent: " + Integer.toBinaryString(num));
		System.out.println("Octal Equivalent: " + Integer.toOctalString(num));
		System.out.println("Hexal Equivalent: " + Integer.toHexString(num));
		
		sc.close();
	}
	
}
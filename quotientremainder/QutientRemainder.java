package quotientremainder;

import java.util.Scanner;
public class QutientRemainder {

	public static void main(String[] args) {
	
		System.out.println("Enter the divident which you want to " );
		Scanner scQu = new Scanner(System.in);
	     int dividend = scQu.nextInt(); 
	     scQu.close();
	     int divisor = 4;
	     int quotient = dividend / divisor;
	     int remainder = dividend % divisor;
	 System.out.println("Quotient of no.: " + quotient );
	 System.out.println("Remainder : " + remainder);
	}

}

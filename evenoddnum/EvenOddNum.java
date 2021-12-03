package evenoddnum;

import java.util.Scanner;
public class EvenOddNum {

	public static void main(String[] args) {
		System.out.println("Enter the number you want check is Even or odd ");
			Scanner scNum = new Scanner (System.in);
			int Number = scNum.nextInt();
			scNum.close();
			
			EvenOddNum evenoddnum = new EvenOddNum();
			evenoddnum.CheckNum(Number);
	}

	public void CheckNum (int Number) {
		if (Number % 2 == 0) {
			System.out.println("Entered number is even number : " + Number );
		}else {
			System.out.println("Entered number is odd number : " + Number );
		}
	}
}

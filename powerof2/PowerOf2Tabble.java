package powerof2;

import java.util.Scanner;
public class PowerOf2Tabble {

	public static void main(String[] args) {
		
		System.out.println("Enter the power of 2 till number you want ");
		
		Scanner scPower = new Scanner(System.in);
		
		int  N = scPower.nextInt();
		scPower.close();
		if (N >0 && N<31) {
			PowerOf2Tabble x = new PowerOf2Tabble();
			x.checkPowerOf(N);
		
		}else {
			System.out.println("Invalid input : " + N);
		}
	}
	public void checkPowerOf(int N) {
		for (int i = 0; i < N; i++) {
			int result = 2 * i;
					
			System.out.println("power of 2: " + result);
			
		}
	}
		
	}


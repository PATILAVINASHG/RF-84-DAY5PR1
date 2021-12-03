package vowelconsonant;

import java.util.Scanner;
public class VowelConso {
	
		public static void main (String[] args) {
			
			Scanner inpute = new Scanner (System.in);
			System.out.println("Enter the Charcter you want check if it is vowel or consonant : ");
			char  x = inpute.next().charAt(0);
		
			char arr[] = { 'a' ,'e','i','o','u', 'A', 'E', 'I','O','U'};
			int i;
			boolean found = false;
			//for( i =0; i>=arr.length; i++) {
				for  ( i= 0; i<arr.length; i++) {
					if (x== arr[i]) {
						
				System.out.println("Enter char is  vowel ;" + arr[i]);
						found= true;
					}
				}
			if(found == false) {
				System.out.println("Enter char is  consananat ;" + x);
			}
		//	System.out.println("" + x + arr[i]);
				}
				
	}


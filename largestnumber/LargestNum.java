package largestnumber;

public class LargestNum {
	
		public static void main (String[] args) {
			
			int num1 = 50;
			int num2 = 41;
			int num3 = 40;
			
			if (num1 > num2 && num1 > num3) {
				System.out.println("largest number is : "+ num1);
			}else if (num2 > num1 && num2 > num3) {
				System.out.println("largest number is :" + num2);
			}else {
				System.out.println("largest number is : " + num3);
			}
		}
}

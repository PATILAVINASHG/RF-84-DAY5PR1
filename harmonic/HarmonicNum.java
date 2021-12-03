package harmonic;

public class HarmonicNum {

	public static void main(String[] args) {
	float result  = 1;
		for (int n = 1; n <= 100; n++) {
			
		 result +=  (float)1/n;
			 System.out.println("harmonic no. : " + result);
			}
		}
		//System.out.println("Nth harmonic number : "+ result);
	}


import java.math.BigInteger;
import Tools.Factors;

public class Problem16PowerDigitSum {

	public static void main(String[] args) {
		
		int result = power_of_two_digit_sum(1000);
		System.out.print("Result= "+result);
	}
	
	public static int power_of_two_digit_sum( int n) {
		
		BigInteger a = BigInteger.valueOf(2).pow(n);
		
		return Factors.digit_sum_string(a.toString());
		
		
		
			
		}
		
		
		
	
	}
	



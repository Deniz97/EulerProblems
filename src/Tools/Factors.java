package Tools;

public class Factors {
	
	public static int FactorCount(int n) {
		
		int factor_count=0;
		for(int i=1;i*i<=n;i++) {
			if (n%i==0) factor_count++;
		}
		
		return factor_count*2;
	}
	
	public static int FactorCount(long n) {
		
		int factor_count=0;
		for(int i=1;i*i<=n;i++) {
			if (n%i==0) factor_count++;
		}
		
		return factor_count*2;
	}

	
	public static boolean checkPrime( int n) {
		
		if ( n%2 == 0 && n != 2) { return false; }
		for (int i = 3; i*i<=n ; i+=2) {
			
			if ( n % i == 0) { return false; }
		}
		
		
		
		
		return true;
		
	}
	
	public static int digit_sum(int n) {
		
		int sum = 0;
		while (n>0) {
			
			sum += n%10;
			n /= 10;
			
		}
		return sum;
	}

	public static int digit_sum_string(String s) {
		int sum = 0;
		char c;
		for (int i=0;i<s.length();i++) {
			c = s.charAt(i);
			sum += Character.getNumericValue(c);
		}
		return sum;
	}
	

}

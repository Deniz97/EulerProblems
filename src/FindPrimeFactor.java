import java.util.ArrayList;
import java.util.List;

public class FindPrimeFactor {

	public static void main(String[] args) {
		
		//findPrimeFactors(600851475143L);
	}
	public static List<Integer> findPrimeFactors(long sayi) { //add static
		
		long bigNumber = sayi;  //600851475143L
		
		int n = 3;
		long maxPrime = 1;
		List<Integer> primes = new ArrayList<Integer>();
		while (bigNumber>1) {
			if(bigNumber%n==0 && checkPrime(n)) {
				maxPrime=n;
				primes.add(n);
				while(bigNumber%n==0) {
					bigNumber /= n;
				}
			}
			n++;
		}
		System.out.print("sonuc= "+maxPrime);
		return primes;
		
	}
	public static boolean checkPrime(long sayi){
		for(long i=3;i*i<=sayi;i+=2){
			if(sayi%i==0)
				return false;
		}
		return true;
		
		
	}
	
    
}



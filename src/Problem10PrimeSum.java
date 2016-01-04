
public class Problem10PrimeSum {

	public static void main(String[] args) {
		long sum=2;
		for ( int i = 3;i<2000001;i+=2) {
			if ( Problem3maxPrime.checkPrime(i)) {
				sum+=i;
			}
		}
			System.out.print("answer ="+sum);

	}

}

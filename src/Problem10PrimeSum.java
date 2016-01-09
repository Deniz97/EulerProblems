import Tools.Factors;

public class Problem10PrimeSum {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long sum=2;
		for ( int i = 3;i<2000001;i+=2) {
			if ( Factors.checkPrime(i)) {
				sum+=i;
			}
		}
			time = System.currentTimeMillis() - time;
			System.out.print("answer ="+sum);
			System.out.print("\nTime Elapsed= "+time);

	}

}

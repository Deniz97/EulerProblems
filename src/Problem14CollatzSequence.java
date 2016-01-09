public class Problem14CollatzSequence {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long longest = 1;
		long result = 1;
		long[] list = new long[(500000*2)+1];
		for (long n = 2; n<=1000000;n+=1) {
			
			
			long counter = 0;
			long control = n;
			long i = n;
			
			while(i!=1) {
				counter++;
				if (i%2==0) {
					i = i/2;
				}
				else {
					i = 3*i+1;
				}
				
				if (i<control) { list[(int)n]=counter + list[(int)i]; break; }
				
			}
			
			
			int term_count= (int)list[(int)n];
			
			if (term_count>longest) { longest = term_count; result = n; }
			
			
		}
		System.out.print("Longest starting number= "+result+" Term count= "+(longest+1));
		time = System.currentTimeMillis()-time;
		System.out.print("\nTime elapse= "+time);
	}
	
	public static long collatz_term(long n) {
		
		long counter = 1;
		while(n!=1) {
			System.out.print(" -> "+n);
			if (n%2==0) {
				n = n/2;
			}
			else {
				n = 3*n+1;
			}
			counter++;
		}
		
		
		return counter;
	}

}

		


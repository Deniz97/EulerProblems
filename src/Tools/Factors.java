package Tools;

import java.util.Vector;

public class Factors {

	public static int howManyFactors(int n) {
		
		//int factor_count=0;
		//for(int i=1;i<=n;i++) {
		//	if (n%i==0) factor_count++;
		//}
		
		//return factor_count;
		
		Vector<Integer> asallar =new Vector<Integer>(20,2);
		  
		  for (int i=3; i*i<=n; i+=2) {
			
			  if ( n % i == 0 && checkPrime(i)) {
				  
				  int sayac = 0;
				  while ( n % i == 0 ) {
					  n /= i;
					  sayac++;
				  }
				  asallar.add(sayac);
				  
			  }
		  }
		  
		  int factor_count = 1;
		  for (int i = 0; i<asallar.size();i++) {
			  factor_count *= asallar.elementAt(i)+1;
		  }
		  
		  return factor_count;
	}
	
	public static int howManyFactors(long n) {
		
		  Vector<Integer> asallar =new Vector<Integer>(20,2);
		  
		  for (int i=3; i*i<=n; i+=2) {
			
			  if ( n % i == 0 && checkPrime(i)) {
				  
				  int sayac = 0;
				  while ( n % i == 0 ) {
					  n /= i;
					  sayac++;
				  }
				  asallar.add(sayac);
				  
			  }
		  }
		  
		  int factor_count = 1;
		  for (int i = 0; i<asallar.size();i++) {
			  factor_count *= asallar.elementAt(i)+1;
		  }
		  
		  return factor_count;
		  

	}

	public static boolean checkPrime( int n) {
		
		
		for (int i = 3; i*i<=n ; i+=2) {
			
			if ( n % i == 0) { return false; }
		}
		
		if ( n%2 == 0 && n != 2) { return false; }
		
		
		return true;
		
	}
}

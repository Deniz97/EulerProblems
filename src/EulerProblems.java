
public class EulerProblems {
	
	public static void main(String[] args)
	{
		long bigNumber = 600851475L; //600851475143L
		long maxPrime = 1;
		for(long i=3;i<bigNumber;i+=2) {
			if(bigNumber%i==0)
				if(checkPrime(i))
					
					maxPrime=i;
		}
		System.out.print("sonuc= "+maxPrime);
	}
	
	public static boolean checkPrime(long sayi){
		for(long i=3;i*i<=sayi;i+=2){
			if(sayi%i==0)
				return false;
		}
		return true;
	}
}
	
	
import Tools.Factors;

public class PRoblem12BigTriangleNumber {

	public static void main(String[] args) {
		int result = triangleNumber_with_n_divisor(500);
		System.out.print("Answer= "+result);
		
	}
	
	public static int nincirakam( int n ) {
		
		return n * (n+1) / 2;
	}
	
	public static int triangleNumber_with_n_divisor(int n) {
		
		int triangleNumber;
		for(int i=1; ;i++) {
			triangleNumber = nincirakam(i);
			if (Factors.howManyFactors(triangleNumber)>=n){
				System.out.println(i+". number");
				return triangleNumber;
			}
		}
		
		
	}

}

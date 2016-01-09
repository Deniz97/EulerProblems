import Tools.Factors;

public class Problem12BigTriangleNumber {

	public static void main(String[] args) {
		
		int result = triangleNumber_with_n_divisor(500);
		System.out.print("Answer= "+result);
		
	}
	public static int find_nth_triangle(int nth) {
		
		return (nth*(nth+1))/2;
	}
		
	
	public static int triangleNumber_with_n_divisor(int n) {
		
		int triangleNumber;
		for(int i=1;  ;i++) {
			triangleNumber = find_nth_triangle(i);
			if (Factors.FactorCount(triangleNumber)>=n){
				System.out.println(i+". number");
				return triangleNumber;
			}
		}
		
		
	}

}
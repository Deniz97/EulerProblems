
public class Problem9triplet {

	public static void main(String[] args) {
			int sonuc = findTriplet(1000);
			System.out.print("sonuc= "+sonuc);
		}
		
	public static int findTriplet(int sayi)  {
		    for (int a = 1; a < sayi; a++)
		        for (int b = 2; b < a; b++)
		            {
		                if (a*a +b*b == (sayi-a-b)*(sayi-a-b))
		                    return a*b*(sayi-a-b); 
		            }

		    return -1;
		}
		
		
		
	
	
}


public class Problem6Squares {

	public static void main(String[] args) {
		int squareSums = findSquareSums(100);
		int sumsSquare = findSumsSquare(100);
		int sonuc = sumsSquare - squareSums ;
		System.out.print("sonuc= "+sonuc);
	}

	public static int findSquareSums(int sayi) {
		
		int sum=0;
		
		for(int i=1;i<=sayi;i++) {
			sum+= i*i;
		}
		return sum;
	}

	public static int findSumsSquare(int sayi) {
		int sum=0;
		for(int i=1;i<=sayi;i++) {
			sum += i;
		}
		return sum*sum;
	}
}

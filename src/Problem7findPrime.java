
public class Problem7findPrime {
	public static void main(String[] args) {
		
		int kontrol=2;
		int i =3;
		for (;kontrol<=10001;i+=2) {
			if(checkPrime(i)) {  kontrol++; }
			
		}
		
		System.out.print("sonuc= "+(i-2));
	}
	
	public static boolean checkPrime(int sayi) {
		
		for (int i=3;i*i<=sayi;i+=2) {
			if (sayi%i==0) return false;
		}
		return true;
	}
}

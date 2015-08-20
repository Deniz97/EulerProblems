import java.util.ArrayList;
import java.util.List;

public class Problem5SmallestMultiple {

	public static void main(String[] args) {
		
		boolean anan;
		int sonuc;
		for (int i=1;;i++){
			anan = true;
			for(int j=1;j<21;j++) {
				if( i%j != 0) {
					anan = false;
					break;
				}
			}
			if(anan) {  sonuc=i; break; } 
				
		}
		System.out.print("sonuc= "+sonuc);
	
	}
}

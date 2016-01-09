
public class Problem17LetterCount {

	public static void main(String[] args) {
		
		int result = letter_count(1000);
		System.out.print("Result= "+result);
		

	}
	
	public static int letter_count(int n) {
		
		int sum = 0;
		for (int i = 1;i<n;i++) {
			int a = i%100;
			switch (a) {
				case 10: sum = sum + 3 +third_digit(i); break;
				case 11: case 12: sum = sum + 6 +third_digit(i); break;
				case 19: case 18: case 13: case 14: sum = sum + 8 +third_digit(i); break;
				case 16: case 15: sum = sum + 7 +third_digit(i); break;
				case 17: sum = sum + 9 +third_digit(i); break;
				default: sum = sum+ first_digit(i) + second_digit(i)+third_digit(i); break;
			
			}
			if (i>100 && i%100!=0) { sum += 3; }
		}
		if (n==1000) { return sum + 3 + 8; }
		return sum;
		
		}
		
		
	
	
		
	static int first_digit(int n) {
		
		n = n%10;
		switch (n) {
		case 1:	case 2: case 6: return 3;
		case 3: case 7: case 8: return 5;
		case 4: case 5: case 9:  return 4;
		default: return 0;
		}
		
		}
	static int second_digit(int n) {
		
		n /= 10;
		n = n%10;
		switch (n) {
		case 2: case 3: case 8: case 9: return 6;
		case 4: case 5: case 6: return 5;
		case 7: return 7;
		default: return 0;
		}
		
		
		}
	static int third_digit(int n) {
		if (n>99) {	 return first_digit(n/100) + 7;}
		else { return 0; }
		
		
	}
		
	
	

	}

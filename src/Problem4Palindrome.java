
public class Problem4Palindrome {

	static boolean CheckIfPalindrome(long num) {
		 long n = num;
		 long rev = 0;
		 int dig;
		 while (num > 0)
		 {
		      dig = (int)(num % 10);
		      rev = rev * 10 + dig;
		      num = num / 10;
		 }
		 
		 if (rev==n) return true;
		 else return false;
        
        
    };
    
    public static void main(String[] args) {
    	for(int i =999;i>=100;i--) {
        for(int j=999;j>=100;j--){
            if (CheckIfPalindrome(i*j) && i*j>500000) {
                //return i*j;
            	System.out.println(i*j); 
            	//use an array and find the max!
            	}
        }
    }
    			System.out.print("bitti");
    }
};
	
	



public class Problem15LatticePaths {

	public static void main(String[] args) {
		//Another easy solution would be 40!/(20!*20!)
		
		// long result= PathCountRecursive(20,20);
			long result = PathCountIterative(20,20);
		System.out.print("Result= "+result);
		

	}
	
	public static long PathCountRecursive(int a, int b) {

		if (a==0 || b==0) { return 1; }
		else if (a==b) { return 2*PathCountRecursive(a-1,b);	}
		else { return PathCountRecursive(a-1,b)+PathCountRecursive(a,b-1); }
	
	}
	
	public static long PathCountIterative(int a, int b) {

		long[][] grid = new long[a+1][b+1];
		
		for (int i=0;i<=a;i++) {
			for (int j=0;j<=b;j++) {
				if (i==0 || j==0) { grid[i][j]=1; }
				else if (i==j) { grid[i][j] = 2 * grid[i-1][j]; }
				else { grid[i][j] = grid[i-1][j] + grid[i][j-1]; }
				System.out.println("Grid["+i+"]["+j+"] = "+grid[i][j]);
			}
		}
		
		return grid[a][b];
	
	}
}

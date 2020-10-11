public class LinearSummation {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //Get start time of program
		int n = 1500000000;
		LinearSummation(n);
		long end = System.currentTimeMillis(); // End time of program
		long runTime = end - start; //Calculate Duration
		System.out.println(runTime);
	}
	
	public static void LinearSummation(int n) {
		int sum = 0;
		int i;
		
		for(i=1; i<=n; i++) {
			sum = sum + i;
		}
		
		//sum = sum + (n-1) + 1;
		System.out.println(sum);
		
	}
	
	/*
	 * We were able to remove line 15 by making i<=n
	 * However to use LinearSummation as per the LinearEquation
	 * We should use sum = sum + (n-1) + 1
	 */
}

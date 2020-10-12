public class LinearSummation {
	public static void main(String[] args) {
		int n = 1500000000;
		long start = System.nanoTime(); //Get start time of program
		int finalAnswer = LinearSummation(n);
		long end = System.nanoTime(); // End time of program
		long runTime = end - start; //Calculate Duration
		System.out.println("Final Answer: " + finalAnswer);
		System.out.println("Run Time: " + runTime);
	}
	
	public static int LinearSummation(int n) {
		int sum = 0;
		int i;
		
		for(i=1; i<=n; i++) {
			sum = sum + i;
		}
		
		//sum = sum + (n-1) + 1;
		return sum;
		
	}
	
	/*
	 * We were able to remove line 15 by making i<=n
	 * However to use LinearSummation as per the LinearEquation
	 * We should use sum = sum + (n-1) + 1
	 */
}

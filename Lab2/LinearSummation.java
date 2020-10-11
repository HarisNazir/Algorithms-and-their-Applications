public class LinearSummation {
	public static void main(String[] args) {
		int n = 15;
		System.out.println(LinearSummation(n));
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

public class GeometricSummation {

	public static void main(String[] args) {
		double a = 1;
		double N = 3;
		long start = System.nanoTime();
		double finalAnswer = geoSum(a, N);
		long end = System.nanoTime();
		long runTime = end - start;
		System.out.println("Final Answer: " + finalAnswer);
		System.out.println("Run Time " + runTime);
	}
	
	public static double geoSum(double a, double N) {
		double i;
		double sum = 0;
		for(i = 0; i <= N; i++) {
			sum = sum + Math.pow(a, i);
		}
		
		return sum;
	}
}
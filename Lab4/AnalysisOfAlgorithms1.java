import java.util.Arrays;

public class AnalysisOfAlgorithms1 {
	public static void main(String[] args) {
		double x[] = new double[] {7, 3, -1, 2, 9 ,0, 0.8, 52, 2.2, 900};
		System.out.println(Arrays.toString(PrefixAverages1(x)));
	}
	
	public static double[] PrefixAverages1(double[] x) {
		double a[] = new double[x.length];
		
		for(int i = 0; i <= x.length - 1; i++) {
			double s = x[0];
			for(int j = 1; j <= x.length - 1; j++) {
				if ( j <= 1) {
					s = s+x[j];
				}
			}
			a[i] = s / (i+1);
		}
		
		return a;
		
		
	}
}


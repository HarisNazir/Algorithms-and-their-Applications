import java.util.Arrays;

public class AnalysisOfAlgorithms2 {
	public static void main(String[] args) {
		double x[] = new double[] {7, 3, -1, 2, 9 ,0, 0.8, 52, 2.2, 900};
		System.out.println(Arrays.toString(PrefixAverages1(x)));
	}
	
	public static double[] PrefixAverages1(double[] x) {
		double a[] = new double[x.length];
		double s = 0;
		
		for(int i = 0; i <= x.length - 1; i++) {
			s = s+x[i];
			a[i] = s / (i+1);
		}
		return a;
	}
}

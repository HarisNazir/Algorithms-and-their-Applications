public class ArrayMaxExercise {
	public static double ArrayMax() {
		double array1[] = {1,2,3,4,5};
		double currentMax = array1[0];
		for(int i = 1; i < array1.length; i++) {
			if(array1[i] > currentMax) {
				currentMax = array1[i];
			}
		}
		
		return currentMax;
		
	}
	
	public static void main(String[] args) {
		System.out.println(ArrayMax());
	}
}

public class ArrayMin {
	public static double ArrayMin() {
		double array1[] = {1,2,3,4,5};
		double currentMin = array1[0];
		for(int i = 1; i < array1.length; i++) {
			if(array1[i] < currentMin) {
				currentMin = array1[i];
			}
		}
		
		return currentMin;
		
	}
	
	public static void main(String[] args) {
		System.out.println(ArrayMin());
	}
}

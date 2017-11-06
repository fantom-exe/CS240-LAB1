public class MergeSort {
	
	public void iterative(int[] array) {
		int mid; // marks the midpoint where the array splits
		int[] left; // left portion of array
		int[] right; // right portion of array
		
		// init variables
		mid = array.length / 2;
		left = new int[array.length - mid];
		right = new int[mid];
		
		// populate left array
		for(int i = 0; i < mid; i++) {
			left[i] = array[i];
			
		}
		// populate right array
		for(int i = mid; mid < array.length; i++) {
			right[i] = array[i];
			
		}
		
		
	
	}
	
	public void recursive(IntegerArray array) {
	
	}
	
}


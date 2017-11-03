public class SelectiveSort {
	
	public void iterative(int[] array) {
		int min; // smallest number in array
		int swapIndex; // temporary index used for swapping
		
		// sort
		for(int i = 0; i < array.length; i++) {
			// assign minimum
			min = array[i];
			swapIndex = i;
			
			// search array
			for(int j = i; j < array.length; j++) {
				if(min > array[j]) { // if new minimum found -> reassign minimum
					min = array[j];
					swapIndex = j;
				}
			}
			
			// swap
			array[swapIndex] = array[i];
			array[i] = min;
		}
		
	}
	
//	public void recursive(int[] array, int min, int swapIndex) {
//
//
//		recursive(array, );
//	}

}

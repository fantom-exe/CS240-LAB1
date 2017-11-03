public class SelectiveSort {
	
	public void iterative(int[] array) {
		int min; // smallest number in array
		int indexOfMin; // index of the minimum value
		
		// sort
		for(int i = 0; i < array.length; i++) {
			// assign minimum
			min = array[i];
			indexOfMin = i;
			
			// search array
			for(int j = i; j < array.length; j++) {
				if(min > array[j]) { // if new minimum found -> reassign minimum
					min = array[j];
					indexOfMin = j;
				}
			}
			
			// swap
			array[indexOfMin] = array[i];
			array[i] = min;
		}
		
	}
	
//	public void recursive(int[] array, int min, int indexOfMin) {
//
//
//		recursive(array, );
//	}

}

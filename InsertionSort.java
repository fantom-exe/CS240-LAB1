public class InsertionSort {
	
	public void iterative(int[] array) {
		int swap = -1; // temporary variable used for swapping
		int swapIndex = -1; // index of swap
		
		// select next unsorted num in array and (re)set currentNumIndex
		for(int i = 0; i < array.length; i++) {
			swap = array[i];
			swapIndex = i;
			
			// backtrack through sorted subset of array
			for(int j = i-1; j >= 0; j--) {
				// swap
				if(swap < array[j]) {
					array[swapIndex] = array[j];
					array[j] = swap;
					
					// update swapIndex
					swapIndex = j;
				}
				
			}
		}
		
	}
	
	public void recursive(int[] array) {
	
	
	}
	
	// print contents of array
	protected void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
	}
}



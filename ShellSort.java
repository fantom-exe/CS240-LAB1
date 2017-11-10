public class ShellSort {
	/**
		Using Hibbard Sequence -> 1, 3, 7, ..., (2 * previous + 1)
	*/
	public void iterative(int[] array) {
		
		
		
		// insertion sort
		
		int currentNum = -1; // currently selected number
		int currentNumIndex = -1; // index of variable currentNum
		
		// select next unsorted num in array and (re)set currentNumIndex
		for(int i = 0; i < array.length; i++) {
			currentNum = array[i];
			currentNumIndex = i;
			
			// backtrack through sorted subset of array
			for(int j = i-1; j >= 0; j--) {
				// swap
				if(currentNum < array[j]) {
					array[currentNumIndex] = array[j];
					array[j] = currentNum;
					
					// update currentNumIndex to the new location of currentNum
					currentNumIndex = j;
				}
				
			}
		}
	
	}
	
	public void recursive(IntegerArray array) {
	
	}
	
}


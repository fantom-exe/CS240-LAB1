public class ShellSort {
	/**
		Using Hibbard Sequence -> 1, 3, 7, ..., (2 * previous + 1)
	*/
	public void iterative(int[] array) {
		
		// find sequence #
		int seqNum = 1;
		
		while (seqNum <= array.length/2)
			seqNum = (2 * seqNum) + 1;
		
		// insertion sort
		int numAtIndex = -1; // currently selected number
		int numAtSeqNum = -1; // number at index of sequence #
		int currentNumIndex = -1; // index of variable currentNum
		boolean noSwaps = true; // if no more swaps were made, then array must be sorted
		int tempSeqNum;
		
		while(noSwaps) {
			// reset indexes
			currentNumIndex = 0;
			tempSeqNum = seqNum;
			
			// compare data at index with data at sequence # (h+index)
			for(int i = 0; i < array.length; i++) {
				numAtIndex = array[i];
				
				currentNumIndex = i;
				
				if(array[i] < array[i + seqNum]) {
					
					
					noSwaps = false;
				}
			}
			
			//
			
			
			
			
			// select next unsorted num in array and (re)set currentNumIndex
			for (int i = 0; i < array.length; i++, h++) {
				
				// backtrack through sorted subset of array
				for (int j = i - 1; j >= 0; j--) {
					// swap
					if (array[i] < array[j]) {
						array[currentNumIndex] = array[j];
						array[j] = currentNum;
						
						// update currentNumIndex to the new location of currentNum
						currentNumIndex = j;
					}
					
				}
			}
		
		}
		
	}
	
	public void recursive(IntegerArray array) {
	
	}
	
}


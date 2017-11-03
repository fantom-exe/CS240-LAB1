public class InsertionSort {
	
	public void iterative(int[] array) {
		int currentNum; // currently selected number
		int currentNumIndex; // index of the current value
		int beginUnsortedSubset; // index of where 'unsorted' subset of the array begins
		int swap; // temporary value used to swap
		
		// sort
		for(int i = 0; i < array.length; i++) {
			currentNum = array[i];
			currentNumIndex = i;
			beginUnsortedSubset = i+1;
			
//			for(int j = i+1; j < array.length; j++) {
//				if(min > array[j]) {
//					min = array[j];
//					indexOfMin = j;
//				}
//			}
			
			for(int j = 0; j < beginUnsortedSubset; j++) {
				if(currentNum < array[j]) {
					for(int k = beginUnsortedSubset; k >= j; k--) {
						swap = array[k];
						array[k+1] = swap;
					}
					
					swap = array[j];
					array[j] = currentNum;
//					array[currentNumIndex] = swap;
				}
				
			}
			
			
		}
		
	}
	
	public void recursive(int[] array) {
	
	}
	
}



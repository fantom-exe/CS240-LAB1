public class InsertionSort {
	
	private int currentNum = -1; // currently selected number
	private int currentNumIndex = -1; // index of variable currentNum
	
	public void iterative(int[] array) {
		
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
	
	public void recursive(int[] array) {
		
		if(currentNumIndex >= 0 && currentNum < array[currentNumIndex - 1]) {
			array[currentNumIndex] = array[currentNumIndex - 1];
			array[currentNumIndex - 1] = currentNum;
			
//			currentNumIndex -= 1;
			
			if(--currentNumIndex >= 0)
				recursive(array);
			
			// test
			printArray(array);
		}
		
		currentNum = array[++currentNumIndex];
		
		if(currentNumIndex < array.length) {
			currentNumIndex++;
			recursive(array);
		}
		
	}
	
	// print contents of array
	protected void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
	}
}



public class SelectiveSort extends SortedArray {
	
	public int[] iterative(int[] array) {
		int[] sortedArray;
		int min; // smallest number in array
		int temp; // temporary number used for swapping
		
		// temporarily assume 1st number is minimum
		min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			min = array[i];
			
			if(min > array[i]) // reassign minimum
				min = array[i];
			
				
		}
		
		return sortedArray;
	}
	
	public int[] recursive(int[] array) {
	
	}
	
}

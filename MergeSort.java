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
		printArray(left);
		
		// populate right array
		for(int i = 0; mid < array.length; i++, mid++) {
			right[i] = array[mid];
		}
		printArray(right);
		
		// sort sub-arrays
		int first, second;
		
		// sort left array
		for(int i = 1, j = i-1; i < left.length; i+=2) {
			first = left[j];
			second = left[i];
			
			// swap
			if (second < first) {
				left[j] = second;
				left[i] = first;
			}
		}
		printArray(left);
		
		// sort right array
		for(int i = 1, j = i-1; i < right.length; i+=2) {
			first = right[j];
			second = right[i];
			
			// swap
			if (second < first) {
				right[j] = second;
				right[i] = first;
			}
		}
		printArray(right);
		
		// merge sorted arrays
		
		
		// array cursors
		int leftCursor = 0,
			rightCursor = 0,
			mainCursor = 0;
		
		// merge both arrays
		while (leftCursor < left.length && rightCursor < right.length) {
			if(left[leftCursor] < right[rightCursor]) {
//				array[];
				
				leftCursor++;
			}
			else {
				;
				
				rightCursor++;
			}
			
		}
		
		// copy left & right array to original array
		
		
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


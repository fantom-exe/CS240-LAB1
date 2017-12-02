import java.util.Random;

public class QuickSort {
	
	public void iterative(int[] array) {
		// generate random num for pivot
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		// assign pivot
		int pivotIndex = rand.nextInt(array.length);
		int pivot = array[pivotIndex];
		
		// partition array
		int[] smaller = new int[array.length];
		int[] larger  = new int[array.length];
		
		for(int i = 0, current; i < array.length; i++) {
			current = array[i];
			
			if(current <= pivot)
				smaller[i] = current;
			else
				larger[i] = current;
		}
		
		// copy smaller array onto main array
		for(int i = 0; i < smaller.length; i++) {
			array[i] = smaller[i];
		}
		
		// copy pivot
		array[smaller.length] = pivot;
		pivotIndex = smaller.length; // reset pivotIndex
		
		// copy larger array onto main array after pivot
		for(int i = 0; i < larger.length; i++) {
			array[pivotIndex + i] = larger[i];
		}
		
		
		
	}
	
	public void recursive(int[] array, int low, int high) {
	
	}
	
}


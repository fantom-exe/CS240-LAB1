import java.util.Random;

public class QuickSort {
	
	public void iterative(int[] array) {
		// generate random num for pivot
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		// assign pivot
		int pivot = array[rand.nextInt(array.length)];
		
		// sub-lists
		int[] left = new int[array.length]; // sub-list left of pivot
		int[] right = new int[array.length]; // sub-list right of pivot
		
		for(int i = 0; i < array.length; i++) {
		
		}
		
		
	}
	
	public void recursive(int[] array) {
	
	}
	
}


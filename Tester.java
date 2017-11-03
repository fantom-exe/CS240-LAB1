public class Tester extends UnsortedArray {
	
	public static void main(String[] args) {
		// create array
		UnsortedArray array = new UnsortedArray(); // array size 10 (if left blank)
		
		// sorting algorithms
		SelectiveSort selectiveSort = new SelectiveSort();
		
		selectiveSort.iterative(array.getArray()); // Selective sort
		
		array.printArray();
	}
	
}

public class Tester extends IntegerArray {
	
	public static void main(String[] args) {
		// create array
		IntegerArray array = new IntegerArray(); // array size 10 (if left blank)
		
		// print unsorted array
		System.out.print("Unsorted array: ");
		array.printArray();
		
		// sorting algorithms
		SelectiveSort selectiveSort = new SelectiveSort();
		
		// sort
		selectiveSort.iterative(array.getArray());
		
		// print sorted array
		System.out.print("Sorted array:   ");
		array.printArray();
	}
	
}

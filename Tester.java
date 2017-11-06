public class Tester extends IntegerArray {
	
	public static void main(String[] args) {
		// create array
		IntegerArray array = new IntegerArray(); // array size 10 (if left blank)
		
		// print unsorted array
		System.out.print("Unsorted array: ");
		array.printArray();
		
		// sorting algorithms
		SelectiveSort selectiveSort = new SelectiveSort();
		
//		selectiveSort.iterative(array.getArray());
//		selectiveSort.recursive(array.getArray());
		
		InsertionSort insertionSort = new InsertionSort();
		
//		insertionSort.iterative(array.getArray());
//		insertionSort.recursive(array.getArray());
		
		ShellSort shellSort = new ShellSort();
		
//		shellSort.iterative(array.getArray());
//		shellSort.recursive(array.getArray());
		
		MergeSort mergeSort = new MergeSort();

		mergeSort.iterative(array.getArray());
//		mergeSort.recursive(array.getArray());
		
		QuickSort quickSort = new QuickSort();
		
//		quickSort.iterative(array.getArray());
//		quickSort.recursive(array.getArray());
		
		RadixSort radixSort = new RadixSort();
		
//		radixSort.iterative(array.getArray());
//		radixSort.recursive(array.getArray());
		
		
		// print sorted array
		System.out.print("Sorted array:   ");
		array.printArray();
	}
	
}

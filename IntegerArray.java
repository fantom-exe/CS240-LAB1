import java.util.Random;

class IntegerArray {
	private int[] array;
	
	// Default constructor
	IntegerArray() {
//		array = new int[10]; // default array size 10
//		array = initRandArray(10); // default array size 10
		
		array = new int[]{38, 27, 43, 3, 9, 82, 10}; // used for testing
	}
	
	// Constructor with size specified
	IntegerArray(int size) {
		array = new int[size];
		array = initRandArray(size);
	}
	
	// return array
	protected int[] getArray() {
		return array;
	}
	
	// print contents of array
	protected void printArray() {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
	}
	
	// create and initialize array with random values
	private int[] initRandArray(int size) {
		// generate random nums
		Random rand = new Random();
		
		rand.setSeed(System.currentTimeMillis());
		
		// populate array
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
		}
		
		// return array
		return array;
	}
	
}

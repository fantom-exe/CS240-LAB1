import java.util.Random;

public class IntegerArray {
	private int[] array;
	private int index;
	
	IntegerArray() {
		array = initRandArray(10); // default array size 10
		index = 0;
	}
	
	IntegerArray(int size) {
		array = initRandArray(size);
		index = 0;
	}
	
	protected int[] getArray() {
		return array;
	}
	
	// create array and initialize with random values
	private int[] initRandArray(int size) {
		// populate array
		while (array.length < size) {
			array[index] = getRandomNum(size);
			index++;
		}
		
		// reset index
		index = 0;
		
		return array;
	}
	
	// random number generator used to populate array
	private int getRandomNum(int size) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		return rand.nextInt(size); // using variable size as range of random numbers
	}
}

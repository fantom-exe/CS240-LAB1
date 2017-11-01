import java.util.Random;

public class IntegerArray {
	private int[] array;
	private int index;
	
	IntegerArray(int size) {
		array = initRandArray(size);
		index = 0;
	}
	
	// random array generator
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
	private int getRandomNum() {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		return rand.nextInt(200); // numbers generated are
	}
}

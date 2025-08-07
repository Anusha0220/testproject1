package day3;
import java.util.Arrays;

public class examp2 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 5, 5}; 
	      int[] array2 = {1, 0, 6, 15}; 
	      int[] mergedArray = new int[array1.length + array2.length];
	      System.arraycopy(array1, 0, mergedArray, 0, array1.length);
	      System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
	      System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}


		 
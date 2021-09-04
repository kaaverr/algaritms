package max.edu;

import java.util.Arrays;

public class Main {
	public static int getMin(int[] array){
	int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]){
				min = array[i];
			}
		}
		return min;
	}

	public static int getMax(int[] array){
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]){
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] array) {
	int[] myArray = new int[5];
	myArray[0] = 15;
	myArray[1] = 34;
	myArray[2] = 43;
	myArray[3] = 62;
	myArray[4] = 5;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
//		System.out.println(Arrays.toString(myArray));

	int[] myArray2 = new int[]{10,5,12,7,1,64,31,5,63,656,4636,23,55};
	int[][] myArray3 = new int[][]{{1,0,1},{0,0,1,},{1,1,1}};

		for (int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(myArray3[i]));
		}
		System.out.println(getMin(myArray));
		System.out.println(getMax(myArray));
		System.out.println(" ");
	}
}

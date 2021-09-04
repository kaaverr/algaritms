package max.edu.sorting;

import java.util.Arrays;

public class Sorting {

    public static int[] sortByAsc(int[] myArray){
        for (int g = 0; g < myArray.length - 1; g++) {
                for (int i = 0; i < myArray.length -1; i++) {
                    if (myArray[i] > myArray[i+1]){
                        int boofer = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = boofer;
                    }
                    //2,6,18,63,12,45,35,4 ,7,242,-42,34,0,2
                }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray = new int[] {2,6,18,63,12,45,35,4,120,7,242,-42,34,0,2};
        sortByAsc(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

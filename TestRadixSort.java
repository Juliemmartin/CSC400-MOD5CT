

import java.util.Arrays;

public class TestRadixSort {

    //Main method to test radix sort
    public static void main(String[] args) {

        int[] testData = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};

        System.out.println("Original unsorted array: " + Arrays.toString(testData));
        sortRadixMax.radixSortMain(testData) ;

        System.out.println("Sorted array:   " + Arrays.toString(testData));

        //Test to verify sorted order
        boolean sorted = true;
        for (int i = 1; i < testData.length; i++) {
            if (testData[i - 1] > testData[i]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "This array has been sorted correctly." : "This array has not been sorted correctly.");
    }}
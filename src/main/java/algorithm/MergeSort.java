package algorithm;

import java.util.Arrays;

public class MergeSort {

    private final static MergeSort mergeSort = new MergeSort();

    public static void main(String[] args) {

        int[] input1 = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArray = mergeSort.mergeSort(input1);
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        assertEquals(expected, sortedArray);

        int[] input2 = {};
        int[] sortedArray2 = mergeSort.mergeSort(input2);
        int[] expected2 = {};
        assertEquals(expected2, sortedArray2);

        int[] input3 = {1};
        int[] sortedArray3 = mergeSort.mergeSort(input3);
        int[] expected3 = {1};
        assertEquals(expected3, sortedArray3);

        int[] input4 = {5, 4, 3, 2, 1};
        int[] sortedArray4 = mergeSort.mergeSort(input4);
        int[] expected4 = {1, 2, 3, 4, 5};
        assertEquals(expected4, sortedArray4);

        int[] input5 = {12, 34, 25, 21, 22, 33, 25, 32};
        int[] sortedArray5 = mergeSort.mergeSort(input5);
        int[] expected5 = {12, 21, 22, 25, 25, 32, 32, 34};
        assertEquals(expected5, sortedArray5);
    }

    public int[] mergeSort(int[] array) {
        int n = array.length;

        if (n <=1 ) {
            return array;
        }

        int half =  n / 2;

        int[] left = new int[half];
        System.arraycopy(array, 0, left, 0, half);
        System.out.println(Arrays.toString(left));

        int[] right = new int[n - half];
        System.arraycopy(array, half, right, 0, right.length);
        System.out.println(Arrays.toString(right));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        System.out.println("Merging left: " + Arrays.toString(left) + " and right: " + Arrays.toString(right));
        int[] merged = new int[(left.length + right.length)];
        // [38], [27, 43]
        int leftPos = 0, rightPos = 0, mergedPos = 0;
        while (leftPos < left.length && rightPos < right.length){
            if (left[leftPos] < right[rightPos]) {
                merged[mergedPos] = left[leftPos];
                leftPos++;
            } else {
                merged[mergedPos] = right[rightPos];
                rightPos++;
            }

            mergedPos++;
        }
        while (leftPos < left.length) {
            merged[mergedPos] = left[leftPos];
            leftPos++;
            mergedPos++;
        }

        while (rightPos < right.length) {
            merged[mergedPos] = right[rightPos];
            rightPos++;
            mergedPos++;
        }

        System.out.println("Merged result: " + Arrays.toString(merged));

        return merged;
    }


    public static void assertEquals(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected: " + Arrays.toString(expected) + ", but got: " + Arrays.toString(actual));
        }
    }
}

package algorithm;

public class BinarySearch {

    public int indexOf(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}

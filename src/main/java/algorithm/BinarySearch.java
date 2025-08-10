package algorithm;

public class BinarySearch {

    public int indexOf(int[] input, int target) {
        if (input.length == 0) {
            return -1;
        }

        return search(input, 0, input.length - 1, target);
    }

    private int search(int[] input, int start, int end, int target) {
        if (start == end && input[start] == target) {
            return start;
        } else if (start < 0 || end < 0 || start >= input.length || end >= input.length) {
            return -1;
        }

        int middle = start + (end - start) / 2;

        int newStart = start;
        int newEnd = end;

        if (input[middle] < target) {
            newStart = middle + 1;
        } else if (input[middle] > target) {
            newEnd = middle - 1;
        } else {
            return middle;
        }

        return search(input, newStart, newEnd, target);
    }
}

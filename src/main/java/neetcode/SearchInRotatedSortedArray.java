package neetcode;

public class SearchInRotatedSortedArray {


    public int search(int[] numbs, int target) {

        int l = 0;
        int r = numbs.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (numbs[m] > numbs[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;

        int result = binarySearch(numbs, target, 0, pivot);
        if (result != -1) {
            return result;
        }

        return binarySearch(numbs, target, pivot, numbs.length - 1);
    }


    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

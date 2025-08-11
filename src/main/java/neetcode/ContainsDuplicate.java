package neetcode;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        boolean found = false;
        for (int num : nums) {
            boolean result = set.add(num);
            if (!result) {
                found = true;
                break;
            }
        }
        return found;
    }
}

package neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private final ContainsDuplicate subject = new ContainsDuplicate();

    @Test
    void testSampleOne() {
        var nums = new int[]{1, 2, 3, 3};
        assertTrue(subject.hasDuplicate(nums));
    }

    @Test
    void testSampleTwo() {
        var nums = new int[]{1, 2, 3, 4};
        assertFalse(subject.hasDuplicate(nums));
    }

}
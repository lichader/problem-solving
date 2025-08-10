package neetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray subject = new SearchInRotatedSortedArray();
    private final int[] sampleOne = new int[]{3, 4, 5, 6, 1, 2};
    private final int[] sampleTwo = new int[]{1, 2, 3, 4, 5, 6};

    @ParameterizedTest
    @CsvSource({
            "1,4",
            "7,-1",
            "3,0",
            "2,5",
            "5,2",
            "6,3"
    })
    void sampleOneTest(int target, int expected) {
        assertEquals(expected, subject.search(sampleOne, target));
    }

    @ParameterizedTest
    @CsvSource({
            "3,2",
            "7,-1",
            "0,-1",
            "1,0",
            "6,5"
    })
    void sampleTwoTest(int target, int expected) {
        assertEquals(expected, subject.search(sampleTwo, target));
    }
}
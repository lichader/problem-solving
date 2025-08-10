package algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void sample1() {
        assertEquals(-1, binarySearch.indexOf(new int[]{}, 0));
    }

    @Test
    void sample2() {
        assertEquals(-1, binarySearch.indexOf(new int[]{1}, 0));
    }

    @Test
    void sample4() {
        assertEquals(0, binarySearch.indexOf(new int[]{1, 2}, 1));
    }

    @Test
    void sample5() {
        assertEquals(1, binarySearch.indexOf(new int[]{1, 2, 11}, 2));
    }

    @Test
    void sample6() {
        /**
         * start = 0,
         * end = 2,
         * middle = 3 /2 = 1
         *
         * a[1] = 2, 2 < 11
         *
         * start = 1 + 1 = 2,
         * end = 2
         *
         *
         *
         */
        assertEquals(2, binarySearch.indexOf(new int[]{1, 2, 11}, 11));
    }

    @Test
    void sample7() {
        assertEquals(2, binarySearch.indexOf(new int[]{1, 2, 3, 4, 11}, 3));
    }

    @Test
    void sample8() {
        assertEquals(2, binarySearch.indexOf(new int[]{1, 2, 3, 4, 11, 12}, 3));
    }
}
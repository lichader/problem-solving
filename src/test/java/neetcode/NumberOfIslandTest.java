package neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NumberOfIslandTest {

    private final NumberOfIsland subject = new NumberOfIsland();

    @Test
    void inputOne() {
        var input = new String[][]{
                {"0", "1", "1", "1", "0"},
                {"0", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };

        assertEquals(1, subject.result(input));
    }

    @Test
    void inputTwo() {
        var input = new String[][]{
                {"1", "1", "0", "0", "1"},
                {"1", "1", "0", "0", "1"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}
        };
        assertEquals(4, subject.result(input));
    }

    @Test
    void inputThree() {
        var input = new String[][]{
                {"1", "1", "0"},
                {"1", "1", "1"},
                {"0", "0", "1"},
                {"0", "0", "0"},
                {"1", "0", "1"},
        };
        assertEquals(3, subject.result(input));
    }

    @Test
    void edgeCase() {
        var input = new String[][]{};
        assertEquals(0, subject.result(input));
    }

    @Test
    void edgeCaseTwo() {
        var input = new String[][]{{"1", "1", "0", "1"}};
        assertEquals(2, subject.result(input));
    }
}
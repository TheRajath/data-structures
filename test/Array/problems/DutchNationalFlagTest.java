package Array.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DutchNationalFlagTest {

    DutchNationalFlag dutchNationalFlag;

    @BeforeEach
    void setUp() {

        dutchNationalFlag = new DutchNationalFlag();
    }

    @Test
    void works() {

        int[] array = { 0, 1, 2, 0, 1, 2 };

        dutchNationalFlag.sortedArray012(array);

        int[] expectedSortedArray = { 0, 0, 1, 1, 2, 2 };

        assertArrayEquals(array, expectedSortedArray);
    }

}

package Array.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeakElementTest {

    PeakElement peakElement;

    @BeforeEach
    void setUp() {

        peakElement = new PeakElement();
    }

    @Test
    void returns_the_first_element_when_array_length_is_1() {

        int[] array = {25};

        List<Integer> peakElementIndexes = peakElement.findPeakElementIndexes(array);

        Integer actualIndex = peakElementIndexes.get(0);

        assertEquals(1, peakElementIndexes.size());
        assertEquals(0, actualIndex);
        assertEquals(25, array[actualIndex]);
    }

    @Test
    void returns_peak_element_when_array_length_is_2() {

        int[] array = {45, 35};

        List<Integer> peakElementIndexes = peakElement.findPeakElementIndexes(array);

        Integer actualIndex = peakElementIndexes.get(0);

        assertEquals(1, peakElementIndexes.size());
        assertEquals(0, actualIndex);
        assertEquals(45, array[actualIndex]);
    }

    @Test
    void returns_peak_element_when_last_element_is_biggest() {

        int[] array = {25, 35, 45, 55};

        List<Integer> peakElementIndexes = peakElement.findPeakElementIndexes(array);

        Integer actualIndex = peakElementIndexes.get(0);

        assertEquals(1, peakElementIndexes.size());
        assertEquals(3, actualIndex);
        assertEquals(55, array[actualIndex]);
    }

    @Test
    void returns_peak_element_with_normal_array() {

        int[] array = {5, 10, 20, 15};

        List<Integer> peakElementIndexes = peakElement.findPeakElementIndexes(array);

        Integer actualIndex = peakElementIndexes.get(0);

        assertEquals(1, peakElementIndexes.size());
        assertEquals(2, actualIndex);
        assertEquals(20, array[actualIndex]);
    }

    @Test
    void returns_multiple_peak_element_with_normal_array() {

        int[] array = {10, 20, 15, 2, 23, 90, 67};

        List<Integer> peakElementIndexes = peakElement.findPeakElementIndexes(array);

        Integer index0 = peakElementIndexes.get(0);
        Integer index1 = peakElementIndexes.get(1);

        assertEquals(2, peakElementIndexes.size());
        assertEquals(1, index0);
        assertEquals(20, array[index0]);
        assertEquals(5, index1);
        assertEquals(90, array[index1]);
    }

}

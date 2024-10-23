package Array.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertElementTest {

    InsertElement insertElement;
    Arrays arrays = new Arrays();

    @BeforeEach
    void setUp() {

        insertElement = new InsertElement();
    }

    @Test
    void inserts_element_into_sorted_array() {

        int[] array = arrays.initializeSortedArray(6);

        insertElement.insertElementInSortedArray(array, array.length - 1, 35);

        assertEquals(35, array[3]);
    }

    @Test
    void inserts_element_into_unsorted_array() {

        int[] array = arrays.initializeUnsortedArray(6);

        insertElement.insertElementInUnsortedArray(array, array.length - 1, 45, 2);

        assertEquals(45, array[2]);
    }

}

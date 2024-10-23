package Array.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsortedArrayOperationsTest {

    UnsortedArrayOperations unsortedArrayOperations;
    Arrays arrays = new Arrays();

    @BeforeEach
    void setUp() {

        unsortedArrayOperations = new UnsortedArrayOperations();
    }

    @Test
    void finds_element_in_array() {

        int[] array = arrays.initializeUnsortedArray(5);

        int index = unsortedArrayOperations.searchElement(array, 40);

        assertEquals(1, index);
    }

    @Test
    void inserts_element_at_the_end_of_array() {

        int[] array = arrays.initializeUnsortedArray(5);

        int[] resultArray = unsortedArrayOperations.insertAtEnd(array, 50);

        assertEquals(6, resultArray.length);
        assertEquals(50, resultArray[resultArray.length - 1]);
    }

    @Test
    void inserts_element_at_specific_position_in_array() {

        int[] array = arrays.initializeUnsortedArray(5);

        int[] resultArray = unsortedArrayOperations.insertAtPosition(array, 2, 25);

        assertEquals(6, resultArray.length);
        assertEquals(25, resultArray[2]);
    }

    @Test
    void throws_No_Such_Field_Exception_when_element_not_found_in_array() {

        int[] array = arrays.initializeUnsortedArray(5);

        assertThrows(NoSuchFieldException.class, () -> unsortedArrayOperations.deleteElement(array, 25),
                "Element not found");
    }

    @Test
    void deletes_element_from_array() throws NoSuchFieldException {

        int[] array = arrays.initializeUnsortedArray(5);

        int[] resultArray = unsortedArrayOperations.deleteElement(array, 90);

        assertEquals(4, resultArray.length);
        assertNotEquals(90, resultArray[2]);
    }

}
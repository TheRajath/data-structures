package Array.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsortedArrayOperationsTest {

    UnsortedArrayOperations unsortedArrayOperations;

    @BeforeEach
    void setUp() {

        unsortedArrayOperations = new UnsortedArrayOperations();
    }

    @Test
    void finds_element_in_array() {

        int[] array = initializeArray();

        int index = unsortedArrayOperations.searchElement(array, 50);

        assertEquals(4, index);
    }

    @Test
    void inserts_element_at_the_end_of_array() {

        int[] array = initializeArray();

        int[] resultArray = unsortedArrayOperations.insertAtEnd(array, 50);

        assertEquals(6, resultArray.length);
        assertEquals(50, resultArray[resultArray.length - 1]);
    }

    @Test
    void inserts_element_at_specific_position_in_array() {

        int[] array = initializeArray();

        int[] resultArray = unsortedArrayOperations.insertAtPosition(array, 2, 25);

        assertEquals(6, resultArray.length);
        assertEquals(25, resultArray[2]);
    }

    @Test
    void throws_No_Such_Field_Exception_when_element_not_found_in_array() {

        int[] array = initializeArray();

        assertThrows(NoSuchFieldException.class, () -> unsortedArrayOperations.deleteElement(array, 25),
                "Element not found");
    }

    @Test
    void deletes_element_from_array() throws NoSuchFieldException {

        int[] array = initializeArray();

        int[] resultArray = unsortedArrayOperations.deleteElement(array, 30);

        assertEquals(4, resultArray.length);
        assertNotEquals(30, resultArray[2]);
    }

    private int[] initializeArray() {

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        return array;
    }

}
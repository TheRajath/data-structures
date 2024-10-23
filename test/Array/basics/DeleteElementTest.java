package Array.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DeleteElementTest {

    DeleteElement deleteElement;
    Arrays arrays = new Arrays();

    @BeforeEach
    void setUp() {

        deleteElement = new DeleteElement();
    }

    @Test
    void deletes_element_from_sorted_array() {

        int[] array = arrays.initializeSortedArray(5);

        assertEquals(20, array[1]);

        int newSizeAfterDeletion = deleteElement.deleteElementInSortedArray(array, array.length, 20);

        assertEquals(4, newSizeAfterDeletion);
        assertNotEquals(20, array[1]);
    }

    @Test
    void deletes_element_from_un_sorted_array() {

        int[] array = arrays.initializeUnsortedArray(5);

        assertEquals(40, array[1]);

        int newSizeAfterDeletion = deleteElement.deleteElementInUnsortedArray(array, array.length, 40);

        assertEquals(4, newSizeAfterDeletion);
        assertNotEquals(40, array[1]);
    }

}

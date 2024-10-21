package Array.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DynamicArrayTest {

    DynamicArray dynamicArray;

    @BeforeEach
    void setUp() {

        dynamicArray = new DynamicArray();
    }

    @Test
    void adds_element_to_array() {

        dynamicArray.add(10);

        assertEquals(1, dynamicArray.size);
        assertEquals(10, dynamicArray.get(0));
        assertEquals(1, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void array_size_doubles_when_array_is_full() {

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        assertEquals(4, dynamicArray.size);
        assertEquals(3, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void adds_element_at_the_end_of_array() {

        initializeArray();

        assertEquals(8, dynamicArray.size);
        assertEquals(10, dynamicArray.get(0));
        assertEquals(20, dynamicArray.get(1));
        assertEquals(30, dynamicArray.get(2));
        assertEquals(40, dynamicArray.get(3));
        assertEquals(50, dynamicArray.get(4));
        assertEquals(5, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void array_size_doubles_when_array_is_full_while_adding_at_specific_index() {

        dynamicArray.addAtIndex(0, 10);
        dynamicArray.addAtIndex(1, 20);
        dynamicArray.addAtIndex(2, 30);

        assertEquals(4, dynamicArray.size);
        assertEquals(3, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void throws_Index_out_of_bounds_exception_when_index_is_less_than_one() {

        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.addAtIndex(-1, 10),
                "Index out of bounds");
    }

    @Test
    void throws_Index_out_of_bounds_exception_when_index_is_more_then_size_while_adding() {

        initializeArray();

        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.addAtIndex(10, 10),
                "Index out of bounds");
    }

    @Test
    void add_element_at_specific_index() {

        initializeArray();

        dynamicArray.addAtIndex(1, 15);

        assertEquals(8, dynamicArray.size);
        assertEquals(15, dynamicArray.get(1));
        assertEquals(6, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void removes_element_from_end_of_array() {

        initializeArray();

        dynamicArray.remove();

        assertEquals(8, dynamicArray.size);
        assertEquals(0, dynamicArray.get(4));
        assertEquals(4, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void throws_Index_out_of_bounds_exception_when_index_is_less_then_one_while_removing() {

        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.removeAtIndex(-1),
                "Index out of bounds");
    }

    @Test
    void throws_Index_out_of_bounds_exception_when_index_is_more_then_size_while_removing() {

        initializeArray();

        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.removeAtIndex(10),
                "Index out of bounds");
    }

    @Test
    void removes_element_from_specific_index() {

        initializeArray();

        dynamicArray.removeAtIndex(2);

        assertEquals(8, dynamicArray.size);
        assertEquals(40, dynamicArray.get(2));
        assertEquals(4, dynamicArray.numberOfElementsAdded);
    }

    @Test
    void shrinks_array_size() {

        initializeArray();

        dynamicArray.shrinkSize();

        assertEquals(5, dynamicArray.size);
    }

    private void initializeArray() {

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
    }

}
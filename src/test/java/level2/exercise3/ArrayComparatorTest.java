package level2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayComparatorTest {


    private final ArrayComparator comparator = new ArrayComparator();

    @Test
    void test_TwoIdenticalArrays_ShouldReturnTrue() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertTrue(comparator.areArraysEqual(array1, array2), "Arrays should be the same");
    }

    @Test
    void test_TwoDifferentArrays_ShouldReturnFalse() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 2, 1};

        assertFalse(comparator.areArraysEqual(array1, array2), "Arrays shouldn't be the same");
    }

    @Test
    void test_TwoNullArrays_ShouldReturnTrue() {
        int[] array1 = null;
        int[] array2 = null;

        assertTrue(comparator.areArraysEqual(array1, array2), "Both nulls should be consider same");
    }

    @Test
    void test_OneNullAndOneNotNull_ShouldReturnFalse() {
        int[] array1 = null;
        int[] array2 = {1, 2, 3};

        assertFalse(comparator.areArraysEqual(array1, array2), "Null and other list shouldn't be the same");
    }

    @Test
    void test_ArraysOfDifferentLengths_ShouldReturnFalse() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2};

        assertFalse(comparator.areArraysEqual(array1, array2), "Arrays with different size should be consider as different");
    }

}

package level1.exercise3;

import leve1.exercise3.ArrayAccess;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayAccessTest {

    private final ArrayAccess arrayAccess = new ArrayAccess();

    @Test
    void testGetElement_WithValidIndex_ReturnsCorrectValue() {

        int[] numbers = {10, 20, 30};

        assertEquals(20, arrayAccess.getElement(numbers, 1));
    }

    @Test
    void testGetElement_IndexTooLow_ThrowsArrayIndexOutOfBoundsException() {

        int[] numbers = {10, 20, 30};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {

            arrayAccess.getElement(numbers, -1);
        });
    }

    @Test
    void testGetElement_IndexTooHigh_ThrowsArrayIndexOutOfBoundsException() {

        int[] numbers = {10, 20, 30};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {

            arrayAccess.getElement(numbers, 5);
        });
    }
}

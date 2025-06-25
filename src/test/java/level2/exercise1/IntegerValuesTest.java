package level2.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerValuesTest {

    private final IntegerValues integerValues = new IntegerValues();

    @Test
    void test_WhenTwoIntegersAreEqual_ShouldReturnTrue() {
        Integer a = 10;
        Integer b = 10;

        assertTrue(integerValues.areEqual(a, b), "Numbers should be the same");
    }

    @Test
    void test_WhenTwoIntegersAreNotEqual_ShouldReturnTrue() {
        Integer a = 10;
        Integer b = 25;

        assertTrue(integerValues.areNotEqual(a, b), "Numbers shouldn't be the same");
    }

    @Test
    void test_WhenTwoIntegersAreDifferentButSameValue_ShouldStillBeEqual() {
        Integer a = new Integer(100);
        Integer b = 100;

        assertTrue(integerValues.areEqual(a, b), "Different instances but, should be same value");
    }

    @Test
    void test_NullHandling_AreEqual_ShouldReturnFalse() {
        Integer a = null;
        Integer b = 10;

        assertFalse(integerValues.areEqual(a, b), "Can't be the same if one of them are null");
    }

    @Test
    void test_NullHandling_AreNotEqual_ShouldReturnTrue() {
        Integer a = null;
        Integer b = 10;

        assertTrue(integerValues.areNotEqual(a, b), "Null and value can't be the same");
    }
}

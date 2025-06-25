package level2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectTemplateTest {

    @Test
    void test_SameReference_ShouldPass() {

        ObjectTemplate object1 = new ObjectTemplate("Example");
        ObjectTemplate object2 = object1;

        assertSame(object1, object2, "Both references should point to the same object");
    }

    @Test
    void test_DifferentReferences_ShouldPass() {

        ObjectTemplate object1 = new ObjectTemplate("Example");
        ObjectTemplate object2 = new ObjectTemplate("Example");

        assertNotSame(object1, object2, "References should be the same");
    }
}

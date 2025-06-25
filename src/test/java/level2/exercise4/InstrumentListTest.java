package level2.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InstrumentListTest {

    @Test
    void test_ListMaintainsInsertionOrder() {
        InstrumentList list = new InstrumentList();

        Piano piano1 = new Piano("Yamaha");
        Guitar guitar1 = new Guitar("Fender");
        Piano piano2 = new Piano("Steinway");

        list.addInstrument(piano1);
        list.addInstrument(guitar1);
        list.addInstrument(piano2);


        assertEquals(piano1, list.getInstruments().get(0));
        assertEquals(guitar1, list.getInstruments().get(1));
        assertEquals(piano2, list.getInstruments().get(2));
    }

    @Test
    void test_ListContainsAllElementsRegardlessOfOrder() {
        InstrumentList list = new InstrumentList();

        Piano piano = new Piano("Casio");
        Guitar guitar = new Guitar("Ibanez");

        list.addInstrument(piano);
        list.addInstrument(guitar);

        assertTrue(list.containsInstrument(piano), "The list should contains the piano");
        assertTrue(list.containsInstrument(guitar), "The list should contains the guitar");
    }

    @Test
    void test_InstrumentIsAddedOnlyOnce() {
        InstrumentList list = new InstrumentList();

        Guitar guitar = new Guitar("Gibson");

        list.addInstrument(guitar);
        list.addInstrument(guitar);

        assertEquals(2, list.countInstrument(guitar), "The instrument should be two times");
    }

    @Test
    void test_ListDoesNotContainUnaddedInstrument() {
        InstrumentList list = new InstrumentList();

        Piano piano = new Piano("Kawai");
        Guitar guitar = new Guitar("ESP");

        list.addInstrument(piano);

        assertFalse(list.containsInstrument(guitar), "The list shouldn't contain the guitar");

    }
}

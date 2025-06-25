package level2.exercise6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstrumentTest {

    @Test
    public void testGetNote_ThrowsArrayIndexOutOfBoundsException() {

        Instrument instrument = new Instrument();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {

            instrument.getNote(6);

        }, "ArrayIndexOutOfBoundsException was expected when accessing an invalid index.");
    }
}
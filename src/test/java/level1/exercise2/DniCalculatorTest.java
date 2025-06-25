package level1.exercise2;

import leve1.exercise2.DniCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;

public class DniCalculatorTest {

    private final DniCalculator calculator = new DniCalculator();


    public static Stream<Arguments> dniDataProvider() {
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(99999999, 'R'),
                Arguments.of(0, 'T'),
                Arguments.of(11111111, 'V'),
                Arguments.of(22222222, 'Y'),
                Arguments.of(33333333, 'S'),
                Arguments.of(44444444, 'X'),
                Arguments.of(55555555, 'K'),
                Arguments.of(66666666, 'N'),
                Arguments.of(77777777, 'H')
        );
    }


    @ParameterizedTest
    @MethodSource("dniDataProvider")
    void testCalculateLetter(int dniNumber, char expectedLetter) {
        char calculatedLetter = calculator.calculateLetter(dniNumber);
        Assertions.assertEquals(expectedLetter, calculatedLetter,
                "The letter of DNI " + dniNumber + " most be " + expectedLetter);
    }
}

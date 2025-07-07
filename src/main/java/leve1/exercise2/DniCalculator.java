package leve1.exercise2;

public class DniCalculator {

    private static final String LETTERS = "TRWXNMYFSDXHNKZSNYVLCKE";
    private static final int DNI_LENGTH = 8;

    public char calculateLetter(int dniNumber) {

        String dniNumberStr = String.valueOf(dniNumber);


        if (dniNumberStr.length() != DNI_LENGTH) {

            throw new IllegalArgumentException("DNI number must have exactly " + DNI_LENGTH + " digits.");
        }

        int remainder = dniNumber % 23;

        return LETTERS.charAt(remainder);
    }

}

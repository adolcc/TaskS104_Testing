package leve1.exercise2;

public class DniCalculator {

    private static final String LETTERS = "TRWXNMYFSDXHNYZSNKVLCKE";

    public char calculateLetter(int dniNumber) {
        int remainder = dniNumber % 23;
        return LETTERS.charAt(remainder);
    }

}

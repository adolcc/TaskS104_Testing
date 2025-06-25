package level2.exercise1;

public class IntegerValues {


    public boolean areEqual(Integer a, Integer b) {
        return a != null && b != null && a.equals(b);

    }


    public boolean areNotEqual(Integer a, Integer b) {
        return !areEqual(a, b);

    }
}

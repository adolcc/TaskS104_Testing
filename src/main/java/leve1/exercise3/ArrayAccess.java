package leve1.exercise3;

public class ArrayAccess {

    public int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index" + index + " out of range");
        }
        return array[index];
    }
}


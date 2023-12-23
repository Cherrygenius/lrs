package lr6;

import java.util.Arrays;

public class Example6 {
    public static int[] copyArray1(int[] array, int number) {
        if (number <= array.length) {
            int[] copyArray = new int[number];
            for (int i = 0; i < number; i++) {
                copyArray[i] = array[i];
            }
            return copyArray;
        } else {
            int[] copyArray = Arrays.copyOf(array, array.length);
            return copyArray;
        }
    }
}

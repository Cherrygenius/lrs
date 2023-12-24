package lr6;

import java.util.Arrays;

public class Example10 {
    public static int[] findMinMax(int... numbers) {

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int[] result = {min, max};
        return result;
    }
}

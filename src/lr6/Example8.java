package lr6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example8 {
    public static double arrayAverage(int[] array) {
        int average = 0;
        for (int x:array) {
            average += x;
        }
        return (double)average/array.length;
    }
}

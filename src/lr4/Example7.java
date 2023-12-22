package lr4;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;

        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }
        System.out.println("Массив заполненный змейкой: ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

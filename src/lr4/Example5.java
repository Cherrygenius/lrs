package lr4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(200);
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


        int[][] swappedArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                swappedArray[j][i] = array[i][j];
            }
        }
        System.out.println("Массив с поменяными строками и столбцами: ");

        for (int i = 0; i < swappedArray.length; i++) {
            System.out.println(Arrays.toString(swappedArray[i]));
        };


    }
}

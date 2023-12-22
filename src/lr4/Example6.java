package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;

        int[][] array = new int[rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        int rowToRemove = random.nextInt(7);
        int colToRemove = random.nextInt(7);

        System.out.println("Исходный массив: " + colToRemove + " " + rowToRemove);
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] newArray = new int[rows-1][cols-1];

        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if(i != rowToRemove) {
                int newCol = 0;
                for (int j = 0; j < cols; j++) {
                    if(j != colToRemove){
                        newArray[newRow][newCol] = array[i][j];
                        newCol++;
                    }
                }
                newRow++;
            }
        }
        System.out.println("Массив с удаленным столбцом и строкой: ");
        for (int i = 0; i < rows-1; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}

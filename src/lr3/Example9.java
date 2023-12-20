package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int minValue = array[0];
        int[] minIndexes = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                count = 0;
                minIndexes[count] = i;
            } else if (array[i] == minValue) {
                count++;
                minIndexes[count] = i;
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы минимальных значений: ");
        for (int i = 0; i <= count; i++) {
            System.out.print(minIndexes[i] + " ");
        }
    }
}

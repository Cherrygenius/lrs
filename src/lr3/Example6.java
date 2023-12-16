package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        int i = 2;
        for (int j = 0; j < number; j++) {
            array[j] = i;
            i += 5;
        }
        for (int tmp : array) {
            System.out.println(tmp);
        }
    }
}

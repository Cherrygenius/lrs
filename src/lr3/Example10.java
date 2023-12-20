package lr3;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);
        for (int i = size-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

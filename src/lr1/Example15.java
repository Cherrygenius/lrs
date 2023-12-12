package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int number = scanner.nextInt();
        System.out.println("Введите 2 число");
        int number2 = scanner.nextInt();
        int result = number-number2;
        int result1 = number2+number;
        System.out.printf("%d, %d", result, result1);
    }
}

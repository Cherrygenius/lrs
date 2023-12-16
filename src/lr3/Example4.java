package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 > number1) {
            for (int i = number1; i < number2 + 1; i++) {
                System.out.println(i);
            }
        }
        if (number2 < number1) {
            for (int i = number2; i < number1 + 1; i++) {
                System.out.println(i);
            }
        }
    }
}

package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        System.out.println(number2+number);
    }
}

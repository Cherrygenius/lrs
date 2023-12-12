package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш год рождения:");
        int year = scanner.nextInt();
        int age = 2023-year;
        System.out.printf("Тебе %d лет", age);
    }
}

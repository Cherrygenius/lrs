package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш год рождения:");
        int year = scanner.nextInt();
        int age = 2023-year;
        System.out.println("Введите свое имя:");
        String name = scanner.nextLine();
        System.out.printf("Тебя зовут %s и тебе %d лет", name, age);
    }
}

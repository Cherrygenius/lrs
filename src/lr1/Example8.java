package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущей день недели:");
        String weekDay = scanner.nextLine();
        System.out.println("Введите название месяца:");
        String mounth = scanner.nextLine();
        System.out.println("Введите номер дня в месяце:");
        int dayNumber = scanner.nextInt();
        scanner.close();
        System.out.printf("%s, %s, %d", weekDay, mounth, dayNumber);

    }
}

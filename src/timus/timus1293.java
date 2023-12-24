package timus;

import java.util.Arrays;
import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сколько панелей надо обработать: ");
        int amount = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите размер панели(AxB): ");
        String size = scanner1.nextLine();
        String[] parts = size.split("x");
        System.out.println("Вес необходимого для обработки сульфида тория в нанограммах " + Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]) * amount * 2);
    }
}

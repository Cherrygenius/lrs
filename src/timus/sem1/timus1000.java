package timus.sem1;

import java.util.Scanner;

public class timus1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] arrayNumbers = numbers.split(" ");
        System.out.println(Integer.parseInt(arrayNumbers[0]) + Integer.parseInt(arrayNumbers[1]));
    }
}

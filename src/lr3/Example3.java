package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        int twoNumber = 1;
        int oneNubmer = 1;
        System.out.println("1");
        System.out.println("1");
        for (int j = 1; j < number; j++) {
            int total = twoNumber + oneNubmer;
            oneNubmer = twoNumber;
            twoNumber = total;
            System.out.println(total);
        }
    }
}

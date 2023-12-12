package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number + 1;
        int number2 = number + 1;
        int number3 = (int)Math.pow((number2+number1+number), 2);
        System.out.printf("%d, %d, %d, %d", number,number1,number2,number3);
    }
}

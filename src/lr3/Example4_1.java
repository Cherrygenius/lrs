package lr3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2>number1) {
            while (number2 >= number1) {
                System.out.println(number1++);
            }
        }else {
            while (number1>=number2){
                System.out.println(number2++);
            }
        }
    }
}

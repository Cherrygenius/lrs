package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number%3==0){
            System.out.println("Ваше число кратно 3");
        }
        else System.out.println("Ваше число некратно 3");
    }
}

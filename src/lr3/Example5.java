package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < number; i++) {
            int numberRandom = random.nextInt(200);
            if (numberRandom%5 == 2 || numberRandom % 3 == 1){
                total += numberRandom;
            }
        }
        System.out.println(total);
    }
}

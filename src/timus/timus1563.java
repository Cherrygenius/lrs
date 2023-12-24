package timus;

import java.util.Arrays;
import java.util.Scanner;

public class timus1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountShops = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        String[] shopsArray = new String[amountShops];
        for (int i = 0; i < amountShops; i++) {
            String shop = scanner.nextLine();
            if (Arrays.asList(shopsArray).contains(shop)) {
                shopsArray[i] = shop;
                counter++;
            } else {
                shopsArray[i] = shop;
            }
        }
        System.out.println(counter);
    }
}


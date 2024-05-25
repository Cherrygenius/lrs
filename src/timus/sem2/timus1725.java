package timus.sem2;

import java.util.Scanner;

public class timus1725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        scanner.close();

        int left = k - 1;
        int right = n - k;

        int maxStumbles = 1;

        System.out.println(maxStumbles);
    }
}

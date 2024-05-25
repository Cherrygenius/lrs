package timus.sem1;

import java.util.Scanner;

public class timus1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.next().length();

        long result = 1;
        int mod = n % k;

        for (int i = n; i > 0; i -= k) {
            result *= i;
        }

        if (mod != 0) {
            result *= mod;
        }

        System.out.println(result);
    }
}

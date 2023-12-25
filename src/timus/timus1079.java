package timus;

import java.util.Scanner;

public class timus1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while ((n = scanner.nextInt()) != 0) {
            int maximum = findMaximum(n);
            System.out.println(maximum);
        }
    }

    public static int findMaximum(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                a[i] = a[i / 2];
            } else {
                a[i] = a[i / 2] + a[i / 2 + 1];
            }
        }

        int maximum = 0;
        for (int i = 0; i <= n; i++) {
            maximum = Math.max(maximum, a[i]);
        }

        return maximum;
    }
}

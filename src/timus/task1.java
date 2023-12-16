package timus;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum;
        if (N >= 0) {
            sum = (N * (N + 1)) / 2;
        } else {
            sum = -((Math.abs(N) * Math.abs(N) + 1) / 2);
        }
        System.out.println(sum);
    }
}

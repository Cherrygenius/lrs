package timus.sem1;

import java.util.Scanner;

public class Example1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        boolean[][] dp = new boolean[n + 1][totalWeight / 2 + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalWeight / 2; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= weights[i - 1]) {
                    dp[i][j] |= dp[i - 1][j - weights[i - 1]];
                }
            }
        }

        int minDifference = Integer.MAX_VALUE;
        for (int j = totalWeight / 2; j >= 0; j--) {
            if (dp[n][j]) {
                minDifference = totalWeight - 2 * j;
                break;
            }
        }

        System.out.println(minDifference);
    }
}

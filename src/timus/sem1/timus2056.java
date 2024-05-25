package timus.sem1;

import java.util.Scanner;

public class timus2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }

        boolean hasThrees = false;
        boolean hasFives = true;
        double average = 0;

        for (int grade : grades) {
            if (grade == 3) {
                hasThrees = true;
            }
            if (grade != 5) {
                hasFives = false;
            }
            average += grade;
        }

        average /= n;

        if (hasThrees) {
            System.out.println("None");
        } else if (hasFives) {
            System.out.println("Named");
        } else if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}


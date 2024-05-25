package timus.sem1;

import java.util.Scanner;

public class timus2142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        boolean enoughMana = false;

        if (X <= A && Y <= B) {
            int remainingMana = X + Y + Z;
            int remainingLands = A - X + B - Y + C;

            if (remainingMana <= remainingLands) {
                enoughMana = true;
            }
        }
        if (enoughMana) {
            System.out.println("It is a kind of magic");
        } else {
            System.out.println("There are no miracles in life");
        }
    }
}

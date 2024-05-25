package timus.sem1;

import java.util.Scanner;

public class timus1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLockCode = scanner.nextLine();
        String secondLockCode = scanner.nextLine();

        boolean canUnlock = false;

        for (int i = 0; i <= 9999; i++) {
            String code = String.format("%04d", i);

            if (!code.equals(firstLockCode) && !code.equals(secondLockCode)) {
                canUnlock = true;
                break;
            }
        }

        if (canUnlock) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

package timus.sem1;

import java.util.Scanner;

public class timus1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = countLuckyTickets(N);
        System.out.println(count);
    }

    public static int countLuckyTickets(int N) {
        int count = 0;
        count = isLuckyTicket("", 0, N, count);
        return count;
    }

    public static int isLuckyTicket(String ticket, int index, int N, int count) {
        if (index == N) {
            if (getDigitSum(ticket.substring(0, N / 2)) == getDigitSum(ticket.substring(N / 2))) {
                count++;
            }
            return count;
        }

        for (int digit = 0; digit <= 9; digit++) {
            count = isLuckyTicket(ticket + digit, index + 1, N, count);
        }

        return count;
    }

    public static int getDigitSum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }
}

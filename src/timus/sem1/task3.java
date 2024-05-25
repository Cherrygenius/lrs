package timus.sem1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        if (f >= 1 && f <= 11){
            int remainingTasks = 12 - f;
            int timeLeft = 5 - 1;

            if (timeLeft*60 >= remainingTasks * 45){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

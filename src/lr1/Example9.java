package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц:");
        String mounth = scanner.nextLine();
        System.out.println("Введите количество дней в этом месяце:");
        int countDay = scanner.nextInt();
        if (countDay == 31) System.out.printf("%s содержит %d день", mounth, countDay);
        else System.out.printf("%s содержит %d дней", mounth, countDay);
    }
}

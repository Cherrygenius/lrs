package timus.sem1;

import java.util.Scanner;

public class timus1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bottles = scanner.nextLine();
        String[] bottlesArray = bottles.split(" ");
        int bottle = Integer.parseInt(bottlesArray[1])-1;
        int bottle1 = Integer.parseInt(bottlesArray[0])-1;
        System.out.println(bottle + " " + bottle1);
    }
}

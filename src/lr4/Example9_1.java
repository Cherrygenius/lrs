package lr4;

import java.util.Scanner;

public class Example9_1 {
    private static final String alphabet = "qwertyuioplkjhgfdsazxcvbnmцукенгшщзжэхълорпавыфячсмитьбю";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int key = scanner.nextInt();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                int index = alphabet.indexOf(chars[i]);
                int newIndex = (index + key) % alphabet.length();
                chars[i] = alphabet.charAt(newIndex);
            }
        }

        for (char x : chars) {
            System.out.print(x);
        }
    }
}

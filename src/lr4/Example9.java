package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {
    private static final String alphabet = "qwertyuioplkjhgfdsazxcvbnmцукенгшщзжэхълорпавыфячсмитьбю";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String s = scanner.nextLine();
        char[] arrayAlphabet = alphabet.toCharArray();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = 0;
            if (Character.isLetter(chars[i])) {
                for (int j = 0; j < arrayAlphabet.length; j++) {
                    if (chars[i] == arrayAlphabet[j]){
                        index = j;
                        if (index % arrayAlphabet.length + key >= arrayAlphabet.length){
                            chars[i] = arrayAlphabet[index % arrayAlphabet.length + key - arrayAlphabet.length];
                            break;
                        }else {
                            chars[i] = arrayAlphabet[index % arrayAlphabet.length + key];
                            break;
                        }
                    }
                }
            }
        }
        System.out.print("Текст после преобразования: ");
        System.out.println(String.copyValueOf(chars));

        System.out.println("Выполнить обратное преобразование? (y/n)");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.nextLine();

        if(answer.equalsIgnoreCase("y")){
            System.out.println(s);
        }else if(answer.equalsIgnoreCase("n")){
            System.out.println("До свидания!");
        }else {
            System.out.println("Введите корректный ответ");
        }
    }
}
package timus;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int emperorPenguins=0;
        int littlePenguins=0;
        int macaroniPenguins=0;
        String result;
        for (int i =0;i!=total;i++) {
            result = scanner.nextLine();
            if (result.equals("Emperor Penguin")) {
                emperorPenguins++;
            } else if (result.equals("Macaroni Penguin")) {
                macaroniPenguins++;
            } else if (result.equals("Little Penguin")) {
                littlePenguins++;
            }
        }
            if (emperorPenguins>littlePenguins && emperorPenguins>macaroniPenguins){
                System.out.println("Emperor Penguins");
            }
            if (macaroniPenguins>littlePenguins && emperorPenguins<macaroniPenguins){
                System.out.println("Macaroni Penguin");
            }
            if (emperorPenguins<littlePenguins && littlePenguins>macaroniPenguins){
                System.out.println("Little Penguin");
            }
        }
    }



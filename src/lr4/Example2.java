package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 10;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
package lr4;

public class Example4 {
    public static void main(String[] args) {
        int height = 10;

        int[][] array = new int[height][];

        for (int i = 0; i < height; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package lr6;

public class Example3 {
    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static double findAverage(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum+= number;
        }
        return (double) sum / numbers.length;
    }
}
